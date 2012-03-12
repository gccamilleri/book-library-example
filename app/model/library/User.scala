package model.library

/**
 * Created by IntelliJ IDEA.
 * User: glca
 * Date: 3/12/12
 * Time: 8:48 PM
 * To change this template use File | Settings | File Templates.
 */

trait User {

  def id : String

}

case class Librarian(id : String, name : String, station : String) extends User
case class Admin(id : String, name : String) extends User
case class Borrower(id : String, name : String, email : String, maxBorrows : Int = 3) extends User
