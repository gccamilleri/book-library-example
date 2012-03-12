package controllers

import play.api._
import play.api.mvc._

/**
 * Created by IntelliJ IDEA.
 * User: glca
 * Date: 3/12/12
 * Time: 8:58 PM
 * To change this template use File | Settings | File Templates.
 */

object BookController extends Controller {

  def registerBook = Action {
    Ok(views.html.index("WIP"))
  }

  def deregisterBook(id : String) = Action {
    Ok(views.html.index("WIP"))
  }

  def getBook(id : String) = Action {
    Ok(views.html.index("WIP"))
  }

  def getBooks = Action {
    Ok(views.html.index("WIP"))
  }

  def lendBook = Action {
    Ok(views.html.index("WIP"))
  }

  def returnBook = Action {
    Ok(views.html.index("WIP"))
  }

}