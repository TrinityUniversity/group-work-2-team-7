package models

import java.util.concurrent.atomic.AtomicInteger


object ApplicationModel {

    var toInc = 0
    
    def increment():Unit = {
        synchronized {
            toInc = toInc + 1
        }
    }

    def get():Int = {
        synchronized {
            toInc
        }
    }
}