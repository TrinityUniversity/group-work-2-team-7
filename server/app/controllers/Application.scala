package controllers

import javax.inject._
import models.ApplicationModel
import shared.SharedMessages
import play.api.mvc._
import akka.actor.Actor
// import akka.Sstream.Materializer


@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index(SharedMessages.itWorks))
  }

  def increment = Action {
    ApplicationModel.increment()
    Ok(ApplicationModel.get().toString())
  }

  // def socket = WebSocket.accept[Int, Int] {

  // }
}
