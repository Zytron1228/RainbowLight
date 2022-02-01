package com.example.rainbow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.graphics.toColorInt
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {

    private lateinit var theScreen: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        theScreen = findViewById(R.id.screen)

        val windowInsetsController =
            ViewCompat.getWindowInsetsController(window.decorView) ?: return
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())

        rainbowEffect()

    }
    
    private fun rainbowEffect() {

        val rainbow0 = "#FF0000"
        val rainbow5 = "#ff1500"
        val rainbow10 = "#ff2a00"
        val rainbow15 = "#ff4000"
        val rainbow20 = "#ff5500"
        val rainbow25 = "#ff6a00"
        val rainbow30 = "#ff8000"
        val rainbow35 = "#ff9500"
        val rainbow40 = "#ffaa00"
        val rainbow45 = "#ffbf00"
        val rainbow50 = "#ffd500"// Fiftey
        val rainbow55 = "#ffea00"
        val rainbow60 = "#ffff00"
        val rainbow65 = "#eaff00"
        val rainbow70 = "#d4ff00"
        val rainbow75 = "#bfff00"
        val rainbow80 = "#aaff00"
        val rainbow85 = "#95ff00"
        val rainbow90 = "#80ff00"
        val rainbow95 = "#6aff00"
        val rainbow100 = "#55ff00"
        val rainbow105 = "#40ff00"
        val rainbow110 = "#2bff00"
        val rainbow115 = "#15ff00"
        val rainbow120 = "#00ff00"
        val rainbow125 = "#00ff15"
        val rainbow130 = "#00ff2a"
        val rainbow135 = "#00ff40"
        val rainbow140 = "#00ff55"
        val rainbow145 = "#00ff6a"
        val rainbow150 = "#00ff80"
        val rainbow155 = "#00ff95"
        val rainbow160 = "#00ffaa"
        val rainbow165 = "#00ffbf"
        val rainbow170 = "#00ffd5"
        val rainbow175 = "#00ffea"
        val rainbow180 = "#00ffff"
        val rainbow185 = "#00eaff"
        val rainbow190 = "#00d4ff"
        val rainbow195 = "#00bfff"
        val rainbow200 = "#00aaff"
        val rainbow205 = "#0095ff"
        val rainbow210 = "#0080ff"
        val rainbow215 = "#006aff"
        val rainbow220 = "#0055ff"
        val rainbow225 = "#0040ff"
        val rainbow230 = "#002aff"
        val rainbow235 = "#0015ff"
        val rainbow240 = "#0000ff"
        val rainbow245 = "#1500ff"
        val rainbow250 = "#2b00ff"//no crying until 2:50
        val rainbow255 = "#4000ff"
        val rainbow260 = "#5500ff"
        val rainbow265 = "#6a00ff"
        val rainbow270 = "#8000ff"
        val rainbow275 = "#9500ff"
        val rainbow280 = "#aa00ff"
        val rainbow285 = "#bf00ff"
        val rainbow290 = "#d400ff"
        val rainbow295 = "#ea00ff"
        val rainbow300 = "#ff00ff"
        val rainbow305 = "#ff00ea"
        val rainbow310 = "#ff00d4"
        val rainbow315 = "#ff00bf"
        val rainbow320 = "#ff00aa"
        val rainbow325 = "#ff0095"
        val rainbow330 = "#ff0080"
        val rainbow335 = "#ff006a"
        val rainbow340 = "#ff0055"
        val rainbow345 = "#ff0040"
        val rainbow350 = "#ff002b"
        val rainbow355 = "#ff0015"
//while ()
        theScreen.setBackgroundColor(rainbow0.toColorInt())

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            theScreen.setBackgroundColor(rainbow5.toColorInt())
            handler.postDelayed({
                theScreen.setBackgroundColor(rainbow10.toColorInt())
                handler.postDelayed({
                    theScreen.setBackgroundColor(rainbow15.toColorInt())
                    handler.postDelayed({
                        theScreen.setBackgroundColor(rainbow15.toColorInt())
                        handler.postDelayed({
                            theScreen.setBackgroundColor(rainbow20.toColorInt())
                            handler.postDelayed({
                                theScreen.setBackgroundColor(rainbow25.toColorInt())
                                handler.postDelayed({
                                    theScreen.setBackgroundColor(rainbow30.toColorInt())
                                    handler.postDelayed({
                                        theScreen.setBackgroundColor(rainbow35.toColorInt())
                                        handler.postDelayed({
                                            theScreen.setBackgroundColor(rainbow40.toColorInt())
                                            handler.postDelayed({
                                                theScreen.setBackgroundColor(rainbow45.toColorInt())
                                                handler.postDelayed({
                                                    theScreen.setBackgroundColor(rainbow50.toColorInt())
                                                    handler.postDelayed({
                                                        theScreen.setBackgroundColor(rainbow55.toColorInt())
                                                        handler.postDelayed({
                                                            theScreen.setBackgroundColor(rainbow60.toColorInt())
                                                            handler.postDelayed({
                                                                theScreen.setBackgroundColor(rainbow65.toColorInt())
                                                                handler.postDelayed({
                                                                    theScreen.setBackgroundColor(rainbow70.toColorInt())
                                                                    handler.postDelayed({
                                                                        theScreen.setBackgroundColor(rainbow75.toColorInt())
                                                                        handler.postDelayed({
                                                                            theScreen.setBackgroundColor(rainbow80.toColorInt())
                                                                            handler.postDelayed({
                                                                                theScreen.setBackgroundColor(rainbow85.toColorInt())
                                                                                handler.postDelayed({
                                                                                    theScreen.setBackgroundColor(rainbow90.toColorInt())
                                                                                    handler.postDelayed({
                                                                                        theScreen.setBackgroundColor(rainbow95.toColorInt())
                                                                                        handler.postDelayed({
                                                                                            theScreen.setBackgroundColor(rainbow100.toColorInt())
                                                                                            handler.postDelayed({
                                                                                                theScreen.setBackgroundColor(rainbow105.toColorInt())
                                                                                                handler.postDelayed({
                                                                                                    theScreen.setBackgroundColor(rainbow110.toColorInt())
                                                                                                    handler.postDelayed({
                                                                                                        theScreen.setBackgroundColor(rainbow115.toColorInt())
                                                                                                        handler.postDelayed({
                                                                                                            theScreen.setBackgroundColor(rainbow120.toColorInt())
                                                                                                            handler.postDelayed({
                                                                                                                theScreen.setBackgroundColor(rainbow125.toColorInt())
                                                                                                                handler.postDelayed({
                                                                                                                    theScreen.setBackgroundColor(rainbow130.toColorInt())
                                                                                                                    handler.postDelayed({
                                                                                                                        theScreen.setBackgroundColor(rainbow135.toColorInt())
                                                                                                                        handler.postDelayed({
                                                                                                                            theScreen.setBackgroundColor(rainbow140.toColorInt())
                                                                                                                            handler.postDelayed({
                                                                                                                                theScreen.setBackgroundColor(rainbow145.toColorInt())
                                                                                                                                handler.postDelayed({
                                                                                                                                    theScreen.setBackgroundColor(rainbow150.toColorInt())
                                                                                                                                    handler.postDelayed({
                                                                                                                                        theScreen.setBackgroundColor(rainbow155.toColorInt())
                                                                                                                                        handler.postDelayed({
                                                                                                                                            theScreen.setBackgroundColor(rainbow160.toColorInt())
                                                                                                                                            handler.postDelayed({
                                                                                                                                                theScreen.setBackgroundColor(rainbow165.toColorInt())
                                                                                                                                                handler.postDelayed({
                                                                                                                                                    theScreen.setBackgroundColor(rainbow170.toColorInt())
                                                                                                                                                    handler.postDelayed({
                                                                                                                                                        theScreen.setBackgroundColor(rainbow175.toColorInt())
                                                                                                                                                        handler.postDelayed({
                                                                                                                                                            theScreen.setBackgroundColor(rainbow180.toColorInt())
                                                                                                                                                            handler.postDelayed({
                                                                                                                                                                theScreen.setBackgroundColor(rainbow185.toColorInt())
                                                                                                                                                                handler.postDelayed({
                                                                                                                                                                    theScreen.setBackgroundColor(rainbow190.toColorInt())
                                                                                                                                                                    handler.postDelayed({
                                                                                                                                                                        theScreen.setBackgroundColor(rainbow195.toColorInt())
                                                                                                                                                                        handler.postDelayed({
                                                                                                                                                                            theScreen.setBackgroundColor(rainbow200.toColorInt())
                                                                                                                                                                            handler.postDelayed({
                                                                                                                                                                                theScreen.setBackgroundColor(rainbow205.toColorInt())
                                                                                                                                                                                handler.postDelayed({
                                                                                                                                                                                    theScreen.setBackgroundColor(rainbow210.toColorInt())
                                                                                                                                                                                    handler.postDelayed({
                                                                                                                                                                                        theScreen.setBackgroundColor(rainbow215.toColorInt())
                                                                                                                                                                                        handler.postDelayed({
                                                                                                                                                                                            theScreen.setBackgroundColor(rainbow220.toColorInt())
                                                                                                                                                                                            handler.postDelayed({
                                                                                                                                                                                                theScreen.setBackgroundColor(rainbow225.toColorInt())
                                                                                                                                                                                                handler.postDelayed({
                                                                                                                                                                                                    theScreen.setBackgroundColor(rainbow230.toColorInt())
                                                                                                                                                                                                    handler.postDelayed({
                                                                                                                                                                                                        theScreen.setBackgroundColor(rainbow235.toColorInt())
                                                                                                                                                                                                          handler.postDelayed({
                                                                                                                                                                                                              theScreen.setBackgroundColor(rainbow240.toColorInt())
                                                                                                                                                                                                               handler.postDelayed({
                                                                                                                                                                                                                  theScreen.setBackgroundColor(rainbow245.toColorInt())
                                                                                                                                                                                                                  handler.postDelayed({
                                                                                                                                                                                                                      theScreen.setBackgroundColor(rainbow250.toColorInt())
                                                                                                                                                                                                                      handler.postDelayed({
                                                                                                                                                                                                                          theScreen.setBackgroundColor(rainbow255.toColorInt())
                                                                                                                                                                                                                          handler.postDelayed({
                                                                                                                                                                                                                              theScreen.setBackgroundColor(rainbow260.toColorInt())
                                                                                                                                                                                                                              handler.postDelayed({
                                                                                                                                                                                                                                  theScreen.setBackgroundColor(rainbow265.toColorInt())
                                                                                                                                                                                                                                  handler.postDelayed({
                                                                                                                                                                                                                                      theScreen.setBackgroundColor(rainbow270.toColorInt())
                                                                                                                                                                                                                                      handler.postDelayed({
                                                                                                                                                                                                                                          theScreen.setBackgroundColor(rainbow275.toColorInt())
                                                                                                                                                                                                                                          handler.postDelayed({
                                                                                                                                                                                                                                              theScreen.setBackgroundColor(rainbow280.toColorInt())
                                                                                                                                                                                                                                              handler.postDelayed({
                                                                                                                                                                                                                                                  theScreen.setBackgroundColor(rainbow285.toColorInt())
                                                                                                                                                                                                                                                  handler.postDelayed({
                                                                                                                                                                                                                                                      theScreen.setBackgroundColor(rainbow290.toColorInt())
                                                                                                                                                                                                                                                      handler.postDelayed({
                                                                                                                                                                                                                                                          theScreen.setBackgroundColor(rainbow295.toColorInt())
                                                                                                                                                                                                                                                          handler.postDelayed({
                                                                                                                                                                                                                                                              theScreen.setBackgroundColor(rainbow300.toColorInt())
                                                                                                                                                                                                                                                              handler.postDelayed({
                                                                                                                                                                                                                                                                  theScreen.setBackgroundColor(rainbow305.toColorInt())
                                                                                                                                                                                                                                                                  handler.postDelayed({
                                                                                                                                                                                                                                                                      theScreen.setBackgroundColor(rainbow310.toColorInt())
                                                                                                                                                                                                                                                                      handler.postDelayed({
                                                                                                                                                                                                                                                                          theScreen.setBackgroundColor(rainbow315.toColorInt())
                                                                                                                                                                                                                                                                          handler.postDelayed({
                                                                                                                                                                                                                                                                              theScreen.setBackgroundColor(rainbow320.toColorInt())
                                                                                                                                                                                                                                                                              handler.postDelayed({
                                                                                                                                                                                                                                                                                  theScreen.setBackgroundColor(rainbow325.toColorInt())
                                                                                                                                                                                                                                                                                  handler.postDelayed({
                                                                                                                                                                                                                                                                                      theScreen.setBackgroundColor(rainbow330.toColorInt())
                                                                                                                                                                                                                                                                                      handler.postDelayed({
                                                                                                                                                                                                                                                                                          theScreen.setBackgroundColor(rainbow330.toColorInt())
                                                                                                                                                                                                                                                                                          handler.postDelayed({
                                                                                                                                                                                                                                                                                              theScreen.setBackgroundColor(rainbow335.toColorInt())
                                                                                                                                                                                                                                                                                              handler.postDelayed({
                                                                                                                                                                                                                                                                                                  theScreen.setBackgroundColor(rainbow340.toColorInt())
                                                                                                                                                                                                                                                                                                  handler.postDelayed({
                                                                                                                                                                                                                                                                                                      theScreen.setBackgroundColor(rainbow345.toColorInt())
                                                                                                                                                                                                                                                                                                      handler.postDelayed({
                                                                                                                                                                                                                                                                                                          theScreen.setBackgroundColor(rainbow350.toColorInt())
                                                                                                                                                                                                                                                                                                          handler.postDelayed({
                                                                                                                                                                                                                                                                                                              theScreen.setBackgroundColor(rainbow355.toColorInt())
                                                                                                                                                                                                                                                                                                              handler.postDelayed({
                                                                                                                                                                                                                                                                                                                  rainbowEffect()
                                                                                                                                                                                                                                                                                                              }, 150)
                                                                                                                                                                                                                                                                                                          }, 150)
                                                                                                                                                                                                                                                                                                      }, 150)
                                                                                                                                                                                                                                                                                                  }, 150)
                                                                                                                                                                                                                                                                                              }, 150)
                                                                                                                                                                                                                                                                                          }, 150)
                                                                                                                                                                                                                                                                                      }, 150)
                                                                                                                                                                                                                                                                                  }, 150)
                                                                                                                                                                                                                                                                              }, 150)
                                                                                                                                                                                                                                                                          }, 150)
                                                                                                                                                                                                                                                                      }, 150)
                                                                                                                                                                                                                                                                  }, 150)
                                                                                                                                                                                                                                                              }, 150)
                                                                                                                                                                                                                                                          }, 150)
                                                                                                                                                                                                                                                      }, 150)
                                                                                                                                                                                                                                                  }, 150)
                                                                                                                                                                                                                                              }, 150)
                                                                                                                                                                                                                                          }, 150)
                                                                                                                                                                                                                                      }, 150)
                                                                                                                                                                                                                                  }, 150)
                                                                                                                                                                                                                              }, 150)
                                                                                                                                                                                                                          }, 150)
                                                                                                                                                                                                                      }, 150)
                                                                                                                                                                                                                   }, 150)
                                                                                                                                                                                                                }, 150)
                                                                                                                                                                                                              }, 150)
                                                                                                                                                                                                          }, 150)
                                                                                                                                                                                                    }, 150)
                                                                                                                                                                                                }, 150)
                                                                                                                                                                                            }, 150)
                                                                                                                                                                                        }, 150)
                                                                                                                                                                                    }, 150)
                                                                                                                                                                                }, 150)
                                                                                                                                                                            }, 150)
                                                                                                                                                                        }, 150)
                                                                                                                                                                    }, 150)
                                                                                                                                                                }, 150)
                                                                                                                                                            }, 150)
                                                                                                                                                        }, 150)
                                                                                                                                                    }, 150)
                                                                                                                                                }, 150)
                                                                                                                                            }, 150)
                                                                                                                                        }, 150)
                                                                                                                                    }, 150)
                                                                                                                                }, 150)
                                                                                                                            }, 150)
                                                                                                                        }, 150)
                                                                                                                    }, 150)
                                                                                                                }, 150)
                                                                                                            }, 150)
                                                                                                        }, 150)
                                                                                                    }, 150)
                                                                                                }, 150)
                                                                                            }, 150)
                                                                                        }, 150)
                                                                                    }, 150)
                                                                                }, 150)
                                                                            }, 150)
                                                                        }, 150)
                                                                    }, 150)
                                                                }, 150)
                                                            }, 150)
                                                        }, 150)
                                                    }, 150)
                                                }, 150)
                                            }, 150)
                                        }, 150)
                                    }, 150)
                                }, 150)
                            }, 150)
                        }, 150)
                    }, 150)
                }, 150)
            }, 150)
        }


//        theScreen.foreground = @color/rainbow0

    }
