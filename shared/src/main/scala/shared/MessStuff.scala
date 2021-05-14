package shared

import play.api.libs.json
import play.api.libs.json._

case class Message(sender: String, text: String)
object Message {

    implicit val messageReads = Json.reads[Message]
    implicit val messageWrites = Json.writes[Message]

}