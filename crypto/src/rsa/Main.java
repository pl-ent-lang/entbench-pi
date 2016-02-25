/*
 * Copyright (c) 2008 Standard Performance Evaluation Corporation (SPEC)
 *               All rights reserved.
 *
 * This source code is provided as is, without any express or implied warranty.
 */

package crypto.rsa;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.Cipher;

import crypto.Util;
import io.Context;

public class Main {
    
    final static int level = 1;
    
    static PublicKey rsaPub;
    static PrivateKey rsaPriv;
    
    public byte [] encrypt(byte[] indata, String algorithm) {
        
        try {
            Cipher c = Cipher.getInstance(algorithm);
            byte[] result = indata;
            
            c.init(Cipher.ENCRYPT_MODE, rsaPub);
            result = c.doFinal(result);
            
            return result;
            
        } catch (Exception e) {
            throw new RuntimeException("Exception in encrypt for " + algorithm + ".", e);
        }
    }
    
    public byte[] decrypt(byte[] indata, String algorithm) {
        
        try {
            Cipher c = Cipher.getInstance(algorithm);
            
            byte[] result = indata;
            
            c.init(Cipher.DECRYPT_MODE, rsaPriv);
            result = c.doFinal(result);
            
            return result;
            
        } catch (Exception e) {
            throw new RuntimeException("Exception in decrypt for " + algorithm + ".", e);
        }
    }
    
    public void runSingleEncryptDecrypt(String algorithm, String inputFile) {
        byte [] indata = Util.getTestData(inputFile);
        System.out.println("Algorithm=" + algorithm + " indata length=" + indata.length);
        byte [] cipher = encrypt(indata, algorithm);
        byte [] plain = decrypt(cipher, algorithm);
        boolean match = Util.check(indata, plain);
        System.out.println(algorithm + ":"
                + " plaincheck=" + Util.checkSum(plain)
                + (match ? " PASS" : " FAIL"));
    }
    
    public void runMultiEncryptDecrypt(String algorithm, String inputFile) {
        int blockSize = 64;
        byte [] fullIndata = Util.getTestData(inputFile);
        byte [] indata = new byte[blockSize];
        int pass = 0;
        int fail = 0;
        int check = 0;
        System.out.println("Algorithm=" + algorithm + " indata length=" + fullIndata.length);
        for (int i = 0; i + blockSize < fullIndata.length; i+= blockSize) {
            System.arraycopy(fullIndata, i, indata, 0, blockSize);
            byte [] cipher = encrypt(indata, algorithm);
            byte [] plain = decrypt(cipher, algorithm);
            if (Util.check(indata, plain)) {
                pass++;
                check += Util.checkSum(plain);
            } else {
                fail++;
            }
        }
        System.out.println(algorithm + ":"
                + " checksum=" + check
                + " pass=" + pass
                + " fail=" + fail);
    }
    
    public void harnessMain() {
        for (int i = 0; i < 10; i++) {
          runSingleEncryptDecrypt("RSA/ECB/PKCS1Padding", Util.TEST_DATA_3);
          runMultiEncryptDecrypt("RSA/ECB/PKCS1Padding", Util.TEST_DATA_5);
          // Run some more, in order to increase operation workload.
          runSingleEncryptDecrypt("RSA/ECB/PKCS1Padding", Util.TEST_DATA_3);
          runMultiEncryptDecrypt("RSA/ECB/PKCS1Padding", Util.TEST_DATA_5);
          runSingleEncryptDecrypt("RSA/ECB/PKCS1Padding", Util.TEST_DATA_3);
        }
    }
    
    public static void setupBenchmark() {
        try {
            Context.fileCache.loadFile(Util.TEST_DATA_3);
            Context.fileCache.loadFile(Util.TEST_DATA_5);
            
            KeyPairGenerator rsaKeyPairGen = KeyPairGenerator.getInstance("RSA");
            // 512, 768 and 1024 are commonly used
            rsaKeyPairGen.initialize(2048);
            
            KeyPair rsaKeyPair = rsaKeyPairGen.generateKeyPair();
            
            rsaPub = rsaKeyPair.getPublic();
            rsaPriv = rsaKeyPair.getPrivate();
            
        } catch (Exception e) {
            throw new RuntimeException("Error in setup of crypto.aes." + e);
        }
    }
    
    public static void main(String[] args) throws Exception {
        
        // Used to create 96 bytes random data for input
        // Util.createRandomTestData(Util.TEST_DATA_3, );
        
        setupBenchmark();
        Main m = new Main();
        m.harnessMain();
    }
    
}
