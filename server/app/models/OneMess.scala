package models

import shared.Message._
import shared.Message

object OneMess {

    var mess = Message("first","AAAAAAH")
    
    def newGuy(sendy: String, mes: String):Unit = {
        mess = Message(sendy,mes)
    }
    def displayMess():String = {
        mess.sender + ": " + mess.text
    }
} 