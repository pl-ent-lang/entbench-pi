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

import java.util.Date;

modes {low <: mid; mid <: high; };

public class Main { 
    int choice;
        
    public void harnessMain() {
      ENT_Util.initModeFile();
      int PANDA_RUNS = Integer.parseInt(System.getenv("PANDA_RUNS"));

      for (int k = 0; k < PANDA_RUNS; k++) {
				long startStamp = (new Date()).getTime()/1000;

        RSA@mode<?> rsadyn = new RSA@mode<?>();
        RSA@mode<*> rsa = snapshot rsadyn ?mode[@mode<low>,@mode<high>];
        rsa.init(); 

				if (choice == 0) {
          //rsa.runSingleEncryptDecrypt("RSA/ECB/PKCS1Padding", Util.TEST_DATA_4);
          rsa.runMultiEncryptDecrypt("RSA/ECB/PKCS1Padding", Util.TEST_SMALL);
        } else if (choice == 1) {
          //rsa.runSingleEncryptDecrypt("RSA/ECB/PKCS1Padding", Util.TEST_DATA_5);
          rsa.runMultiEncryptDecrypt("RSA/ECB/PKCS1Padding", Util.TEST_MEDIUM);
        } else {
          //rsa.runSingleEncryptDecrypt("RSA/ECB/PKCS1Padding", Util.TEST_DATA_6);
          rsa.runMultiEncryptDecrypt("RSA/ECB/PKCS1Padding", Util.TEST_LARGE);
        } 
        
			  long endStamp = (new Date()).getTime()/1000;

				ENT_Util.writeModeFile(String.format("ERun %d: %d %d\n", k, startStamp, endStamp));

				try {
					Thread.sleep(30000);
				} catch (Exception e) {
					System.err.println(e);
				}

			}

      ENT_Util.closeModeFile();
    }
    
    public void setupBenchmark() {
      choice = Integer.parseInt(System.getenv("ENT_SIZE"));

      try {
				if (choice == 0) {
          Context.fileCache.loadFile(Util.TEST_SMALL);
        } else if (choice == 1) {
          Context.fileCache.loadFile(Util.TEST_MEDIUM);
        } else {
          Context.fileCache.loadFile(Util.TEST_LARGE);
        } 

      } catch (Exception e) {
        throw new RuntimeException("Error in setup of crypto.aes." + e);
      }
    }

    public static void main(String[] args) throws Exception {
        
        // Used to create 96 bytes random data for input
        // Util.createRandomTestData(Util.TEST_DATA_3, );
        
        Main m = new Main();
        m.setupBenchmark();
        m.harnessMain();
    }
    
}
