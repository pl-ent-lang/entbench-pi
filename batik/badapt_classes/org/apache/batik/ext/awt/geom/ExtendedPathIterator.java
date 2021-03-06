package org.apache.batik.ext.awt.geom;
public interface ExtendedPathIterator {
    int SEG_CLOSE = java.awt.geom.PathIterator.SEG_CLOSE;
    int SEG_MOVETO = java.awt.geom.PathIterator.SEG_MOVETO;
    int SEG_LINETO = java.awt.geom.PathIterator.SEG_LINETO;
    int SEG_QUADTO = java.awt.geom.PathIterator.SEG_QUADTO;
    int SEG_CUBICTO = java.awt.geom.PathIterator.SEG_CUBICTO;
    int SEG_ARCTO = 4321;
    int WIND_EVEN_ODD = java.awt.geom.PathIterator.WIND_EVEN_ODD;
    int WIND_NON_ZERO = java.awt.geom.PathIterator.WIND_NON_ZERO;
    int currentSegment();
    int currentSegment(double[] coords);
    int currentSegment(float[] coords);
    int getWindingRule();
    boolean isDone();
    void next();
    java.lang.String jlc$CompilerVersion$jl7 = "2.7.0";
    long jlc$SourceLastModified$jl7 = 1471028785000L;
    java.lang.String jlc$ClassType$jl7 = ("H4sIAAAAAAAAAL07C5QU1ZWvez4M858BBgQZBAY9EJyOqFEy/oaeRtr0fGSG" +
                                          "4WSMtDXVb2ZKqquKqtczDQYTzdmFJCtxDRrNKsnZoKCLn+OGTXajhhwT1ETM" +
                                          "8ZNETIKo+fiJR9kcNx+zce99r7qrurq7hvkt59Sd6ve579777r3v3luPQ++S" +
                                          "MsskzVRjrWy7Qa3WiMZ6JNOiibAqWVYftMXlr5VIf9zyZtfaICkfILUjktUp" +
                                          "SxZdr1A1YQ2QxYpmMUmTqdVFaQJn9JjUouaoxBRdGyDzFCuaNFRFVlinnqA4" +
                                          "oF8yY6RBYsxUBlOMRm0EjCyOASUhTkmo3dvdFiPVsm5sd4YvcA0Pu3pwZNJZ" +
                                          "y2KkPna9NCqFUkxRQzHFYm1pk3zM0NXtw6rOWmmatV6vXmiL4KrYhXkiWPZI" +
                                          "3f98eOtIPRfBHEnTdMbZszZSS1dHaSJG6pzWiEqT1jZyIymJkSrXYEZaYplF" +
                                          "Q7BoCBbNcOuMAuprqJZKhnXODstgKjdkJIiRpblIDMmUkjaaHk4zYKhgNu98" +
                                          "MnB7VpZbwWUei7d/LLT3a1vqHy0hdQOkTtF6kRwZiGCwyAAIlCYHqWm1JxI0" +
                                          "MUAaNNjsXmoqkqrssHe60VKGNYmlYPszYsHGlEFNvqYjK9hH4M1MyUw3s+wN" +
                                          "cYWyf5UNqdIw8Nrk8Co4XI/twGClAoSZQxLonT2ldKuiJRhZ4p2R5bHlUzAA" +
                                          "ps5KUjaiZ5cq1SRoII1CRVRJGw71guppwzC0TAcFNBlZWBQpytqQ5K3SMI2j" +
                                          "RnrG9YguGDWbCwKnMDLPO4xjgl1a6Nkl1/6823XJnhu0DVqQBIDmBJVVpL8K" +
                                          "JjV7Jm2kQ9SkYAdiYvWq2B1S0+O7g4TA4HmewWLMdz576orVzUeeFmMWFRjT" +
                                          "PXg9lVlc3j9Y+/yZ4ZVrS5CMCkO3FNz8HM65lfXYPW1pAzxMUxYjdrZmOo9s" +
                                          "PPrpzz9A3wmSyigpl3U1lQQ9apD1pKGo1LySatSUGE1EyWyqJcK8P0pmwXtM" +
                                          "0aho7R4asiiLklKVN5Xr/DeIaAhQoIgq4V3RhvTMuyGxEf6eNgghs+AhAXi2" +
                                          "EfFvBQJGaGhET9KQJEuaoumhHlNH/q0QeJxBkO1IaBC0fmvI0lMmqGBIN4dD" +
                                          "EujBCLU70DKlMRYapnoyFEkzoJQmemDpKEOedLMV1c34/1oojRzPGQsEYDPO" +
                                          "9LoCFaxog64mqBmX96bWRU49FP+JUDM0DVtWjKyBtVvF2q18be44Ye1WXLu1" +
                                          "0NokEOBLzkUaxN7Dzm0FHwBOuHpl77VXXbd7WQkonTFWinJPc6NcxH9UIKk5" +
                                          "JxM/cjJOPi4/8OJFPzvwz3eMCaVdWdyde+Yt+Gu3Onjz63/mLLr9M65dVsCg" +
                                          "PPMHQofuXhi+7B0+fza4MiaB6oGXaPaadY4lon17RQ8e2sG75oHkB8Fl5T8K" +
                                          "klkDpF623X+/pKZoLwUXXKlYmTMBjoic/lz3JWy1zXYTjJzppcu1bFvG1yLz" +
                                          "Fe4th3ccje81XH0a+Ji5sDV8r86FZ7VtNPwv9jYZCOen+a438F1Hklqj4K2H" +
                                          "qdn4+jf3/+mmXReD6KKkbBRJB6nUO+O6UnjK/OOh2xdX7T35ZdxZNNJSRLoC" +
                                          "9ci7M0j5pb3GPS8/99b5QRJ0Do4614kP0mtzOStE1sjdUoOjln0mRSn/+s6e" +
                                          "r97+7q5ruE7CiOWFFmxBGAYnJXEl/4entx1/9cT+l4JZPS5hcFqnBiHogReL" +
                                          "H6QMKFM0SRUaPvcj+BeA5+/4oPCwQXiexrDt/s7K+j8DrG92b+TKeDjW3RsB" +
                                          "spY5doFBVW9q0GI9ppIE/kZtt7+m5zp5d0vPb4R1nFFgghg372Dolv5fXP8s" +
                                          "l17FIER2fZldd4VR7eawHUogrEdwQdrytToPPaGdja9uvfvNBwU9XhPzDKa7" +
                                          "937po9Y9e4UXEgf78ryz1T1HHO4e6pb6rcJnrP/9wzu/d3DnLkFVY+4xFYEo" +
                                          "7MGf/++zrXeefKaAPyyBEAQWmeMoUbtpStvRtaVvemHxXU9J95Sgnpdayg7K" +
                                          "9TjAtYM7xNz9EFx3fLHusVsbS9YHSWmUVKQ0ZVuKRhO5NjnLSg26NsiJKhw7" +
                                          "tflHjWIksMowhPOHVVuK7JYr+ozLt770fk3/+0+cynOPuUbVKRlC3A0IzkZx" +
                                          "z/d6+Q2SNQLjLjjS9Zl69ciHgHEAMMpwjlndJhw36RwTtEeXzXrlB082Xfd8" +
                                          "CQmuJ5WqLiXWSxgownHPRiC2HIGTKm1cfoXwPGMVAOr52UG4hjbneqlWeNbY" +
                                          "XmpNAS+FL+dk2jv5z1Ucnovg48Kc8fU8BGsQnM/ZvoCRSjTJzu7+SF83tqwV" +
                                          "YkZ4JYIuYetXTYTUtTapa31IDeDLpkmQGot2FSG1fxKkhm1Swz6kBvHl2kmQ" +
                                          "evWm9o7CpG6ZIKkheLpsUrt8SOXk0ImRWsV98qZ10XBhWocmSOsZ8Gy2ad1c" +
                                          "nNb61/AlOTFa+fnRvrEIpdoEKT0fnrhNaXw8s0pNjNKazdGujnikP9IV7+7o" +
                                          "KETt6CSoVWxqlfEsa+dkqO3q7ooPRDYWlO2NPtSm/RZjpEKCc9oE9wf7l014" +
                                          "xcquSJmg811cLHXk59z+m/fuS3Tfex6eczjxckDIdONclY5S1YWqDjHlBN2d" +
                                          "PFl2otRf1972xn+2DK+DQypGGoG0lKTiEQYRQi+DbBdxQVZdjZGEU6o5y1Wq" +
                                          "wRqTqcs0kTJpsZKNjaVCH6UmtjMy14Uhc2RiSL2qeATiJf2pm99e2HfZyHU8" +
                                          "1MkL/GOkEmf2YDklWzZZ4pGqF+X9nYeeufJs+bYgrySIcDuvApE7qS33QK80" +
                                          "KUuZmnOEQ3SXF7Z4pBWXV50lHY4/vrOF74KTgyCGpZ6IvmpIN5OSigtkxFoJ" +
                                          "B6k+5rR4wnvUT9IEz1bbZrZ6bcbR8DzVDWbtZJetqCY52znkIYlXITlBqbds" +
                                          "0mBrlSFFGlQpRk1/q1tx3uE/7KkXsZYKLZltWD0+Aqf9jHXk8z/Z8qdmjiYg" +
                                          "YxHJCVucYViZQPzruE0KO8Lf9/DWuwr2fQPB7YzUyikTEjvWS4eT8IdbvWPw" +
                                          "d4znntxo8xow7VhSmN9I0mA8vtzx3fnfvuTAvhM85RBs7MnfPtXePnVK25cr" +
                                          "DSeEbS6QUvAAWASzn6k6+n3rW797VETWhRIWT53q4IEK+ZfJo7/JuKiLswwt" +
                                          "QvqXwrPBZoj/ZaR/Oksn4dSgImeKMjOEGf30iuL+yiW9ffctf+5z+5a/xkPm" +
                                          "CsUCnwgOtkCF0DXn/UOvvvNCzeKHuE8oRf/LHYq3tJpfOc0piHLZ1yF4ROjm" +
                                          "RVwNxPsnXe+XQW6b0CHLpV7lwJ+RdJ7K8INZIA4QromPjaeD2VO2XKXasKjb" +
                                          "XYrgsOHgD4pJ/PcCZudjvJoQVnWNShkKoU/UoRS9NVu6hs7ClO4RlPLFCpPJ" +
                                          "+TyvoJW4fcaPffqeRXCUkTIZKRWM+Qz/ab6zwIb7DJdfydkDPuuQD8YXERwY" +
                                          "z6EdnJpDEzQW81JJ26iTM+Cl8PeD2SUX4gpL4DnHXvIc4Uc2T9HaYVoSDxbd" +
                                          "bIc3HlJkHMlMoRZS/ncEJ8c1UwgHdIlN1EpPZqz07dO0UgTfz1roG/kWij9/" +
                                          "gOBJH5M7yZG9geApH8U95dP3RwTvITgmKPEZ+8GkTOqED8a/IDg+nkm9MpMm" +
                                          "pdn6rU2jSblYDJT69JVj40fA/jBlmyHzULThjSnxJcZhP0BmgP1q7GuER7fZ" +
                                          "12eI/QafvjkIquHAUqwOcOnjmeasQV1XqaT5GCeXV80MyIv31cFj2PIyZkhe" +
                                          "y336ViBoZpASQThUSEKlo7qScASxZLoFwQvvhSvxTd5PKq38C3y2oDopwbgd" +
                                          "HkQkrm8fYg0uFT9pXpz1lYEQb7hw/PAEh52PAFUxsBbUk26DvB2nBJoc4YbG" +
                                          "E25hiq4oJmfsvISvgQCPhcDlCNpz9iHLyXTo2nqfvg2nKblCJ1sggoBLKcpI" +
                                          "BTg3XmDJK5fwzMb12f61rjMr9a09DSIN8ilWeCfeouw79uMP6m4q9HWTX/mw" +
                                          "p3rnHX+5ZE0Va/kKL3Jks4CqGCmzcCSWYopeH+G4RFW/dlzrmOdYB18+axwZ" +
                                          "1a5zB+LQhbLry/32kRFYXE7P65u7svrqk4LdpePIKS5Hk/Hew8d3fYIn+XWj" +
                                          "iqUwcftIXPhpyrnwk/ni3JZzEaagJOPymw/f8vTSt/vn8BsOQmjI0Aa7XPAp" +
                                          "2zgC3DiCRCTDi3J4sungdYm4/Oxq5aKKX710v2CtWP6XO+ezd//92Fs7TzxT" +
                                          "QsohY8O6kmTSRFRjpLXYFSI3gpY+eOuAWW0xUitmwzmc2QXUhsZsa7a6xMi5" +
                                          "xXDzz3n5JbtKVR+j5jo9pSUQ7VJPZStlGO5ekVlOXq9uNMnq0xBelnf7VMOQ" +
                                          "AORe62gjftdzd0KcPicca+/tjfd9uicS72/fGG1fF+MG34efXkFri3prn4x+" +
                                          "s6ImwpKZEHZ570ezl18x/5lPcrvMF9x0C4v73gvT7gsVJD1lT2/6efoYgqsR" +
                                          "4F2bwDYE1sx5+rRP345JnpFjCLYjuAGc/IhkjYT1BNfnS6csu5v9ZHcjXwPf" +
                                          "PofgJgRfmJjsnA8Uu+B81yT8zj2uEL/o0/fl0xSiszAPMXY54tyN4EsI/glJ" +
                                          "0pkyxIV7zpSF+VU/YX6Fr4HgVgS3Idg7aWG6ePIh6C6fvn+ZsiDvRPB1BHcz" +
                                          "MlsIsl1Vp0eW3/KT5Teysvwmgn9FsH/mjPp+n75/m6RRH0TwAIJDYNRMF7c7" +
                                          "C7h0V8dU5HnYT54PI3gEwaMIvo3gP2ZYN7/nn4I0517TMs2UAbFUJC1TA+tN" +
                                          "HMXjU1bh/0LwGIIjkNSNSQqbHu19yk/aT2a194cIjiJ4enq11y1Mb+qq6tow" +
                                          "J/JY4UnY9QQf8MJUUhOsIgeeR/Ciw/SUBXv89AT7cwQvI3hlBtTYqRwGnsO2" +
                                          "Szlpr44nztemrK4nEJxE8Po0yvTN05PpbxH8HsFbmWokI3MLXbDFj4UL8q72" +
                                          "i+vo8kP76irm79v0C/FBKHNlvDpGKoZSquq+6Ol6LzdMOqRwQVSL78K83BH4" +
                                          "AyOLfS8Ag77jH57mvSPmvMfIgmJzGCkB6B7938BjodEw0q4NZUZ+AG7bO5KR" +
                                          "Mv7XPe7PjFQ64yAEES/uIR8CdhiCr3+DsDlQOF4m88bbb9dNjOVFM8zOlPgP" +
                                          "GnH54X1Xdd1w6hP3ijurELTv2IFYIDGbJT7Xc6QleamwG1sGV/mGlR/WPjJ7" +
                                          "RebDaYMg2DG9RY4GkvvATgzUmoWea4tWS/b24vH9lzxxbHf5C5BbX0MCEmRH" +
                                          "1+TfLk4bKZMsviaWf5Exk4i1rfz69stWD733y8w13kDujW7v+Lj80oFrX7xt" +
                                          "wf7mIKmKkjIFlD3Nrz13bNc2UnnUHCA1ihVJA4mARZHUnFuShfPcmpw8l5Fl" +
                                          "+bdIx81ra2KkymkRO+Ob6uIEp8XeSoQd4oDA3QC9i8c6DSOTy5EtBrf1SAGv" +
                                          "RiI4O1jDX/Gt9v8AfckC/bo1AAA=");
    java.lang.String jlc$CompilerVersion$jl5 =
      "2.7.0";
    long jlc$SourceLastModified$jl5 = 1471028785000L;
    java.lang.String jlc$ClassType$jl5 = ("H4sIAAAAAAAAAL18C7DkWHVYv5n977KzH1hgzS7sB6ilYdTqVrekLMb0R+qW" +
                                          "1B+1pO6WZJtBrU+3/mr9uluwBMgHYsKn7AXjBLbsBBJD1mBTwThJkeC4wieA" +
                                          "UyZUYlIVsClX2ZgQQ6WIUyYxuVK/ee/NmzdvmJ1dvyqdvq1777nnnHvOuff0" +
                                          "Pfc9/b3SjVFYKge+s104fnxe38TnLad+Pt4GenSe7tdZJYx0re0oUSSAdxfU" +
                                          "h3/z3P/+0fuWd50p3SSX7lU8z4+V2PS9iNMj30l1rV86d/iWcHQ3ikt39S0l" +
                                          "VaAkNh2ob0bx4/3S7Ue6xqVH+xdJgAAJECABKkiAmoetQKfn6V7itvMeihdH" +
                                          "q9JbSnv90k2BmpMXlx66FEmghIq7j4YtOAAYbsm/TwFTRedNWHrZAe87ni9j" +
                                          "+P1l6MlffsNdnzpbOieXzpken5OjAiJiMIhcusPV3bkeRk1N0zW5dLen6xqv" +
                                          "h6bimFlBt1y6JzIXnhInoX4gpPxlEuhhMeah5O5Qc97CRI398IA9w9Qd7eK3" +
                                          "Gw1HWQBe7zvkdcchmb8HDN5mAsJCQ1H1i11usE1Pi0svPd7jgMdHGdAAdL3Z" +
                                          "1eOlfzDUDZ4CXpTu2c2do3gLiI9D01uApjf6CRglLt1/RaS5rANFtZWFfiEu" +
                                          "veh4O3ZXBVrdWggi7xKXXnC8WYEJzNL9x2bpyPx8b/ja97zJ63lnCpo1XXVy" +
                                          "+m8BnR481onTDT3UPVXfdbzjVf0PKPd99p1nSiXQ+AXHGu/afObNP3j9qx/8" +
                                          "3Bd3bX7qhDajuaWr8QX1I/M7/+Al7cfwszkZtwR+ZOaTfwnnhfqz+zWPbwJg" +
                                          "efcdYMwrz1+s/Bz3eemtH9e/e6Z0G1W6SfWdxAV6dLfqu4Hp6GFX9/RQiXWN" +
                                          "Kt2qe1q7qKdKN4Ny3/T03duRYUR6TJVucIpXN/nFdyAiA6DIRXQzKJue4V8s" +
                                          "B0q8LMqboFQq3Qye0h54VqXd38tzEJd0aOm7OqSoimd6PsSGfs5/BOlePAey" +
                                          "XUJzoPU2FPlJCFQQ8sMFpAA9WOr7FbllKusYWui+CxGbGFCqaywYmopznvzw" +
                                          "fK5uwd/UQJuc47vWe3tgMl5y3BU4wIp6vqPp4QX1yaRF/OATF7585sA09mUV" +
                                          "l6pg7PO7sc8XYxduFIx9Ph/7/Eljl/b2iiGfn9Owm3swczbwAcA73vEY//P0" +
                                          "G9/58FmgdMH6hlzum8IoX1R8uR30e+zKHpvM3QVVuEgVaPCL/mrkzN/+7f9T" +
                                          "0H3U6eYIz5xgJcf6y9DTH7q//brvFv1vBf4pVoA+AdN/8LitXmJeudEelydw" +
                                          "u4d4qx93f3jm4Zv+w5nSzXLpLnXfp08VJ9F5HfjV28zooqMHfv+S+kt90s4A" +
                                          "H9+3/bj0kuN0HRn28YsONGf+xqPzCMp567x8W6ETdxZt7gbyLibgNeB59b4l" +
                                          "FJ957b1BDp+/Kaby7mIqc5LOU8AFL/Twnm//6kf+8m3vwIDoqNKNaU46kMpd" +
                                          "h+2GSb50/P2n3//A7U/+0btyH5Nb3g050ody5Tg+MznlP80HH/7D3/9O7Uzp" +
                                          "zOFqcO7I+gqk9/gRD5QjO1f4mrsPdU0I9VzK//2D7C+9/3vv+NlC0UCLR04a" +
                                          "8NEctoHnUQrN/XtfXH3jW9/8yNfPHCjn2RgswcncMVVQiIrVMQaUmZ7i7NT2" +
                                          "7h+Dvz3w/HX+5MLLX+zcyT3tfZ/2sgOnFgCTupUnuhfa/RFPnK7sbGi6gM10" +
                                          "36VDT9zzLftDf/YbO3d9XLOPNdbf+eQv/Pj8e548c2SRfOSydepon91CWajH" +
                                          "83JQ2QDqHjptlKIH+aeffOLf/PoT79hRdc+lLp8AO5rf+C//7yvnP/hHXzrB" +
                                          "t5wFy3nhosBIj15BDkf2SBfU9339+8+bfv/f/uAye79USwZKsGPkzhw8nDPy" +
                                          "wuO+qKdES9AO+dzw5+5yPvcjgFEGGFXgbaNRCJzi5hKd2m99483/7Xd/7743" +
                                          "/sHZ0hmydJvjKxqp5NsZsCjFS7ADWgJ/ugl+5vU7U1rfAsBdhYcrFbryU5ea" +
                                          "3XnwVPfNrnqC2eWFRy6+bxZfX1HAx3Lw6p1+5sXX5OB8DqCC7Upcui3XscFo" +
                                          "Sgij/E1jJ+YcPp6D1k55X3ctpOL7pOKnkLqXF6hnQGqfGl6BVPoZkNreJ7V9" +
                                          "Cqln8sL4GZA6njQ7J5PKXSOpEHiG+6QOTyG1IEe6NlJvL5zMpEW1T6ZVvkZa" +
                                          "Xwye2T6tsyvTetcf5wXl2mgtHGKTuwKl82uktAaeC/uUXriaWZnXRunzZtSw" +
                                          "c4GYEsMLo07nJGqtZ0CtuU+teTXLWj0Taoej4QWZ4E6UbXhVagtUgBCw6lXP" +
                                          "o+cr+ffttZHxQstRH724FE5BOAk89qOWgxb9XxAf3TTsYrBjRFZ+YiKBo7/z" +
                                          "EFnfB+Hcu/7kfV957yPfAv6dvrhNyVs/CiQ6fevL/6IICt5+bfzcn/PDF1vz" +
                                          "vhLFA18zQRirHbBUO0I0GoMYxb8OluIXBD0kopoX//oVtF0fT2B5luoZMsDq" +
                                          "WKu1GMutpoQT9Ha0Iokt5Cs6F4cVo8t3kRk/iDvidF6VmdUqYVaxmnXGkpBp" +
                                          "Lkm3402HC4dM5Mk+0+575VFXEBVruVwLMCEMMBn4ZIrxy4ZJc7itDjflTNVx" +
                                          "PERXYRKu0GVqx3Wc1xqpXkdxFEXDWlpzEnZcLvODKLKzKWeFsy06VmozcyA3" +
                                          "6OHINOfN1WwqGfFAdML6lDLwbCvHhkK1bYPqTyw7ngT8RtZCuAlL4+p4IwXu" +
                                          "YOIKK21KKmPaw2lr4ieKv2lxWnfbych2ogxJjpyCQNBbNRGfxLZSg2tJ0WbS" +
                                          "ckYDzq0QVns7avKTpWC7fk1LNdJkp5FbjzREStVmhU1qwVoe0vK2ytisp+DD" +
                                          "9oqc2BtunPVIyYUDu5YNKkMxXjfC0cx1lXjaSEXX7CNMKC1F25yxMlUzcEwf" +
                                          "xRTLGa0e4QnaYC5HmczzMNhp8HS3EWQzk1gJsCVvqa1L23woSoSsSIFDjtGW" +
                                          "327Nh+ooGTSTIFzRMrP0xFEniheMpdk0ZXLB3KE6A3diW4rSs5FMYpaLYYJj" +
                                          "A6+FTgN5vp5NdBPVoH5fqClwuuptK0ttPLKFmGzY3Fo2u+31ttmknLbUW81c" +
                                          "mN5QlcGkqQyHViS6/spehVHU0xuVKdMdSq4jsVEmRb2uQ5DDdCVZDL7sIQN4" +
                                          "sJ2sa1F5PVSl2daoT4YrjVpjw9DG2j4iUlC87radps/L4w2wPqHqaEwClGcp" +
                                          "I0GVq897ziRrNoOozkwsxZTr6grmOZ+i4DY35ejuGoUXSRCss3ZFaKrksOXI" +
                                          "s9Y42MarcZ2p8QOqanFe2MWlRdLtzObtNeMNOn12hGyshQMrjaHtwFADq9ZE" +
                                          "2lsmlc50NW5RHbdFT6dBH2Noa4rSbtUe47wtNTVTSmeragvmK+URukCEJtJz" +
                                          "9fWsP9CyOtrww2k20XXSHcxIzhJYcYE7U0etWbhUhrYyIk9Dvt4etO1RjRxm" +
                                          "WG/QqDuGKLEzOGhmm8FkI1laKLsjH49YNgyyDG/W1i6/NReBU5vAzniMK0EH" +
                                          "DpiuD/e3vBLzky4BE9vZdkWrDMZWAnctxoOKsvRRDlEi0+zbDjMd1sUQ6uiU" +
                                          "0lyOfWqxQqY1bpkKg2Tb3RBGQx8uFsuo3Fw2RbNKGGTaGtNdpbskBJwZ0wQw" +
                                          "nMRd9pxhD1pVxjq9adkjmFJa7YrhplTFGbirbosaIlqHSKxWuz9BKx3GGXCS" +
                                          "Enj+liTszKfHru52AoYYgXh+MIXVGgLBvm9xGdsdR4TUYUd432+TysZfNBB3" +
                                          "1XJFvDGfcRMEJ9kyPekMwLzEM4vZtuJpSlZXMDbXEUTS4ZnYT+DK0LeJUauf" +
                                          "2RNlM0Q7mVshe+vWKOkFDopORXGuobOxDXSLnJkezaqNobrp4ROKsev0ZgCp" +
                                          "Fj1iTQTCRjTJZuk6q+mDtjLVZtpW08tSXO4mtZFnZY0a5Pb7IQ6mTZtG7QXL" +
                                          "Dnpj30jEpVlGW5WykSnIwFRaDb8rKqyiaBIC3DiMcmNMr0ZdtO737BZGOnUB" +
                                          "Y2zH7gRkA6hdGQoY2e+vJ6LIOJIrDFqWb6qQk9Xo2RbOREmw6CwI1ASek2kX" +
                                          "3vYzUkfiZU1VLR2DxV5FKdNmPepMsRBrkDI6jYfsOsUtSW6PdK+sIDWMhHu2" +
                                          "s7IQptpbaR5StowaVHZdkdM7DYax5y2ObjW8yag8akw8i4FGo2V1o4moUKvL" +
                                          "2kYeDmmeA/ODqyY6qFj1YF7rsjwG4fi8PuboSsdHGjBisxU3zkZ8TMCRpU38" +
                                          "keV4FZfjPagcNfQQR8voqh4mBNo2RzOSdDetblPyaJFwIET34g0M4apQdhBa" +
                                          "Zvn6UiVXXsvs+QtO7/ca4wFDDio8N1HYVLXKLb1ZL0OIz7bXY9HUN2EnhiKU" +
                                          "KVtYB1h6dV4WGL1jzWpc1IoCqa75ZGs6w1eVLoUHAUVAthzHaNmtZ0Fdq6Ts" +
                                          "HOFgjySBFSxqaLXjO2ndEFkscmCUpAiuasiOpiFTDtWVdW/iL0JCW4+1cBsL" +
                                          "PssqXc1S8CQ10mFrPcHFJZt1GAXFa2jg4xKuIxORWBgoFm4zWIB7vRGiN4J5" +
                                          "I1RpL2QhfJ0lkFbreH2bnEplZENKhI8OugZULmehqOsGozTZ7bZFNMczVx/4" +
                                          "k3kc8HHKxco01d3eRpzgNF7nF16gKdsFyuCC1YylAboZZjhBbmpGv5dE02jO" +
                                          "41KPn7mTKTOuyNOE4Zaj+tDy+vyi2hhGJs0s12hsOD1rRtnRwF8v2VFvCtqh" +
                                          "tBSW/awfo2jFsIHaVMrq1huxyWQ+ZTinXWtWqMyWNxmkNcrjKj8c962+ZfG4" +
                                          "7DSAvvQWPaI5GARroAwavVzXGtxaiAldzMTQaVWwqmhoWHvsJnR9tuqb4ozf" +
                                          "LPy112M5s13tUV2BcWHV8MU12x1Mm6OwXp10kaU19/SVM9OHc0l0g2GTL5P9" +
                                          "smZXrbSewRPV89MFgjEqZkywVjcaewNITv02x1sCnSVomSexWrxaTyVbRmiJ" +
                                          "SiQ9FgVJmMSCEig1mOronX5gu+OuH1dJvgsbG8ZeujC/zhp2K+05VVCnpzMX" +
                                          "99F20G3IwI8s9X4QTcIY40eiXaFcbhZNcWwlwxWxtZz5qsuPIhnrbquKBqve" +
                                          "cN6AoaYzEkilbHhcGhJUoPkEI1QML1wOFXGNRZVgaA0ZJdO6ieWZNotTU2BB" +
                                          "PkMIcaPN+9PZZuUYRKQAvlej2gr1fZbrSDNnVB2yMe9CnGwFBNNWcZ/A1wbq" +
                                          "VGBko64SnnYXGAyr/Z5o1/Gs7EJGwtcEQ980dDWzNqrdobTRUHWkOg9Ls1XH" +
                                          "6jmtYVVjSafqx5wB42h145WrHabcGW+DbtfvVhxGMImxxI3Ncmfe0jbjqaxZ" +
                                          "cpeYNPz6Fp6t1txKWKlRxRboIJKZoaVM273GxI2twRZGJku1ypl8v7rSm4JJ" +
                                          "G9XAxXG92jPkbW+CwQO7D3VHNuEaValjO7NMBvuC7oosi7gn6Xpi0FF5Li3C" +
                                          "LU+pnSRtBgS64mu1MYNVmEkiu96IGNd4kURBt9ZMnNYrTk9CoDQckSjCCItt" +
                                          "uxvIDSp1A2pYH/HmIrY3pA/8oV2uhxyy9tKJgFNEBs/ncig35uqcwzrZFGwl" +
                                          "YpnW41Vbqlczz6YkR6QEp7Waa1HFbYUOT5JdZxxwNgyt4HhTSwgIZWwxkiWm" +
                                          "LzvxrFMpN1cGboF5wDJIxlaaa5nSQtr06PY0UaWpKY/ZDPjLCjPC+gYOdWbJ" +
                                          "OqwaY7aFStlka9oCYaUzHtEFjNLm6Yxda0jmAUfqYxt/jU6XvDvEqYrbxNI4" +
                                          "A47AM9JEaKZLsP3nWhE68Aw2FnXWmzLVuhp2eJ2Y843xJG02Z00+8xp2o+zV" +
                                          "whnYpE8JYbbkqJlQr60QimDKskH7KEQnjNmP1ut4nK7Edci2ZN+CZIWDRnbk" +
                                          "IRq/oFydGVgjomvUKmbSL2/NGW4YamyU61m5rkAbm3Xb0aTtrRej2G6TlY7o" +
                                          "QZNRmqbDdqYzvYTAfM6A+j1pVYvpwBiplcDs9WV4SyLcyHK56Xq4YSNP1Mvi" +
                                          "eNaYV9q9fjBFnTVd5jQaZTBqKFNNZBz6Lmspeqc6HVVFRlQixpqLUriIRr1F" +
                                          "BwloiFXbcqJZKe2Pp95syC9txp9AE5/j8eE0aSwjtO2MEM5h+2Q7YOmysE19" +
                                          "eoYYqsIaxkrnxPbEFiiZ4WaD8jiDlHkjW1NztENrxlazO2ySjDuYJBLcWsoa" +
                                          "hObRQYfIxjMMpulqwxQG5baDsYA+fiIii6CPdLyemFIqMlGrAt5TpKnPdzZz" +
                                          "bU6ptZ5D272BM/A5mYc8laAxFZ6sFz2NcoYwEbDyKqug2qgyWQhGBod+F7Jn" +
                                          "poVDi1GL7tUH6Fbu4gu9GfSwCV7X2BpwxyklLFyGJeQy1rWF0YroYApEdRZl" +
                                          "z3bxQTBwA81rhJOqxc8dqUMLDZyeWkjFaEJWy3G3vWzSF5YW721oVV6ylZa7" +
                                          "YOEV2k0IDjVkuKpT0FgxUsumVkmvOVmtRyrYTLm6Eo2nsLhShHq3rYtTrDLY" +
                                          "UmkNVkmrylJbGbjUba3WmJotXw6a/FhYTniCcXxg3WoTRHt9n1yP03TJpxtB" +
                                          "q7PMqoa1a9uq3/GD9Xyh9eyxHbqYIS0qCSnggRhksCMR4zm6XENsk1jWq2yT" +
                                          "nGyi1nxiVxudtFX1WrSvItK8S1TrS3OF+LRrRCnFp4txm12qHac9DDIcKOBW" +
                                          "FPyqtzLSRdVj5k6bhqPFwm/1GTWgWsKiJrodmqkb62wwh6tGAw6tQYgrFbzD" +
                                          "U0PMBOtW29D9ZI3iyYBtuMgK780EEXLXQS0EE1+uy0RlqkA206/RdoS0V922" +
                                          "m6ltfib5gd4rdxGOnEGak4XuSJNaMFZWNmsZVupZq9wfL+f9cAvVqjZHAoVD" +
                                          "2UY9QaM0XNlIXwt0lmL4es+Gevoa02qGRHllcWaZq8laNWJKZJfBNvTWNuSZ" +
                                          "NVrOCEVZgJ3x1l1DBpYKfAylHtaKRmPXoipNBRXZZlDNFu1ax2xzbaEDOiFR" +
                                          "4i00yUWg0WZVVxhGROFKWm3HM7Yhjsp6pkEQXiUjVMg2wjjylxI2atiuwHMg" +
                                          "YAr6okTyVG0RSGV9lDRns8pmYsbuOnPV6licLCM5UlClsRmY9Y3YybKaV6fn" +
                                          "MTPlylbd8vGAn4zRKc3KfOx0R3XdnjojcYUnw4G3qmxauuMZ6HQwGjdHnN6o" +
                                          "Liwj1jKtwqisqapKGYotQ8MTU+XRKmR0wbJPlgfdGqIbok2GZi0IPWQDtrIU" +
                                          "mChGJnpyHa3omQNjG6jusGqYDkh8U2kjKVpbpAK6iKZ0B3aEKtTQDV9arCIO" +
                                          "IavzdUcC++NNvRxybA2p015AWu2+ZCXNrgpRS9uSBLg1NDy+oUZJPcXlnmqB" +
                                          "3Y/B+saCXnCGS1uR18QmSbmFwVsBy6xqQvQhvwIZTmXDm1HWZAeiVEfi7RAh" +
                                          "IgpaOHQlsLcbsH3IAp4sTyeQJDbIEOktpgu+RmkLVJl1G0A1lo12w0i9shyZ" +
                                          "nZRjW3Crp2YDJ6LARngaVPRZDWKEuqBvo3TtLjycjHqQa7FB2UPrkNvguF5F" +
                                          "WDcpuiMNuQGJqmgbXVammDap9zxJqCMsmFlirQyo1K8t2KosDVHI8xCqUodR" +
                                          "YRBVJ805OaHbsNAsx8PeQLQm8HwJVfrrLkVZ9pAf8uPVvJfA+NaGFKGqwDii" +
                                          "UpZJg+hhBcNbeDAvr1aN2F/TEC0hE0/Cx2MDG9CTyXIUUQtd56C2uYb4SUtM" +
                                          "MbwpoCpwIFRt6bRiQVpx664Xjap85gQhgnhZrLshg3gEvSEw1q9sU2FYqbPB" +
                                          "fNPDehE5d2e+TdUGfXHeIS1k0sdWaNUspz5ms2jDDF0UTyttiGwxvaGTdoIu" +
                                          "48v8KlmVGyOn0c+0wQgMOJ7yfRRjsFqrhzS3o77BY80Filq9OuqmPOumA4Na" +
                                          "uHTWbdutRguEFBgIDTViXVkhQ3kil5tddD6qM9wgBaaoo6xFjhvItkkQPJRQ" +
                                          "HNbWlmY7rJU7UccZj0jExbD5fI5rQ2s0JQdYNnLYBdv1enVEhEVNg9eNJVsz" +
                                          "rSQk+kJapUiJ6nTntICKamPs6Iq77sJRdwq5XYeDZqxFo5w+7yjSYFHtdHFO" +
                                          "Qrp2mjaFRTZx/ZmuIPGMh+ZVJO3hTrbZzHtGvV1vzcXKoE24XA8uC0bfRuaM" +
                                          "PIhSU5kZdWJjIyYcGlkDj8D2CK3VttgartmdxJqhablvYRWfDEV0E4PtrEsx" +
                                          "LmNbFOl0asMwg2vzoVqdeN6k127C5nJK");
    java.lang.String jlc$ClassType$jl5$1 =
      ("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" +
       "B71NgJECRAAA");
}
