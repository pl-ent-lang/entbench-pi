package org.apache.batik.ext.awt.image.renderable;
public interface ColorMatrixRable extends org.apache.batik.ext.awt.image.renderable.FilterColorInterpolation {
    int TYPE_MATRIX = 0;
    int TYPE_SATURATE = 1;
    int TYPE_HUE_ROTATE = 2;
    int TYPE_LUMINANCE_TO_ALPHA = 3;
    org.apache.batik.ext.awt.image.renderable.Filter getSource();
    void setSource(org.apache.batik.ext.awt.image.renderable.Filter src);
    int getType();
    float[][] getMatrix();
    java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    long jlc$SourceLastModified$jl7 = 1471109864000L;
    java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAAL0ZC3AbxXUlf2PH8SdfQuwkjgPjABLhHxwCtrETpbKtsZ20" +
                                          "OBDlfFrJl5zujruVrYSmfDotKbRMSMOnLXiYNjSBCZ9hYGhLoem05TNQZghp" +
                                          "KWUgFBgKBQZSpqVT2tL3du90p5OsEAJ4RqvV7tu37//ePu9/j1RYJmmhGgux" +
                                          "rQa1Qj0ai0mmRRPdqmRZw7AWl28pkz7c+Fb/iiCpHCEzxiSrT5Ys2qtQNWGN" +
                                          "kGZFs5ikydTqpzSBJ2Imtag5LjFF10bIbMWKpA1VkRXWpycoAqyXzChplBgz" +
                                          "ldEMoxEbASPNUaAkzCkJd/q3O6JkuqwbW13weR7wbs8OQqbduyxGGqKbpXEp" +
                                          "nGGKGo4qFuvImuQUQ1e3plSdhWiWhTarZ9siWBs9u0AErffX//PjnWMNXAQz" +
                                          "JU3TGWfPGqSWro7TRJTUu6s9Kk1bl5NvkLIoqfUAM9IWdS4Nw6VhuNTh1oUC" +
                                          "6uuolkl365wd5mCqNGQkiJHF+UgMyZTSNpoYpxkwVDObd34YuF2U41ZwWcDi" +
                                          "TaeEd9+yseGBMlI/QuoVbQjJkYEIBpeMgEBpepSaVmciQRMjpFEDZQ9RU5FU" +
                                          "ZZut6SZLSWkSy4D6HbHgYsagJr/TlRXoEXgzMzLTzRx7SW5Q9q+KpCqlgNc5" +
                                          "Lq+Cw15cBwZrFCDMTEpgd/aR8i2KlmBkof9Ejse2rwAAHK1KUzam564q1yRY" +
                                          "IE3CRFRJS4WHwPS0FIBW6GCAJiPzp0SKsjYkeYuUonG0SB9cTGwB1DQuCDzC" +
                                          "yGw/GMcEWprv05JHP+/1r7zhCm2NFiQBoDlBZRXpr4VDLb5DgzRJTQp+IA5O" +
                                          "Xxa9WZrz6I4gIQA82wcsYB7++pGLTm058KSAObEIzMDoZiqzuLxndMZzC7rb" +
                                          "V5QhGdWGbimo/DzOuZfF7J2OrAERZk4OI26GnM0Dg49fctXd9J0gqYmQSllX" +
                                          "M2mwo0ZZTxuKSs3VVKOmxGgiQqZRLdHN9yOkCuZRRaNidSCZtCiLkHKVL1Xq" +
                                          "/DeIKAkoUEQ1MFe0pO7MDYmN8XnWIIRUwYcE4LOKiL8FODCSDo/paRqWZElT" +
                                          "ND0cM3Xk3wpDxBkF2Y6FR8Hqt4QtPWOCCYZ1MxWWwA7GqL2BnilNsLCSBvWH" +
                                          "QR0JYGVUpRCoVN3sk8DCsoO4EEKzM77sC7MogZkTgQAoZ4E/NKjgVWt0FRDE" +
                                          "5d2Zrp4j98afFmaHrmLLjpHzgYaQoCHEaeCBFGgIcRpCLg0hPw0kEOBXz0Ja" +
                                          "hE2ARrdAbIDgPL196LK1m3a0loExGhPlqI8sd9YT+Y9yJDkvY/FU5AT/uHz3" +
                                          "8+f+Ye+NN08IY26fOsz7zs3794A6es1r/+KseuM23l1RxNF850fC+2+b373q" +
                                          "HX5+GoQ4JoFJQvRo8bt7noei3/tVAJHbxXvG3el/BFsrfxckVSOkQbbTwnpJ" +
                                          "zdAhCqG5RrGcXAGpI28/P6wJH+6wwwcjC/x0ea7tcGIwMl/tVT3MERrnddyM" +
                                          "GjnMLFQN6qoNPottZ+LfuDvHwHFulmu9kWsdSQpFIIqnqNn02h17Prr62vNA" +
                                          "dBFSMY6kg1QaXLj+DGafb++/qbl296vXo2YNB/VStCO/ZpDyC4aM2//07Ntn" +
                                          "BknQTSj1nkoApNfhCWKIrImHq0bXLIdNilJ++dbY929679oN3CYBYkmxC9tw" +
                                          "7IbgBRkZMtu3nrz8xcOv7DkUzNlxGYMsnhmFYggmFk+wDChTNEkVFj7rE/gL" +
                                          "wOd/+EEOcUFEpKZuOywuysVFA7ywdviSWE+8r3N4MPI1IKzV9Qwst4YyoxaL" +
                                          "mUoaOBy3E8IZsU3yjrbYG8I/TihyQMDN3hf+3voXNj/D5Vc9CjXfsKN3T4HV" +
                                          "aabsIgPHBhzOylol/c5HT3h70+Ett711j6DH72Q+YLpj93WfhG7YLeKRSPlL" +
                                          "CrKu94xI+z7qFpe6hZ/o/et92x/Zt/1aQVVTfgLrgfrsnj/+95nQra8+VSQy" +
                                          "lkFxApfMdM2o0zSlrRjcslcfbP7BE9LtZWjp5ZayjXJLDnD74CExXx+C64u/" +
                                          "U//LnU1lvUFSHiHVGU25PEMjiXyvrLIyox4FufWG66k2/2hTjASWGYZIA3Br" +
                                          "2xTa8tSlcXnnoQ/q1n/w2JGCAJnvVn2SIcTdiMNJKO65/ji/RrLGAO6sA/2X" +
                                          "NqgHPgaMI4BRhsxmDZiQNbJ5TmhDV1T9+de/mbPpuTIS7CU1qi4leiUsIaEQ" +
                                          "YGNQdY5BzsoaF14kYs9ENQwNPHsQbqEthXGq1Y5TrUXiFE5ORqXgpI//XMbH" +
                                          "03A4XTg0TpfjcAYOZ3K2z2KkjjvlUOfwusHO4R5cXCEkjeNqHPqFw689FmqX" +
                                          "2NQuKUFtECfrjo3aek7tmnU98cGB4SnoXf8Z6G2z6W0rQS+n6bJjo3cupze6" +
                                          "ri/S39nf3RMfHoh3RmNrOovRvbEE3dlS1zJSLUEoNMHCGJmWe20IGjzliGBl" +
                                          "HiNdn74c6lVUQMeLIkyAJjgfdyR0leapngA8Ku25ZvdkYuDO5RiV8N4LgTam" +
                                          "G6epdJyqviKpOa9I6uOPHreqeHnGrtd/3pbqgpASJU3AZUZSMeBAPIenn7zF" +
                                          "fh1Nx7jvPrkXeZ7c2CswdZkm4MU31dPbxlKtj1MT1xmZ5cHgBDgsgZZNnS/8" +
                                          "pD9xzd/mD68a28QTU0GhBm9DPBnDZ3Hu+bvQJ1U/yrv69j+1+iR5V5C/CEV5" +
                                          "VPCSzD/UkR9+a0wKT1/NDbiQiwuSjE9acXnZIumh+KPb27gW3JoRMSz2VWC1" +
                                          "Sd1MSype4Ii1BsKePuGu+MqxWjRznLTbjtjud0TXWQq8IJhzvpRt8yY5yQ3J" +
                                          "YLwqFJMo9bZ1GqhWSSpo25jj/lO/dPlD797QIDKjCiuOGk49OgJ3/YQuctXT" +
                                          "Gz9q4WgCMjYD3CTjguELE/F3cfcWzwX8fSVfvaLo3tU4TIDvpCgbEi8q24tP" +
                                          "P1YvdkNN9mgh0ktFwQJWlQuLi6cnbTBePGz72dwHV+6dfIVXlIJrIz/stsAn" +
                                          "bGs7fFzazheeXZ/gz29ygJ0lpLsLh+tBulaedM+3qy/8WsVI+biuJFzpfff4" +
                                          "pIcL1/lFgihIPXzOsUVyzucoEi/Hd5TY+zEOP2KkCmzNiQ4rXL5v+wL4noF7" +
                                          "c+Gz0uZ75RfE9z0l9u7DYZ/wMfH0z281514bvDYWde6ltY//yvrJmw+IorvY" +
                                          "W8bX3Nq3t1p+Kf34G04+PC8ng9lIyHz43GjLgH8zMnacfZZRU0mkaHho/epe" +
                                          "6mlrYM8XUHTxXaen86XdhaJdOnUC9Uh48qdLnr1ycslfeMVdrViQpCHjF2k9" +
                                          "es58sP/wOwfrmu/lSaocCwKe4fw928KWbF6nleunHocHhR0/nNMVqokshM/J" +
                                          "tq5OFrr66nHKD46lRf+rE2a8RnBU80WhFqyd6wl1vrAHOV2XWLHA2pP1r4rC" +
                                          "GodHsgHCXfe3R3PaXJVcqVItJVqdF+DwC8PFHxSHnKQ30220dKu6RjG9OXui" +
                                          "RafooVy3HzaLU2oISvllxcnkfC4/alg5WGLvEA7PghxlpFQwVgL8halCZpYY" +
                                          "hkFK6IFH57s+j+icZaTB3wHFdD+v4H8y4v8I8r2T9dVzJ9e9IBzO6fVPhzo6" +
                                          "mVFVbyfOM680TJpUONPTRSEonvevMtL+qYsahnWs84Pzc1hgeZ2RltJYQCX8" +
                                          "23vqTUbmTXWKkTIYvdBvg7UVgwZIGL2Q74JE/ZBwP//2wr0P/Lhw4BNi4gX5" +
                                          "O2AHEJx+aBjZgOcRRTyGMPtohpA74m0OIqv8/3NOGsuI/9DF5fsm1/ZfceSc" +
                                          "O0VzUlalbdsQSy0ETVHn554ui6fE5uCqXNP+8Yz7py11kmCjINjN8Sd6HOI6" +
                                          "sHIDrW++rztlteWaVC/uWfnY73dUHoQksYEEJAgQGwrbyFkjA2/MDdHCfhXk" +
                                          "FF7Kd7T/cOuqU5Pvv+T0awP5rXs/fFw+tPey53fN2wMlf20EzAkMMcv72xdv" +
                                          "1QapPG6OkDrF6skCiYAFolFeM2wGOoqE/7njcrHFWZdbxecXI62FzcLCN2yN" +
                                          "qk9Qs0vPaAk71dW6K052y3v9ZQzDd8Bd8eS/i0UyEOmtLB7tMwynw1vxpsHj" +
                                          "RU/xmARjoJxPcVbxfyAL2vW7HwAA");
    java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    long jlc$SourceLastModified$jl5 = 1471109864000L;
    java.lang.String jlc$ClassType$jl5 = ("H4sIAAAAAAAAAL16ecws2VVfv+/N8mZ9b8bLTAbP2DPzbDRu+6vu6j3jGFdX" +
                                          "19ZdVd219FYBP9fe1bVvXd1FjMEh2MLIWDAGg+wRf4xZB+NEWBBFwERRMAiE" +
                                          "ZAQhQQpjFpEQY8VOlBDFAXKr+tve95bxywRaqtu37j333N+595xzb91zX/5q" +
                                          "5e44qlQD39mZjp8c6tvkcO20DpNdoMeHQ7o1kaNY11BHjmMRlF1Tn/n85f/5" +
                                          "jU+srhxU7pEqb5A9z0/kxPK9mNdj39noGl25fFqKObobJ5Ur9FreyFCaWA5E" +
                                          "W3HyPF154EzTpHKVPoYAAQgQgACVECDklAo0ekj3UhctWsheEoeV76pcoCv3" +
                                          "BGoBL6k8fT2TQI5k94jNpJQAcLhUvM+AUGXjbVR524nse5lvEPiTVeiFH33/" +
                                          "lX9xsXJZqly2PKGAowIQCehEqjzo6q6iRzGiabomVR7xdF0T9MiSHSsvcUuV" +
                                          "R2PL9OQkjfSTQSoK00CPyj5PR+5BtZAtStXEj07EMyzd0Y7f7jYc2QSyvvlU" +
                                          "1r2EeFEOBLzfAsAiQ1b14yZ32ZanJZW3nm9xIuPVESAATe919WTln3R1lyeD" +
                                          "gsqj+7lzZM+EhCSyPBOQ3u2noJek8sQtmRZjHciqLZv6taTy+Hm6yb4KUN1X" +
                                          "DkTRJKm86TxZyQnM0hPnZunM/HyVfc/Hv9MjvYMSs6arToH/Emj01LlGvG7o" +
                                          "ke6p+r7hg++kf0R+86989KBSAcRvOke8p/mlf/L1973rqVd+Y0/zLTehGStr" +
                                          "XU2uqS8pD3/pLehzvYsFjEuBH1vF5F8nean+k6Oa57cBsLw3n3AsKg+PK1/h" +
                                          "f3353T+rf+Wgcj9VuUf1ndQFevSI6ruB5egRoXt6JCe6RlXu0z0NLeupyr0g" +
                                          "T1uevi8dG0asJ1TlLqcsuscv38EQGYBFMUT3grzlGf5xPpCTVZnfBpVK5V7w" +
                                          "VC6A572V/e8tRZJUXGjluzokq7JneT40ifxC/hjSvUQBY7uCFKD1NhT7aQRU" +
                                          "EPIjE5KBHqz0o4rCMuUsgSwXTD8EpkMDoiiODgEp/IiRgYZt+aLgsFC74O+7" +
                                          "w20xAleyCxfA5LzlvGtwgFWRvgMYXFNfSPvY1z937bcOTkzlaOySyj8EGA73" +
                                          "GA5LDKVbBRgOSwyHpxgOz2OoXLhQdv3GAsteJ8CM2sA3AK/54HPCdww/8NFn" +
                                          "LgJlDLK7ivnYlsb6ePlyL2j33K09OV64Eap0nSrQ7Mf/99hRPvwn/6vEf9YZ" +
                                          "FwwPbmI959pL0MuffgJ971fK9vcBv5XIQM+AS3jqvA1fZ3aFMZ8fV+COT/nC" +
                                          "P+v+j4Nn7vm3B5V7pcoV9cjXz2Qn1QUd+Nv7rfh4AQDrwXX11/uqvWE+f+QT" +
                                          "kspbzuM60+3zx461EP7us/MJ8gV1kb+/1I2HS5pHwHiXE3AVPE8fWUj5X9S+" +
                                          "ISjSN27LqXyknMoC0iEFXLOpR4/+yU+89Fff85EuGDqqcvemgA5G5copHZsW" +
                                          "S8r3vfzJJx944csfK3xPcMz66UI5zs9MgfwfCcFn/v3v/EXjoHJwukpcPrPu" +
                                          "gtF7/oxnKphdLn3QI6e6JkZ6Mcr/8VOTH/7kVz/yj0tFAxTP3qzDq0WKAo8E" +
                                          "llmwXP2z3wj/w6t/9NLvHZwo58UELM2p4lgqyMTlqpkAZJYnO3u1feRvwe8C" +
                                          "eP6meAoJi4K9m3kUPfJ1bztxdgEwrQfE5QS7xiAiTy1ur+6TyHKBoJsjZw99" +
                                          "8NFX7U//55/fO/Lzun2OWP/oC9//t4cff+HgzPL57A0r2Nk2+yW0VJCHiqS2" +
                                          "Beievl0vZQv8P/3CB//VT3/wI3tUj16/GGBgr/Pz/+6vf/vwU1/+zZt4mYtg" +
                                          "oS+dFejp6i3G4czu6Zr6id/72kOzr/3q12+w+Ov1hJGDvSAPF8kzhSCPnfdG" +
                                          "pByvAF3zFfbbrzivfANwlABHFfjfeBwB37a9TquOqO++9w//9b958we+dLFy" +
                                          "gFfud3xZw+ViowOWq2QF9kYr4Fm3wbe9b29M2SWQXCl9XKXUlm+50fCeOTK8" +
                                          "Z25ieEXm2WIJKzJI+fqOMn2uSN6119Ai++4iOSwSqBS7llQeKrVMQMQpj4hY" +
                                          "Udjej3SRPl8k/b0Gv/dO0D57hPbZ26A9KDLUnaG9XKIlp9g1fizeAu/w/wHv" +
                                          "1SO8V2+Dt8TE3Rnex0q89JShWIRFsWvi+BpCT0jkZrj518S9t7YLF4BrgQ87" +
                                          "h7XifXmHgNaOevXY38zAXh4YxdW10ynbvyk565n3G+BzIGvfNEhgSw+fMqN9" +
                                          "sJf+2J994rd/8NlXgQkNj9eCghoM+oXZ937jifcVL8qdyfNEIY9Q7odoOU4Y" +
                                          "X7PAN4R2IlLjDOhOAjaI/usQKbnyINmMKeT4R9cktIEo28XUMeAJ2RU0g0sz" +
                                          "e21O1kifXpHbDE0iTAyUURJLcG3cHzgGHg2dVp6uo3QWLQXXGPjJSOEZgRl7" +
                                          "9MJasmuhj0q91ZJY0b7u1loiy0nmKhjNpybeN0d9ThKCcCbCCd3Q0l4taI1j" +
                                          "DBk2+XAz6yRpowNB+iTtQes6vxy67oow023EyXVuXZOtmuvy/EQLXV7KOsjc" +
                                          "gbuBnXfUKq5AloUGJIrlW0uIxNYyhsOEY+cEaxMSHrcse6eJYZAL/SFMuYls" +
                                          "tug1jtdrCqUw81GA1Gc2v5gHO9VHwt0iR1eB0zdzR8MYf4spiDBhpzJi56g9" +
                                          "1KCwMW4P7TTMlHm9kel8J1Pi7pgLFS3dbQkiHCnBAgs8ghgRfjPE0w3lptyU" +
                                          "q+uNwBG01dyar0Q5knqxNe/HvbSGYJFhLCBosvbmDLtAuHw4bYjE3JgQoTCP" +
                                          "/I7ID8Vp2o57I7uuOC12Y9OUHxpThOlRc01osll7tkpZcVX3p2g7TX3Hdhrt" +
                                          "Vqa1XDRkCc62hiRenZrMThIFNvCXwdbOZoOxojWayxSHp826lM3VgSXKOqb1" +
                                          "qrtYJ/qMQ0Fc6s8Ubj20lxjVD3TGxEAaCPLMVS2OZ9YBjg0krsdPW/hUktKk" +
                                          "LUi0MLeFXXPQJhXSXMayOYwg0eEXPrYwcyanxZzfdoR5i+uF1VGAho7Jqi06" +
                                          "rKJZvaX2MynC0QEjYoGpQTLfteCR4/Zt3+hh61iHowxByFF9NM1lt9VuhvUd" +
                                          "v6SwBsrj/FBozslsItRwqj9vEygytCZ5UBNG8Xpp68t06ntETej3VJHI+vUB" +
                                          "l6KDHN0RGUQwKjYPok2tNSQnVagedfIV6sIsbnF9f+D0JX4RRM3ZgFZaAzMH" +
                                          "M8EFVQppjRdbuTeXorxNNU2KQ7pwpsbLfqdaDQhaBGrfHQnIWMGonBn4khXm" +
                                          "Kb31NEbK0U6kzFrcitDmhGK5PjTIx6lk4J0hPI4QjJfs5piC24TH1AZms2eo" +
                                          "yULrDWtmuHQ5wXEWDOxmfk2SxG06EuLGbDYau1vCtLhQ4mmNZHu7sY2mEs/L" +
                                          "rKUJqJSgFm2ToxldX4TQQKdGiO1PMa7O4HotGHeYwdJluwtvTlH8NFuqWJMe" +
                                          "jyy6i48HqDDwoUDmw7mEOSI7qKlMY2E3smCw7ds4vGzjfJcMkyaXTOZjFF1K" +
                                          "dWY7n2dIhwhpuO9ZDhvTqNDfzEmOrw2XxGwa8Kg/Yxux3R2gsT9uYtgoZzqd" +
                                          "GO0wvinZoskhvtTEIHa0NmfzpIbzA6ylwVIUNNe9rmzgrkxGLk2vAzI3lzLn" +
                                          "oyQm62gfJ0xK5QOUNmurSVazsXF/kdeG8gqDET7SEIUamBO63mvTo7rbkGuO" +
                                          "j22J1cQJqW6s9ZZiddnbDQf2Zgnh0xYiQimZN7pVo7rUqyxb61JLuG2M47yT" +
                                          "x41Or4m09bgeQdVRrKcM3HDq/JbFu62agVbhqtLoNEJy0aoSPtcc+viQ2/B+" +
                                          "V0k6nq9bDSiZIUMS+NsN0dAdqI/HkbFV7ZkwtjlFETMvGOYaskJDosVHhLpA" +
                                          "iICCu9CknQ3JajvLMnWNQtuaLncSlaAyxgEMxQaD8ZGnaTuGWHsMjXNsO/TZ" +
                                          "iZ8kUpU20sGGzEg8ddy0Z89jTeACnKJCL2S9GryqdyZR1IY3LKL1cYFZtm2z" +
                                          "zskLel0dELKhVKtQqDhwr71Z+PCS7UMzIUHHkBQMdmhTZmAIqnXYxOvbHicK" +
                                          "67pn+0jAGit0PqIiyiXDmrKgKY21nGG1qinLHuDU6flsA132l7a7RXtJ1qEU" +
                                          "s8/bEgN8vxfl3a063nQG9jRnnS2xZGJv5eJL03Rxu5oN0JXIYvYMX3ciDDLp" +
                                          "bKxBVQwbq1McC0ZSOt5l6S6e4Uhnl2kbS5hj1W7UYJvMhKpTo3zW47I4aS53" +
                                          "/lam3akvj/u7BtalpHja2K0jZUl0KUi0VjuOGbCNlVFtbPwFu4YGrZnaQ9cL" +
                                          "Ix6xDbFJzmRZiSlzQvZX+Xjn+A6ktkixserUqliSdOr1dXtAdmCuuqSDda8x" +
                                          "N1ZEZ0nrI16YODQajdJec0tV806IB3p7JUE+pCc9eAtJCVSXudlMNEw6Mo0o" +
                                          "9tZQtdfyuEjuVmcCt3NsfIsEBqMxsF/LBSfi12rsqIYy6fSxHp1I83XQkuTd" +
                                          "ejGkB96g00Sx7WJbRdvNFJpCEO1N685migukRc6IKdyaYMzaWuw2EU2BMWni" +
                                          "qTEn2m0bhuCVuEaEObGUKKTRj+CtKHcTwVEX4DuEg8K6B2XwsHCy3mbmwQKl" +
                                          "iprFsMPRuN2C1hbERzSBjNsxAsELNjTJiSkzVLPPr+KtO5AsjlWGLdFdDWZ1" +
                                          "sVfVdMhVJkEqUkIHndZDq+no1jSmZIxbEiynLVv9PPZlvN60l3EPY7mMnZAx" +
                                          "p4RYsloQYX3ZEqPpwsKx1pgPF2ZAQdCCUchaA2kuRLMmBsZaRZZjqTGCc3hk" +
                                          "r9cbZzo2sjQmx02+pS5QzF7rbEhOQjxrd3u4Gy5glktHUzzBUCNa+w1ZtzuJ" +
                                          "6017XZXoNwXPXxhdqU3AeXteizih6rWVISBT0yDX25EFCY2eZzR4xiD9VYN3" +
                                          "2Wjsb/iNgmENzRHq+VCgp5jPMiRKDN25DtcoYp07FtF3SIvVvE5TbTuzKcfo" +
                                          "NGXvkOHaNLQdX3N0OfBMpDtK4Za00exlOhi3eGvWZZu0Kcou0dYDbbgLN9Yo" +
                                          "GMs9qp2OJ2SkhzrpEVGiQY1ACc0AEcDeApGmksDofWRC6Z7XyXFjVWe3nfVm" +
                                          "EtkLXeqoMBpnmmS7TWbaqGsTZeuMknWdEetbV2qppNkfmLEpSawnQN1g0Nvm" +
                                          "GuQO2l0Z7nLitEas+m5vMOl7A6lBplVlww3rU2gXbdq9dbVetfjWrIVCKDZr" +
                                          "zSaokA+gqc33qnItG4l1iB0oFmdlqbDGejLQN4lK3VV1NFHgjjlvDH2w0czh" +
                                          "2RytC1qdEcB3c5Oy6v14BPaMRFplwu18zeceLSrrZJ1qNXEx58IuNVzlm4BP" +
                                          "urtla8c1hks6C/Eh4/cUqU6Eq7kgBD7cWq8hZwxpE2fQ6XU4ajBao1Y6Juxm" +
                                          "b2wOG9CSS8FaLBJ5L2zOTZRZLwcNVFybKUZjEN5QDXWeZ4uuIcyMjUz7jWTa" +
                                          "FKnBJkBNBbO6IdxMJpP6Eswcy/Zcc1WzEzzjhnOHS2mrrXqK2NcnRN6BtYyc" +
                                          "VduaQc0WDjWMqByKkxjxFCLuGHgu5ytdX0iQmcO9nTmsOQEd06tq0k8dWdeY" +
                                          "aiPcQd15PKOqipUO8TwwDKMZUCpdhxzctFbUZJGP4+lsl6eqj1kQqbXEZTXH" +
                                          "xhNgG6ibsxbXjBZ0a1PN6Kbn42BzTeS1VOq0eAPr5TWnl3YGSwnKgHbXcrhb" +
                                          "b9WbymawnGt620mWEAS8ydDNqpQfbZbzrrJosGEjqQfVkdFoErVmdYJ2PbPn" +
                                          "UDsybzaINW2S3ZzxZNWQJH5ac22ZXAF/CByj60RLpruYkuJ2Ietet73QVvJQ" +
                                          "G3tTtDddNbuhRntRfQccoKEzMy2aWVyAkmsctnt63OrGEygbZ0bkppAjyL6K" +
                                          "ZiO9aWQ9uDuaK3jbc/TUI32VXPE1yGOZWejb8YqBhknYGuNgTWx75GjQbDu8" +
                                          "UY0wWO7yXn/arc1XeLjT2plT30QIOZ7BizlNInAwqUfNCCV8jYxNEl0YeoNv" +
                                          "TOTFcKaGMyoZzkINrw4ytDvBya1AeiOuUYPhmjZK2/ya6I0XqcXLhu/Pdg0y" +
                                          "l+kp7FPCxnG2qmcbaBOSHbM1J+gNhnQm5mrrBDiXzUy6u5IdVAqWy5WNj9oU" +
                                          "TrY6cXVdtVRJFvsNsOhrg+qmSXZ3zU2X6kaw2NNm+bCn96h+Pm4bs8kq99vu" +
                                          "DJ8pO2PMtLs1cRhMx+xE5AXM9zb6hknoagg28StvHnebk1ytr0xdgnknGS45" +
                                          "dNGFG5tQnCousLKRLVJAufsbszOdmZlEETTMdZpDDJL62QSC4CyqTSB6lTX7" +
                                          "rNU0F60xjJDYcFuV+2vJHKs8L+4IZpL4qwDpNN3amAo3XajBjok4paDeAG8Z" +
                                          "sVuHJEPVBXVcm+VTR3YULeaEXQ0TZ6TXajVTq21grRQNF+yk2l3mnWBXr9su" +
                                          "uqbYNQu+bdvkmGrHJDWI5tVqlCdOos/lGQqlc8NbdhralPQ5O15i2BAxOSKL" +
                                          "lB1urxEYYgYaiRqrhY3jnZHWESF1nIbT1mSzqYo1OZu0okUMGXhWTSb6rtUw" +
                                          "WBjszAy4huWIzTDqpgNvtQ3YVgUToj22BxHejm3UWiK47+A6A2fE2A8xqOOt" +
                                          "1YjE55KmbHV1QbVhPFdplIV3bGj3uLi2mYBP0E5dm7dHtRa8a2x6EpcPtG5f" +
                                          "6+oCZNWmO2zsJnS/kzDZzsvqm20Qk2t+Cm1dhF/7w+1EnSlbY4fQ8GbeIcG3" +
                                          "VHEs4N7ZccUj5fHLSTBy7XSKivffwYnE9nYdJpVLYG+VRLKaJJX7TqKj+97P" +
                                          "hE8uHB/39L/58A1ugQmPyiBOcbYfBb5THqkWh6ZP3ipkWZ78vvThF17Uxp+t" +
                                          "Fye/Rb9dgC3xg3c7+kZ3zqC6C3B6561PuZkyYnsaPfnih//LE+J7Vx8oowA3" +
                                          "RHXoyv1Fy0kRGD8JgL/1HM7zLH+Gefk3iXeoP3RQuXgSS7khlnx9o+evj6Dc" +
                                          "H+lJGnniSRwlqjxzw9G4r+paGumn/b7zbfIXrv3KB68eVO46G2AqODx5Llzz" +
                                          "gOFHruwUHRwHr+9PVpGfnZaci908UCjOG8Hz3NEh53PnDzlP1e8GvTo4UeTN" +
                                          "kRZFlXecHncDdXB0tRz1q1PPLU/fCm0pQnj/5/Lb61/4y49f2Z/nO6DkeBre" +
                                          "9doMTsv/Qb/y3b/1/r96qmRzQS2uA5we4J+S7WPMbzjljESRvCtwbL/nd5/8" +
                                          "sS/Kn7lYhKDuiq1c34eYjqKKBagfKMX+SJl+7Fzdx4vknwKVNfVkf9B4bDy1" +
                                          "OzWeUwv/3tc6czyLoiz40PWH1k+BBzqaT+h1zef1kl/Y+4fi9RMlwY/fZmg+" +
                                          "XSSfBEMTXzc0589cN76lnYr+I69D9IK0chk87SPR2/8fRT8r2c/cpu7niuSl" +
                                          "pHIvUIhjO2+fyvfZ1yHfw0XhY+B5z5F87/k7ku8Lt6n7pSL5/F7h9+F6YFhv" +
                                          "v7VfLg1tH0x88Sef/Z0PvfjsH5dBsktWPJMjJDJvcqflTJuvvfzqV373oSc/" +
                                          "V/q+uxQ53jvO85eBbrzrc90VnhL5gycD+WAhTZGJjgay/E8qq9d5wUKJLM3U" +
                                          "IWFG4PqZ+wzF1S/Aol/WHl/m+Hvra69F//JE+CcKWd8Knm89Ev5b98LPXycg" +
                                          "0Mzd3yRBQK5ca49l/btivb2ZQwHroS8n513Waajmle2FSmkuX3wtQznZl93j" +
                                          "6J65vxJUhuV+Ldie8D/YNzr2+m84DWqhju/phX8/rttfZbH8w5NbcaBye1Ok" +
                                          "H9ojLTu7OczSCb/7NU35929T9wdF8iUwYmqBdC/Ybcj/cFsJgqBy6sv++Z34" +
                                          "sm1SuXL+jk+xJj9+w63D/U059XMvXr702IvTP9hb/vFttvvoyiUjdZyz11LO" +
                                          "5O8JIt2wSrj37Tc6Qfn35aTy3De9HifFPu34pRTk1T2XP00qT92eCxjM8v9s" +
                                          "qz9PKo/fqlVSuQjSs9R/AfTkZtSAEqRnKf8SjOh5StB/+X+W7r8CeU7pgDbv" +
                                          "M2dJ/hvgDkiK7H8Pgu2FM9vuo1WonPBHX2vCT5qcvSlTiFreQD3eVqf7O6jX" +
                                          "1F94cch+59fbn93f1FEdOc8LLpeA997vY0+25k/fktsxr3vI577x8Ofve/vx" +
                                          "Z8TDe8CnK+IZbG+9+Q4Tc4Ok3BPmv/zYL77np178o/IGz/8F97m2KxosAAA=");
}
