import java.util.concurrent.atomic.AtomicInteger


class ApplicationModel {
    //var toInc:AtomicInteger = 0
    //val one:AtomicInteger = 1
    var toInc = 0
    
    def Increment():Unit = {
        synchronized {
            toInc = toInc + 1
        }
    }

    def Get():Int = {
        synchronized {
            toInc
        }
    }
}