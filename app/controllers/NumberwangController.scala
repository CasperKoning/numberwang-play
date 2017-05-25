package controllers

import play.api.mvc._

class NumberwangController extends Controller {

  def isNumberwang = Action { implicit request =>
    Ok(views.html.numberwang())
  }

}
