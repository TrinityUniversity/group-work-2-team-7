package edu.trinity.videoquizreact

import shared.SharedMessages
import org.scalajs.dom

import slinky.core._
import slinky.web.ReactDOM
import slinky.web.html._
import org.scalajs.dom.html.Input
import scala.scalajs.js
import org.scalajs.dom.experimental.Fetch
import scala.scalajs.js.annotation.JSExportTopLevel
import scala.scalajs.js.Thenable.Implicits._
import scala.concurrent.ExecutionContext

object ScalaJSExample {

  def main(args: Array[String]): Unit = {
    implicit val ec = ExecutionContext.global
    for (i <- 1 to 10) {
        println(i)
    }
    println("Actually hit the scalajs file")
    if (dom.document.getElementById("messageinput") != null) {
      println("running if statement")
      val getMessageRoute = dom.document.getElementById("getMessageRoute").asInstanceOf[Input].value
      var message = ""
      println(getMessageRoute)
      Fetch.fetch(getMessageRoute).flatMap(res => res.text()).map(mess => {message = mess
            println("Message = " + message)
            //change dom here
      })
    }
  }

  @JSExportTopLevel("incrementCountsjs")
  def incrementCountsjs() = {
    val hello = dom.document.getElementById("countnum")
    println(hello.id);
    var number = hello.innerHTML.toInt
    number += 1
    hello.innerHTML = number.toString()
    }
}