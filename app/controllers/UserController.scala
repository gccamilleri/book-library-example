package controllers

import play.api._
import play.api.mvc._

object UserController extends Controller {

  // librarians
  def registerLibrarian = Action {
    Ok(views.html.index("WIP"))
  }

  def deregisterLibrarian(id : String) = Action {
    Ok(views.html.index("WIP"))
  }

  def updateLibrarian = Action {
    Ok(views.html.index("WIP"))
  }

  def getLibrarian(id : String) = Action {
    Ok(views.html.index("WIP"))
  }

  def getLibrarians = Action {
    Ok(views.html.index("WIP"))
  }

  // borrower
  def registerBorrower = Action {
    Ok(views.html.index("WIP"))
  }

  def updateBorrower = Action {
    Ok(views.html.index("WIP"))
  }

  def getBorrower(id : String) = Action {
    Ok(views.html.index("WIP"))
  }

  def getBorrowers = Action {
    Ok(views.html.index("WIP"))
  }

  def signInBorrower = Action {
    Ok(views.html.index("WIP"))
  }

}