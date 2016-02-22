package org.sunflow.core;
public interface Tesselatable extends org.sunflow.core.RenderObject {
    public org.sunflow.core.PrimitiveList tesselate();
    public org.sunflow.math.BoundingBox getWorldBounds(org.sunflow.math.Matrix4 o2w);
    java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    long jlc$SourceLastModified$jl7 = 1456093649000L;
    java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAAK1Xa2wcVxW+u+t3HL+S2GkeTuJsIpKGXRVapLIhJHbtZsPa" +
                                          "WdluAadkc3fm7u7EszOTO3fstUshREKEP1XUprQg1b9SIVApEaICJFoFIdFW" +
                                          "BaRWFbSgFiT+8IpohER/hNc5d547a1OpYqW5O3Pvueee53fOffYmabc5GWWG" +
                                          "yIgVi9mZSUMUKbeZOqFT256HuZLyZIr+/ewfZ+5Nko4F0lej9rRCbTalMV21" +
                                          "F8huzbAFNRRmzzCm4o4iZzbjS1RoprFAtml2vm7pmqKJaVNlSPAg5QUySIXg" +
                                          "WtkRLO8xEGR3ASTJSkmyJ+LLuQLpVUxrJSTfHiGfiKwgZT08yxZkoHCeLtGs" +
                                          "IzQ9W9BskWtwcqdl6itV3RQZ1hCZ8/o9nglOFe5pMcHY9f5/3L5SG5Am2EIN" +
                                          "wxRSPXuW2aa+xNQC6Q9nJ3VWty+QL5BUgWyKEAuSLviHZuHQLBzqaxtSgfSb" +
                                          "meHUJ0ypjvA5dVgKCiTIvmYmFuW07rEpSpmBQ5fwdJebQdu9gbauli0qPnFn" +
                                          "9uqTZwe+lyL9C6RfM+ZQHAWEEHDIAhiU1cuM2ydUlakLZNAAZ88xrlFdW/U8" +
                                          "PWRrVYMKB9zvmwUnHYtxeWZoK/Aj6MYdRZg8UK8iA8r7aq/otAq6Doe6uhpO" +
                                          "4Two2KOBYLxCIe68LW2LmqEKsie+I9Ax/SkggK2ddSZqZnBUm0Fhggy5IaJT" +
                                          "o5qdg9AzqkDabkIAckF2bMgUbW1RZZFWWQkjMkZXdJeAqlsaArcIsi1OJjmB" +
                                          "l3bEvBTxz82Zo48+bJw0kiQBMqtM0VH+TbBpNLZpllUYZ5AH7sbew4Wv0eEX" +
                                          "LicJAeJtMWKX5gefv3X8yOiNl12anevQnC6fZ4ooKdfKfa/tmjh0bwrF6LJM" +
                                          "W0PnN2kus6zoreQaFiDMcMARFzP+4o3Zn3324rfZX5KkJ086FFN36hBHg4pZ" +
                                          "tzSd8fuZwTgVTM2TbmaoE3I9TzrhvaAZzJ09XanYTORJmy6nOkz5DSaqAAs0" +
                                          "UQ+8a0bF9N8tKmryvWERQjrhIQl49hP3twkHQWayNbPOslShhmaY2SI3UX87" +
                                          "C4hTBtvWsrZjVHRzOWtzJWvyavCtmJxl55ltM50KWtZZBuPK+r9zbKAOW5YT" +
                                          "CTDvrnhy65AXJ01dZbykXHXGJ289V3rVDRwMdk97wFs4JuMdk8FjMtFjSCIh" +
                                          "uW/F41zHgdkXIYEBQXsPzX3u1LnLYymIGGu5DY3WkBm10/+AjTGxZO5+Ys56" +
                                          "+s1f/umjSZIM07w/gs9zTOQioYU8h2QQDYZyzHPGgO7tp4qPP3HzK2ekEECx" +
                                          "f70D0zhOQEgBTgLefPnlC2/97p1rbyQDwVMCsNUpQ4kSpIuWAZioIgTpDhDG" +
                                          "VWzrf+CXgOff+KCOOOFGy9CEF7J7g5i1rIg5EvJ9+3oWn4UYZtxNLzTa7o0g" +
                                          "QMLXtUtX19TTz9zlJupQc1pNQtX4zq/+9fPMU79/ZR1vdwvT+rDOlpgekSyJ" +
                                          "RzbV/2mJjn4tLSlv9z32hx+lq+NJ0lYgQ2Aah+pYyU/wKtQIZdGD0d4yNAVh" +
                                          "bd4bqc3YVHBTYSqUho1qtMely1xiHOcF2Rrh4HcOiJGHN67bcdFfuvTnHfPH" +
                                          "audkrEUrMZ7WDkUEdxaxfgZ1ck/M/HGW35p+9pX7DyqPJWXpQBhep+Q0b8pF" +
                                          "HQGHcgY10kB1cGYzHDoWz9+4tUrK4b30+dILj6SlF7qhfgoKeAelaTR+eBP8" +
                                          "5/wcw6O6wAgVk9epjku+yXtEjZvL4YwElkE35CFA7sAIH4NnyANI+Y+rwxaO" +
                                          "Iy4QSfpROe7DIe1GF74ewOGgJPsQRNvBMI0B0XUIe/RI+gED3K5VNEQeBJh/" +
                                          "9h+46/m/PjrgBrIOM76Ljrw/g3D+jnFy8dWz741KNgkFO4oQakIyt0xtCTmf" +
                                          "4JyuoByNL72+++sv0aeh4EGRsbVVJusG8WAOhZqQah+T43hsbRKHj2PyecjK" +
                                          "fCgYbYGCItfqgHlLUn8QJ71BpEeaxZJy5Y13Nz/47ou3pILN3WYUVaeplXM9" +
                                          "i0MOkWYkjusnqV0DurtvzDw0oN+4DRwXgKMCLZZ9mgNINZow2KNu7/zNT346" +
                                          "fO61FElOkR7dpOoUxb4OqjMEFrNrUIYa1iePu8Gz3AXDgLQOabFXywT6ZM/6" +
                                          "3p6sW0L6Z/WHI98/+s21dySeu5j7kSB4R5DNAS+A/UD+4MHb7OZEM7Rvj/qz" +
                                          "Dk1GZppCH9m4W27+zP+IkYdwmBOkr8rEp02uq+OmY6i2z3hXC2O5Dh3quOna" +
                                          "LI/DvPte+ICmxolZqyFIb7QHQA9sb7k6uO2u8txaf9fI2gO/lpgUtKS9gOIV" +
                                          "R9cjkBeFvw6Ls4om9e51A9KSfxW4pcUzQpA2/JPCMpdME2RThEyQTu8tSgSY" +
                                          "nAIifK1bViPR3JgEFtv2fhaL9DL7m3JR3rn8CuG4t66S8t21UzMP3/rYM25r" +
                                          "A7e11VXZo8OVw4XdoMrs25Cbz6vj5KHbfde7DyS9GBl0BQ7DdWckgGYhDC10" +
                                          "1Y4YgNnpAMfeunb0xV9c7ngdsvoMSVBBtpyJ3Hjc/gNQ0IF24EwhbAgid3aJ" +
                                          "rLlD31g5dqTyt9/KfJPxD/3nxvQlZeHxN/PXF987Lpv8duhhWGMBrm/2fSvG" +
                                          "LFOWACi6HEO74LA83Az7MIoo3r6kHTzzbQ5msTIKMtZyzVqnvQAsWmZcpoqs" +
                                          "s4CO4UzT5c8vzI5lxTaEM4HrtrbqWlLu+2r/j68MpaYgE5rUibKHQC0HRT96" +
                                          "H3S7ABwHJMw03J4yVSpMW5bfY8542PaIS4LTgiQOe7MROMLPi5LbF+UrDpf+" +
                                          "C1VQi13pEQAA");
    java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    long jlc$SourceLastModified$jl5 = 1456093649000L;
    java.lang.String jlc$ClassType$jl5 = ("H4sIAAAAAAAAAK05eczkVn3+vr03IbtZyEFIAkk2qMHweWZsz6GlFM/hsWfs" +
                                          "8Xg8M54xLRvf9oyv8TGHaSoaVKAgUdSGlkqQv0BtUThUFbVSRZWqagGBKlGh" +
                                          "llYqQVWlHjQS+aOHmrb02fMds9/mEFVH8pvn5999Pb+fn3sROheFEBz4zsZ0" +
                                          "/PhAX8cHMwc/iDeBHh10GLwvh5GuNRw5ioZg7ab66Feu/NvLn7Su7kPnJeiN" +
                                          "suf5sRzbvhcN9Mh3lrrGQFdOVluO7kYxdJWZyUsZSWLbQRg7im8w0B07qDF0" +
                                          "nTkSAQEiIEAEJBcBIU6gANIbdC9xGxmG7MXRAvoFaI+BzgdqJl4MPXIrkUAO" +
                                          "ZfeQTD/XAFC4mN2PgVI58jqE3nas+1bn2xT+FIw88xvvv/q7Z6ArEnTF9oRM" +
                                          "HBUIEQMmEnSnq7uKHkaEpumaBN3t6bom6KEtO3aayy1B1yLb9OQ4CfVjI2WL" +
                                          "SaCHOc8Ty92pZrqFiRr74bF6hq072tHdOcORTaDrvSe6bjUks3Wg4GUbCBYa" +
                                          "sqofoZyd254WQ289jXGs4/UuAACoF1w9tvxjVmc9GSxA17a+c2TPRIQ4tD0T" +
                                          "gJ7zE8Alhh54VaKZrQNZncumfjOG7j8N198+AlCXckNkKDF0z2mwnBLw0gOn" +
                                          "vLTjnxd77/7EBzzK289l1nTVyeS/CJAePoU00A091D1V3yLe+Q7m1+V7v/bR" +
                                          "fQgCwPecAt7C/P7Pv/Tedz78/De2MG95BRhOmelqfFP9nHLXdx5sPFE7k4lx" +
                                          "MfAjO3P+LZrn4d8/fHJjHYDMu/eYYvbw4Ojh84M/m37wC/oP96HLNHRe9Z3E" +
                                          "BXF0t+q7ge3oYVv39FCOdY2GLume1sif09AFMGdsT9+ucoYR6TENnXXypfN+" +
                                          "fg9MZAASmYkugLntGf7RPJBjK5+vAwiCLoAL2gPXY9D2d0c2xFAPsXxXR2RV" +
                                          "9mzPR/qhn+kfIboXK8C2FhIlnuH4KyQKVcQPzeN71Q91ZKhHke7Isaw4+kEW" +
                                          "V8H/O8V1psPV1d4eMO+Dp5PbAXlB+Y6mhzfVZ5J666Uv3fzW/nGwH2ofQw8B" +
                                          "NgeHbA4yNge7bKC9vZz6mzJ2W8cBs89BAoPSducTws91nvzoo2dAxASrs5nR" +
                                          "1nlG3Z/fnAF4T7x6uSWzXKfz+qaC8Lv/PzlHefrv/iMXcbdiZgT3XyHET+FL" +
                                          "yHOfeaDxnh/m+JdAcYllEAwgbx8+nWi35EaWcadNB2rmCd3SF9x/3X/0/J/u" +
                                          "Qxck6Kp6WJDHspPogg6K4mU7OqrSoGjf8vzWgrLNnhuHiRtDD56Wa4ftjaPq" +
                                          "lyl/btdlYJ5BZ/PLufvvymHu/jH47YHrf7Ir80S2sA3ja43DXHrbcTIFwXpv" +
                                          "L4bOlQ4qB4UM/5HMx6cNnAnw00Lw2e/9+T+h+9D+SUW+srPHASPc2KkCGbEr" +
                                          "eb7ffRIyw1DPjPW3n+7/2qde/Mj78ngBEI+9EsPr2ZhJDLY0sDX80jcWf/3C" +
                                          "9z/33f3jGDsTg20wURxbBZMo36GAJobtyU5ukEdj6L6Zo14/0noMdiwg2PWZ" +
                                          "U8lNdQ/Yo3PRMq8cbMt8nkdAouuvEq47W/NN9ZPf/dEbxj/6o5dui9RbDcPK" +
                                          "wY2th3Kp1oD8faeziJIjC8Bhz/d+9qrz/MuAogQoqmBDi7gQZO76FjMeQp+7" +
                                          "8Dd//Cf3PvmdM9A+CV12fFkj5WwXBbUwtsDGa4GkXwc/895tLVtdBMPVPDeh" +
                                          "XP+3bMXJ0/quE0MwPtjtPv73n/z2rzz2ApCjA51bZjEMJNixVi/JXgA+/Nyn" +
                                          "HrrjmR98PPcJqJzCuZe+l5fTas7g8Xz8qWyAtx7Lpu/Mhndlw8GRmx7I3CT4" +
                                          "SajqjBzFrK/Z4AVAyz31mqWjH9ouiLbl4e6GPHXthfln/vGL253rdJ04Bax/" +
                                          "9JmP/fjgE8/s77wvPHbblr2Ls31nyIV+w7ErH3ktLjkG+Q9ffuoPf/upj2yl" +
                                          "unbr7tcCL3df/Mv//vbBp3/wzVcoymcd/ygos7F0yDb7w1/fsfEdVyksoomj" +
                                          "X7c4kUsrdbwW4QSOUYqBhVJ7rg+TTkQH3fZkMJYDhrY6lBJLUV8WNSchZG2u" +
                                          "ooZbSSqtKOWGHGpE8SiyBq1uq1+cjIKQN4tKTaDHRNCS6UaH9ElaI8W6PBBJ" +
                                          "RTBJewhX6cC3WgPE6qm4hmMVucgF04WIc2h/mei6jqMG2LinrqyoeFsU2xva" +
                                          "HNs1VxJG7Kir6BK3IIclvEwlErOR6BBG9JUhwXhv7mNkwdFntXDQUIayw45L" +
                                          "RbJqJalCkL3BwE3Thov5mC2lykwoDvwgJInYdUpLtxK4i25HHvccoU+YOD/a" +
                                          "CPTEFOP5gOGq61Z7gBLCsCPM3U0HZpiEZ4LxaB12hKFB2W3D7q5MaViobtbS" +
                                          "3KcaOhO3Izrla2KtHs3FeKUuNKdsx2N0wEtFqyFVEb/mmQ5H6njAqtS0ZuAI" +
                                          "yuBCGyfcUovurdYDoT9JxJIsw+se3yjzNa+DjsV4A/MMXh+Z4qbbIhKBWdqU" +
                                          "lFA8U08X8joWTENQXJ0adQqbYLYkcG1sdhv2kF66U5dMxEIlbAVC4NZ53Fhp" +
                                          "HV3htaRmKnLi2IVF3yO9WrIYSisddjZMrVEeGCws8RQhtlpUkyYse1RUE7a0" +
                                          "0UaOPGekHkFI1eo6dEhNREbVvjgIx1O2W6+lS3c18qhpvNZFye8ixKzMTrWB" +
                                          "ZFZH3apNVMOKvED8mFiUm75eTqyAw4Yrv9Tl6lNm3aD1cpURS4y7aHUjW4fp" +
                                          "GrFGhLlpdkuaJkgLyauP3AJpmeYGp+XO0McXmlkj0sW8KStzmlDnZElhzZEi" +
                                          "FgeSRIoiP5+xc2kC9CUWTiQToUpHdpHrzNy6gyqtZX24TqslyceqsNJZFeY2" +
                                          "X2cXMVsYU/BQqQc9RgocZzSVcIKqRIq+wsRlQW9NGFvtEHonZsXuBDd1Y4lO" +
                                          "qhvO7jnFkuzpS95rlA0J8/2uZnQNGYndmVVQViFZZjqsWOh7vdI8icopeK3i" +
                                          "ZdJusipLDMi0D2M+KnkoWsJCQ5rg3XmnUC2TZA8tW3XKxAIpTgWtaiTSamiO" +
                                          "h2xpqLiy30Lp2jANraVMSGmnUJvI3nTIDTrupuxx8xRvCvKCIKLCiIerckEh" +
                                          "a71q3HXDzVJsDfhZaNG8g9WsPhqv5hQvypue0uciR7AsV56WBBodTaqVBmYN" +
                                          "6/FSjEJpNqYGKSfGaUdcbuRlI3Y7awfHnZjFC10xlqR60u/CYS1VugQn4tNh" +
                                          "Y9hchp61KePEpFMoapKymU+oSbtTqtbGaDhuDlasNq9VVmSEdRIwrZIzNiZn" +
                                          "QoO2EhEhsWJKmdp8Qk9bdX4S9dMJmhQZj5luXLrdTvDmFBXndbdYQGBiNmyv" +
                                          "JQ6HpxFehqOigSTuTJBotlBZIWZUS4ccb/vTUdUq8XxzKm1Sqt82uUocYIt+" +
                                          "H6XSbkmft1qNtVEpNAupxfEtsz40Gd3oe06jhNQqQTFUNnxzNWYbUW8U8Nhc" +
                                          "COhEJCTbp81h0LSa7bGYhgbcmJigisHdBsdxZHtTa7TISqdi4nYxpE28tezU" +
                                          "YNQXPQzEVrzuMelQrvgFk2eZSTyKJ8XacJjWUqeTBLxaDHp8PMHSBQLXjD47" +
                                          "qtQQaVBcaqvlEA6bnBOY+lzYdAapMkZKbmfmYTEjOMtaipasNews4F6n4ExN" +
                                          "vkTIFhxMNyNk1Y15WtLazYKGbXrE2FI0TFmo6HRM1YdTYTGy/CLIAt3ZFNc2" +
                                          "xalkaRBaGKVydqdN9coVRdVII1kOPcroU3KizcPWKGSliticj1raWl4bplRU" +
                                          "5wiLUG0RxQO4Fkwqzc2i3xEnAV+39ADmC0o1ICm+TanmtFiY14tqe5pSTV9M" +
                                          "azAWj8IupqAFWKOZWVlwyMrCMky/qxPgBDIcwHq9X8WRlboqc+UVYY7nNT2Y" +
                                          "zRN4M4lbM2nJYNNVy5m3ULxBEpWIoCms522IHg1P4XC1ljl6g/GCEQw4vdKk" +
                                          "9WKbrGD6imubnX7ED3rLOksX6oXJiNaRAQ2brSbaxce9Fq/XOxZSs2CsjLhI" +
                                          "fxaa9ZDm2EqZmYUgvtAmPPPITVUT0wpW7PbMOclhPi/P6U1cWMeNoWtgnU3i" +
                                          "1zc9plKCYThaFmTdwsAGEynjcSeJ2lWR4CxpwQNHDTHUipRBl5qV+htdnXWN" +
                                          "hjlVpu0GHRsLk3KYkVflO5ViPWjp8lrqbPBpEe2lCFbxEzSgmR4qTkdjWQ+c" +
                                          "CVuzCyw3F6fzWRJ5i3GhmYTxMm2uCn4PxkD+Tcwu22AkqeaaPbon+atSt5dU" +
                                          "kLQ3RLGywZWLZMvh5oOKFnD+aK1g3GLGtsiwF47oqVy09X5SbacoMWmaDM/J" +
                                          "CjnZrIZliUXKaFCOxAJTlhCRomtVBI5KRW0j6Ak+q8yFOjbAmz1CgAlk1IQx" +
                                          "llIqnNRiK4PlDFmkzXmxLQVBg6q5mFiqwKA80vOptnLr3Dysgs2sUEoWMOdO" +
                                          "y3YpRa1Jo8ThTQtdJJwnMzTSXPZjsIE03LXvSIsNSSsVnuKJWqRU5uWEKyXV" +
                                          "eC0bNYMumRwCcmgUd4WaydHjQU2dzes6uVyVmQjz3ZqOF4laVzDWIhaoo5QP" +
                                          "iBLS6TfYQGNbpcHQam34IaAmmMLUI2jb6BaVsd0foB2zRcbLkmHJTK3JVFy0" +
                                          "M0BDr9pI2lhcLgvVuFQcpWwfRcIpW8JDoqIXi+OJ5Fe58QqbaD4bRiW8oaTl" +
                                          "5QzvUoqhgWDdCLV23SnU+UpTE9W52Z5azUaxUJxiU7PnBQRr6ImnFNbjmlrx" +
                                          "TC1a+qwwrtfjYNNBqZmKmD2+QJMlrLWyFMK0NVTuhIzTRIsmri2Gm7iGdI1O" +
                                          "f91EUG+95B1Jp9Y9pD8ha9UKEyyrWmJZYputhy5SMoRlmyE5kWjYZarFVTCG" +
                                          "qKJEWmFp30fD8pwapqnC4240pLtsDGrteOEteSISXUkN/EUUYQ0OG6VDXK0u" +
                                          "Uxp31kO5xWJUGIfKQnSYBC6FyKxcZQN5arbwcGQrXYpvFKjBsFamUKFC1FdU" +
                                          "h10V0A62GQsBK+KKMa3iWKkv0wLGDE2bB+nNDjiW6ds4o5DwKGwGoDIXx7xd" +
                                          "RIMWTxDZqzH9k51O7s4PkceNQ3AoyR4UfoK38vVrMYyhi7ISxSE4usXQpeNO" +
                                          "5pb7Thdl7+jQenujZqB74Iy47StkZ5KHXq1zmJ9HPvf0M89q3OeL2XkkI9kE" +
                                          "bGM/eJejL3Vnh+E+oPSOVz97sXnj9KQ/8vWn//mB4XusJ/MGwW19Gwa6nGH2" +
                                          "s/70cR/6rafkPE3yd9jnvtl+u/qr+9CZ427JbS3dW5Fu3NojuRzqcRJ6w+NO" +
                                          "SQg9etuBzVd1LQn1E77veJv81Ztfe+r6PnR2t4WUUXjoVEPmDsMPXdnJGBz1" +
                                          "kC+Dw7e/OlnZ7c4As745i4lHwXXtsMmY/2dP3xhk45vWJ5F1W8jsH8fo4DBA" +
                                          "QujtJ42Bhu84IAYyq18feW5+js66d1mT7r+uPF786r984ur2lOmAlSM3vPP1" +
                                          "CZysv7kOffBb7//3h3Mye2rWlT9pdZyAbVu9bzyhTIShvMnkWP/iXzz0m1+X" +
                                          "P3sG2qOhs5Gd6nnvFTrsG2ZCWbnaaj6ap57NsuFmFrKH3Un9KC8evi0vjs/i" +
                                          "Gd+TVH3y9Q7Quzzzhfcde+++bPHxQw8eefL/7r1b9dy7NdHv31XIlWPrgJXj" +
                                          "0F5jOfLyNYyUZsMihu4y9Vj0Q0er+4mnRUeEH7yNcP7c9sy6vz6xU/iT2Gkd" +
                                          "Q3fuNowz999/23em7bcR9UvPXrl437Ojv8oT7Pj7xSUGumgkjrPb49yZnw9C" +
                                          "3bBz/S5tcyrI/z4UQ1dPuz6GzmZ/uZRPb8E+HEN37IDF0IXD2S7QL8fQGQCU" +
                                          "TT+W9UZ3yiG0Y5lrr2eZY5Td5mZWQvMPdEflLtl+orupfvnZTu8DL5U/v22u" +
                                          "qo6c5h68yEAXtvXluGQ+8qrUjmidp554+a6vXHr8qLzftRX4JCx3ZHvrK2d+" +
                                          "yw3iPFfTP7jv9979W89+P2/w/S+6PQLYOR0AAA==");
}
