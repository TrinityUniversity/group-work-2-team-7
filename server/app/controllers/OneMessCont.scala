package controllers

import javax.inject._
import play.api.mvc._
import play.api.i18n._
import play.api.libs.json._
import models._

@Singleton
class OneMessCont @Inject() (cc: ControllerComponents) extends AbstractController(cc) {
  def load = Action { implicit request =>
    println("loading")
    Ok(views.html.onemess())
  }

  def getOneMess = Action { implicit request =>
    println("Getting onemess")
    Ok(models.OneMess.displayMess())
  }
  
}