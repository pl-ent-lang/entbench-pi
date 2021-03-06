package org.apache.batik.bridge;
public interface PaintBridge extends org.apache.batik.bridge.Bridge {
    java.awt.Paint createPaint(org.apache.batik.bridge.BridgeContext ctx,
                               org.w3c.dom.Element paintElement,
                               org.w3c.dom.Element paintedElement,
                               org.apache.batik.gvt.GraphicsNode paintedNode,
                               float opacity);
    java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    long jlc$SourceLastModified$jl7 = 1471109864000L;
    java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAALVXe2wcRxmfu/P7bSe20zwc27lEOAl3CqVIxSE0du3E4eyc" +
                                          "4sRSHZLz3O7c3cZ7u5vZWfvsElQqqrpIRFFwaUHUf7lqQX0JUQGCVkFItFUL" +
                                          "UktEKagtEkiUR0QjJPgjQPlmZvd2b+0Lf3HSzc3NfPPN9/x93zxzA9XaFPUR" +
                                          "gyXYkkXsxJjB0pjaRB3VsW2fhrWM8lgM//38B1N3R1HdLGorYHtSwTYZ14iu" +
                                          "2rNol2bYDBsKsacIUfmJNCU2oQuYaaYxi7o1e6Jo6ZqisUlTJZxgBtMU6sSM" +
                                          "US3rMDLhMmBoVwokSQpJkkfD28Mp1KKY1pJPvi1APhrY4ZRF/y6boY7UBbyA" +
                                          "kw7T9GRKs9lwiaIDlqkv5XWTJUiJJS7od7kmOJG6a4MJBl9o/8etK4UOYYIt" +
                                          "2DBMJtSzTxHb1BeImkLt/uqYTor2RfRFFEuh5gAxQ/GUd2kSLk3CpZ62PhVI" +
                                          "30oMpzhqCnWYx6nOUrhADA1UMrEwxUWXTVrIDBwamKu7OAza9pe1lVpuUPHR" +
                                          "A8nVx853fDeG2mdRu2ZMc3EUEILBJbNgUFLMEmofVVWizqJOA5w9TaiGdW3Z" +
                                          "9XSXreUNzBxwv2cWvuhYhIo7fVuBH0E36ijMpGX1ciKg3H+1OR3nQdceX1ep" +
                                          "4ThfBwWbNBCM5jDEnXukZl4zVIZ2h0+UdYx/DgjgaH2RsIJZvqrGwLCAumSI" +
                                          "6NjIJ6ch9Iw8kNaaEICUoe1VmXJbW1iZx3mS4REZokvLLaBqFIbgRxjqDpMJ" +
                                          "TuCl7SEvBfxzY+rw5fuN40YURUBmlSg6l78ZDvWFDp0iOUIJ5IE82LI/9XXc" +
                                          "89JKFCEg7g4RS5rvf+HmPQf7rr0qaXZsQnMye4EoLKOsZ9ve3Dk6dHeMi9Fg" +
                                          "mbbGnV+huciytLszXLIAYXrKHPlmwtu8dupn9z3wHfKXKGqaQHWKqTtFiKNO" +
                                          "xSxamk7oMWIQihlRJ1AjMdRRsT+B6mGe0gwiV0/mcjZhE6hGF0t1pvgPJsoB" +
                                          "C26iJphrRs705hZmBTEvWQiheviiCHwPIfnp5wNDM8mCWSRJrGBDM8xkmppc" +
                                          "fzsJiJMF2xaSWYj6+aRtOhRCMGnSfBJDHBSIu5Glmpon4H+I0xExT/D4sv5v" +
                                          "nEtcpy2LkQiYe2c42XXIk+OmrhKaUVadkbGbz2Vel4HEg9+1BkN74LKEvCwh" +
                                          "LkvIyxKBy1AkIu7Yyi+V7gRnzENaA662DE2fOzG3MhiDOLIWa7gpSyLPdnh/" +
                                          "4GBIOJHRn5m2nvj1L/50ZxRF/eRvD6D2NGHDgYDjPLtEaHX6cpymhADdu4+n" +
                                          "v/bojYfPCiGAYs9mF8b5OAqBBugJKPTQqxffef+99evRsuAxBojrZKFwMdSA" +
                                          "swBXWGEMNZZxRyq29SP4ROD7H/7lOvIFGUNdo24g95cj2bIC5oiI+TaG+qrZ" +
                                          "XZqcW21XNWQQqLb+4OqaevLJQzJ/uyqzbQyKybO/+vcbicd/99omTm9kpvVx" +
                                          "nSwQvUI0uLKiLZgUoOmV2IzybtvV3/8wnh+JopoU6gLbOFjnBf4ozUPpUOZd" +
                                          "dG3JQq/gl+z+QMnmvQY1FaJCxahWul0uDeYCoXydoa0BDl5DwaFzf/VyHhb9" +
                                          "lQf/vP30kcKcCLZggea31UJt4SfTvKyWy+fukPnDLL89+cxrx/YpV6OionB0" +
                                          "3qQSVR4aDjoCLqUESqfB1eErrXDpYDiNw9bKKPv78YuZly7FhRcaoawyyFRe" +
                                          "sfrCl1dUhWEvyfhVDWCEnEmLWOdbnsmbWIGai/6KwJdOGfMQIE08xLvhe8DF" +
                                          "TfHLd3ssPvZKPBL0fWIc4ENcRFeUT/fyYZ8g+xhE2z4/jwHodYBE7pH4GQPc" +
                                          "ruU0nNUJR5h/te899OJfL3fIQNZhxXPRwf/NwF+/YwQ98Pr5f/YJNhGFNxo+" +
                                          "1vhksnpt8TkfpRQvcTlKX3pr1zdewU9AHYTaY2vLRJSTWqFfrZfYe2+f2G53" +
                                          "5VFv4dSLdyoJ1SwmeBMJkc63xj2CgQ3s8gsscYxiq6Ap9hRkA0g76Kctz49p" +
                                          "B7ArTbUi4OaC2xJ8Ij2nrMTTf5BwcccmByRd99PJr868feENkSgNPJPL4RnI" +
                                          "U8j4QIh0CIdyyBq6TYNdKU/yUtf789/64FkpT7ifCRGTldWvfJS4vCojQDZ9" +
                                          "ezb0XcEzsvELSTdwu1vEifE/Pn/pR09fephLxY8lGE8aE0t/jXCULGPl1kob" +
                                          "SknvfaT9x1e6YuOQnBOowTG0iw6ZUCvTvt52sgGj+l2iBIGAzLyuMBTZb1kl" +
                                          "sTwqxDhSFga5JZb/v48Pn2aoWaEEyo4o314QtYloxotMVnUQPl7FUYFHSUa5" +
                                          "cv3D1pkPX74pzF75qgnW6UlsSUt38mGYW7o33Ckcx3YB6D55berzHfq1W8Bx" +
                                          "Fjgq0O3YJyn0KKWKqu5S19b/5ic/7Zl7M4ai46gJ3KCOY/5+gC4QkIrYBWhv" +
                                          "StZn75FotNgAQ4ewB9pgoQ0LPMl3bw4fY0WLiYRf/kHv9w4/tfae6BCsEtg2" +
                                          "0BRxBts2vLDkq0B5bq29oXftzNsCo8udewtkVM7R9UAsBOOizqIkpwlLtkh7" +
                                          "WuJHY6i3CqhAwyInQr+CpIc61BGmhzgWv0E6k6Emnw5YyUmQBKpKDEj41AYL" +
                                          "RCobO/7nHB+65XyuqisCveCeisgTL1kvixz5ls0oz6+dmLr/5qeelK0hvIGX" +
                                          "l8XLB3JHVq1ykR6oys3jVXd86FbbC417vZTulAL7pWpHIIlykNoW9+z2EP7b" +
                                          "8XIZeGf98Ms/X6l7C2L4LIpgwPCzgXekfDRBEXGgmzqb2ogR0OKIwjQ89M2l" +
                                          "Iwdzf/utiC4XU3ZWp88o158698ur29ahgDVPoFpAK1KahUexfe+ScYooC3QW" +
                                          "tWr2WAlEBC7wSq8AoDYehJi/cYVdXHO2lld5o8HQ4EZQ3ditQSYuEjpiOobq" +
                                          "Qlizv1LxxPb6HMeyQgf8lUAdOSNRT3bSsUxq0rK8zromY4keYyYMxGJRnP6y" +
                                          "mPLhof8CkZKfA+USAAA=");
    java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    long jlc$SourceLastModified$jl5 = 1471109864000L;
    java.lang.String jlc$ClassType$jl5 = ("H4sIAAAAAAAAALU5aazs1ll+9+0vad5L0iykTZrlpSKd9nrG49mUbmOPZ8Ye" +
                                          "z2aPZ8YG+uLdHq/jfaYNlIguolKpIIUitfnVCqjSRYgKJFQUhKCtWiEVVWwS" +
                                          "bYWQWEql5geLCFCOPXd79+Ul6g9Gsuf4+Dvfvpzz+cUfQufDACr5nr3RbS/a" +
                                          "V7Nof2XX9qONr4b7FF2biEGoKrgthuEMzN2QH//y1X9/5RPGtT3oggDdK7qu" +
                                          "F4mR6bkho4aenagKDV09niVs1Qkj6Bq9EhMRjiPThmkzjJ6moTtOLI2g6/Qh" +
                                          "CzBgAQYswAULcPsYCix6g+rGDp6vEN0oXEM/D52hoQu+nLMXQY/djMQXA9E5" +
                                          "QDMpJAAYLuXPcyBUsTgLoEePZN/JfIvAnyzBz//G+6797lnoqgBdNV02Z0cG" +
                                          "TESAiADd6aiOpAZhW1FURYDudlVVYdXAFG1zW/AtQPeEpu6KURyoR0rKJ2Nf" +
                                          "DQqax5q7U85lC2I58oIj8TRTtZXDp/OaLepA1vuPZd1J2M3ngYBXTMBYoImy" +
                                          "erjknGW6SgS95fSKIxmvDwAAWHrRUSPDOyJ1zhXBBHTPzna26OowGwWmqwPQ" +
                                          "814MqETQQ7dFmuvaF2VL1NUbEfTgabjJ7hWAulwoIl8SQfedBiswASs9dMpK" +
                                          "J+zzw9E7P/5+t+/uFTwrqmzn/F8Cix45tYhRNTVQXVndLbzzbfSvi/d/9aN7" +
                                          "EASA7zsFvIP5/Q+8/N63P/LS13cwb3oVmLG0UuXohvxZ6a5vvxl/qnU2Z+OS" +
                                          "74VmbvybJC/cf3Lw5unMB5F3/xHG/OX+4cuXmD/jP/h59Qd70BUSuiB7duwA" +
                                          "P7pb9hzftNWgp7pqIEaqQkKXVVfBi/ckdBGMadNVd7NjTQvViITO2cXUBa94" +
                                          "BirSAIpcRRfB2HQ173Dsi5FRjDMfgqCL4ILOgKsC7X6P5rcImsOG56iwKIuu" +
                                          "6XrwJPBy+UNYdSMJ6NaAJeD1Fhx6cQBcEPYCHRaBHxjqwQspMBVdBfYHfooV" +
                                          "4/3cv/z/N8xZLtO19MwZoO43nw52G8RJ37MVNbghPx9jxMtfvPHNvSPnP9BG" +
                                          "BD0BiO3viO0XxPZ3xPZPEIPOnClovDEnujMnMIYFwhokvDufYn+Oeuajj58F" +
                                          "fuSn53JVZkWcPVg8nAXrnrp9Eu7mGYAssp4MnPLB/xrb0nN//58FoyfzaI5w" +
                                          "71Uc/9R6AX7x0w/h7/5Bsf4ySDkRkCKP5kdOh99NEZPH4WkFgkx6jBf5vPNv" +
                                          "e49f+NM96KIAXZMP0vRctGOVVUGqvGKGh7kbpPKb3t+cZnYx9fRBOEfQm0/z" +
                                          "dYLs04c5MRf+/EnDgXEOnY+vFE5wVwFz94/B7wy4/je/ckvkEzvnvgc/iLBH" +
                                          "j0LM97MzZyLoPLLf2C/n6x/LbXxawTkD72L9z/z1n/9zdQ/aO87TV09UPqCE" +
                                          "p0/khhzZ1SIL3H3sMrNAzZX1d5+a/Nonf/iRnyn8BUA88WoEr+f3nGNQ6EDB" +
                                          "+NDX13/zve9+9jt7Rz52NgLFMZZsUwaDsKhbQBLNdEW7UMjjEfTAypavH0o9" +
                                          "B3UMMHZ9ZTcKVd0HKnfBWm6V/V3yL6IJcHT9Nu56omDfkD/xnR+9Yf6jP3r5" +
                                          "Fk+9WTFD0X96Z6GCqwygf+B0FPXF0ABw6Eujn71mv/QKwCgAjDLIBOE4APGb" +
                                          "3aTGA+jzF//2j//k/me+fRba60JXbE9UumJeW0GGjAxQjg0Q+pn/nvfuMlx6" +
                                          "CdyuFbEJFfK/acdOEdZ3HSuC9kAN/Ng/fOJbv/LE9wAfFHQ+yX0YcHBCW6M4" +
                                          "3xZ8+MVPPnzH89//WGETkE/nv/TKQ+/NsTYLAk8W95/Ob6WdxfLh2/PbO/Lb" +
                                          "/qGZHsrNxBaZjxbDaOgpJtgWKIWlXjN1TALTAd6WHNQ8+Nl7vmd9+p++sKtn" +
                                          "p/PEKWD1o8//8o/3P/783oldxBO3FPKTa3Y7iYLpNxyZ8rHXolKs6P7jl579" +
                                          "w99+9iM7ru65uSYSYMv3hb/8n2/tf+r733iV1HzO9g6dMr8jB2Tzv9rrGza6" +
                                          "41t9NCTbhz96vlSRVGYyR4vhSUNiVaS8TWWkYRPjtl3F13MyY4myElcJVN3I" +
                                          "aMiwfYHeVscNuSoLjbiWCAstCQl7ul4HPsl0u6nI9TmtYa+nyzLFTXv43OqS" +
                                          "UZejOSsiBqIeEZbJMeXpiproq+nEdoREQaRSmdaqfXYrV0faZDJqwVmrus22" +
                                          "7dZS7E44Rt8sectahhm1wsr+SmSw6jxcIJoRLIZNWx/CcLWJVUZVptJX6J4X" +
                                          "8P2ITWe8UEHNGAlGno1IfAcLB6Eok5zmUCOcQ7xpzIsin5kNr6LWKa8urM2Q" +
                                          "s2eUkOlYNOTqITvk2Gow7NDG0MG8eepZ7NSnLEvrIM2hXxkM+IpPTRKz0p4Y" +
                                          "AY8KTBfe1CWPb3CYtGlbaWPW6jGDsGWnpkh27LWV1JaLGcWZFMU2PKVhOWOq" +
                                          "VxfRIYXZLQ9uqtEA5cY8T0ZIBxtSEbudZX2pgqmkY9FgO7XmZ16AMBrQMhEb" +
                                          "Nb2dTeEepyAWS1tV3BfqyMSYk9WyN/S3xhp3F3xWd8dcYLQ77Qo3DIg04xbL" +
                                          "2TwgO1gqOoO4MW5vxZavVuy5H3OTPtNuuvOsWatqHbWHOAoTI8JQrhIcQdIY" +
                                          "JY10rksPCcfT5vOFuV1T43Ytbc1Es6csqkJryS4DlRttsSxNEHmRxAZvkF5D" +
                                          "m8dYv0xU6+Zq6PeWFdkc6NV+qTJmqu5UkdVlRfXRmaFh6UIaYfiwtuoQ7jK2" +
                                          "BBvdzkkBMcolTuEzuKOvdLGPMCFJCck66KU03o4dlqyPViRVl40WmTatkSgS" +
                                          "JM55amXuLClpUTGFrOqwKEMInpXQtIitu6SkM9lq3fGH1CzG7QZLJJiWbflS" +
                                          "kNa0eISWeY7hMMdm9brdaAqdZNHt+GVzzJFUjSSaCE3CreVSbraoQRcn9IaO" +
                                          "MmwtSLRS35lMtUYQlNfiUgin7nCjooRHD8ah0ErUaseqK311aLa6uiNJPXde" +
                                          "MmLZ3ER0uF3SZJtfBoM+iIc0iptK7LutbTXta4PloLcWp/3FYD2LuuZgNM7Y" +
                                          "THSshjdckFPTsBmq0l4NFYYJZyWs7vTUsp6a8zLsyCvBIOpGr1uOKn6iT6jQ" +
                                          "w3CkblK+ETBho1wzBAebEckCYFET08T76YTUXL+WjjrDpoMvWIYKehgYZ5bj" +
                                          "+7K2DSmTGnaRTGQX/KpeEplobDD4sOeyGkZ1+hhLxrWe7fiei/ZLZDkjshnc" +
                                          "QcOklrhEJPsbhLamJq8iMoosl6RVGjuBMRC5uahYUk/aInPVRvuE3ipVMGvU" +
                                          "QOkBkeCpQVsJuckG2KbStsi4wW/M0ryhM+6WGInteh3pEIg23vaqQ8PsjGly" +
                                          "ITZ0n93QE8U1YLSHkWOqz7g1B3GTVYWGa2UhA3GqMkmn3kFGvX5H5zurCR0R" +
                                          "Yn9ZB0w6IFqUGC25CSx5K16b4GavzYctp9uUauP2GsNinRpMZtN1pmmqVmq1" +
                                          "1IQJ43aGeatAGHTTocK2wxRbLnrEcCQAaps10mInKDPuNPpwwx4nZLfHjRQP" +
                                          "QfVWTV4hEonXPJMszcReaR0IS2EtL5DKcrSYTte0VELHa1FNaGq6peB4s95K" +
                                          "081gI43hUiJLpqzArZbnzJyW5SfzzGXTacKR5ZgemLSgc97YmSPkdiNFybwK" +
                                          "N1PXKFGe73F1nZbG3ZWLaai35SY+NxYUpVelpmtYt0vb0nToOsmUr3RFCs9E" +
                                          "YxHb5bij8ri33CieWMY6dq2Tit2tBs83fUNq2VMNTibVsiUPZBwQ1lWxWuGo" +
                                          "CGW1WTLYLDYlLbYmboemm62SnAUZzPvz+hjsjLBydT1l5wwqdlYeTq85gl1r" +
                                          "WEUlgmDZ8fmOOUpb0mAwSRpNPhbsTaNrMLLoielm02XUUAtwu6JwxoJINpox" +
                                          "7yxwwiUcejFWJDd0pAXZE024PkgpZdzThlOSKDczOjHUZqc70/q0Ug3DSSIM" +
                                          "Jhhd1hakjBIjmemq3AzWNrzQ1EuZQSBbFF6lfU/hMaLh99HedCIHMVd2RxzF" +
                                          "1Aw4Uput1pjS6KpGTkeCkS0nTKrBo7Rbgvl02mpOgpoG89QIhOIo80qVxLBC" +
                                          "14+aM0vzmWkiz+zBsuoHla2iplyr3ednIo8kNEOxs8W6qwWCBmKmpCG9WrU2" +
                                          "7yaowtLKxqMqbOqooExYcr2arRBcn1bDph6GMihp63rbbxmM1S7rjfpAjrZo" +
                                          "y8ca7WAmcSY6FnEko5rkCnGD4Wym1bBUlmUH2zBKqzWhgma9qanEyGL10YSa" +
                                          "0CjjklxzhU5Jo4yTymaDreszfqQMOHjDRVqj2YLraNfyZw1Tw5nezFYWiUax" +
                                          "aIJ7q2lHaKlbqbyUiW2YEDQ7U9K4khCmRsATF/aZcktTfYPO+KbdI5oiUY7g" +
                                          "1RLn6N7ErliexFpuoomzVgYqNB+Ppy429tJZr2ymdYHDk1kS1ZBQ761KNmJi" +
                                          "ZK+9pTfxEJsJUsWyw1m6zjoG29XFGiVIcII2Jy4ieguRIDYe6lUr6DTibS/z" +
                                          "ouHc5cBWpNHl+G6f5cSanFQ7Fd+aLBuov+02amvdXdQ5O2S5qNp0evyi4VWr" +
                                          "uCVnVR6rd2o1sPPd9rV1ZdHEsu5KX5fHVZ7auOXBAOTtuMZWWhJcM2W4IdiN" +
                                          "ISqaaF2nqgN8zMO1ko6jU4sMeGxhJGwkuI1a14tGenuKqinW8nVvWqYnQ7sq" +
                                          "pajGlxe0yTMabPWTVorCkSaqdQwPiUhHyhiTYVEIPKdjrctYTQJpx1tq0XYE" +
                                          "TqHNGDhXZM2HDabFtUNsPAb1m7T81KYjy2gsYqrP102w3zPa6YZ0p0EJ90m5" +
                                          "XsF6jrHVF0mZqFt1wnHTGr/hnCk28AcdYoVW2jzN4B7IRg23j5XqteUmBrso" +
                                          "PFFx1Qz1GV2xEjPb1uyw7G3rJcWhA7i2VlV7UDYSsre0m0saq1L9+bqysZi6" +
                                          "twmrq/lSada7koSjlUYizGK7TTf8hd8nSXtjjbxFq7RFCLBVbS5JQe1preYw" +
                                          "hJegUuMIjdKkr6cTfKsvVbBLYzBi2dOd7VpCPJ0pjwdkupo2W0PEJlMF5C6w" +
                                          "3cbRJVcVFn6z6VVqzXqrGQdISzT0znzidf32oDIQDU7NNLXEyrzn4dXpIloE" +
                                          "yKJtExjeSNl1s+11eNWgTFjm58qyP0ZsW6l5zf4UJYRpVTGjKcvHxMo3x560" +
                                          "ntrmNqnQWTaR6v2hupnqWtPm2sqYHTGzqsSGXLYuB4PmNvAcHrVUfsMPsx7F" +
                                          "uJP6xpnQhqc1cUsYaO0Sx4Ld+7vybT35k52s7i4OwEetUHCgyl+Uf4ITRfZa" +
                                          "BCPokiiFUQCOnRF0+ag3u6N+ogN05vDA/cjtWk27LlN+oHr4ds3Q4jD12eee" +
                                          "f0EZf66SH6ZynB1AN/L8d9hqoto3UQygt93+4DgsesHHzZ2vPfcvD83ebTxT" +
                                          "dDduaTrR0JV85SRvuR+11t9yis/TKH9n+OI3em+Vf3UPOnvU6rmlS33zoqdv" +
                                          "bvBcCdQoDtzZUZsngB6/5bTpyaoSB+ox3bc9Kn7lxlefvb4HnTvZ/8oxPHyq" +
                                          "m3SH5gWOaOcEDtviVyIjAEn3aOZkawmo9UruFPeBq3TQNy3+87f3+vn9jdmx" +
                                          "a93iM3tHTsoceEgAvfW4q4F7tq3Khdavc65TNAFEyVbzDuN/X32y8pV//fi1" +
                                          "3RHZBjOHZnj76yM4nv8pDPrgN9/3H48UaM7I+YeG4z7NMdiue33vMeZ2EIib" +
                                          "nI/sF//i4d/8mviZs9AZEjoXmlu1aCefL+Q7f+jlT762lx98XTmEvjeHTqvy" +
                                          "vuI5+/knJdUtpLMOAR67BZ2eRPu9QPQNUw5HnrKz1XtOhDKed8JsT4wKRRvF" +
                                          "nFzc9SLAdz3a/LmYvBFBd8iBKkZq0fI9JLzrColptH88XSSMZ16vBXGSSgaQ" +
                                          "n+gk56p98JbPUrtPKfIXX7h66YEXuL8qnPfoc8dlGrqkxbZ9svl5YnzBD1TN" +
                                          "LKS5vPNXv/j7QAQ9cBtLRNCF3aDg9v07+F+IoGun4YEei/+TcM9F0JVjOIBq" +
                                          "NzgJ8qEIOgtA8uGH8x7ricx0kFELPd7zeno8WnKySZpns+Lz32HmiXcfAG/I" +
                                          "X3qBGr3/5frndk1a2Ra32+JzEQ1d3IX6UfZ67LbYDnFd6D/1yl1fvvzkYaa9" +
                                          "a8fwcXyf4O0trx6EhONHRdhs/+CB33vnb73w3aJR+H8ilr+8lx0AAA==");
}
