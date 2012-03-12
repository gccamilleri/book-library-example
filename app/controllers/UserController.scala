package controllers

import play.api._
import play.api.mvc._


/**
 * Created by IntelliJ IDEA.
 * User: glca
 * Date: 3/12/12
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */

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