// package scalajs

// import org.scalajs.dom
// import org.scalajs.dom.document
// import scalajs.js
// import scala.scalajs.js.annotation.JSExportTopLevel
// import org.scalajs.dom.html
// import slinky.web.ReactDOM
// import slinky.web.html._




// object inclass {
//     def main(args:Array):Unit = {
//         println("Test Scalajs")
//         for (i <- 1 to 10) {
//             println(i)
//         }
//         document.getElementById("title").innerHTML = "Hi there"
        

//     }
    
//     @JSExportTopLevel("incrementCountsjs")
//         def incrementCountsjs() = {
//             val hello = document.getElementById("count")
//             var number = hello.innerHTML.toInt() 
//             number += 1
//             hello.innerHTML = number.toString()
//         }
// }
