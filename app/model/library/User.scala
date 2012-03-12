package model.library

trait User {

  def id : String

}

case class Librarian(id : String, name : String, station : String) extends User
case class Admin(id : String, name : String) extends User
case class Borrower(id : String, name : String, email : String, maxBorrows : Int = 3) extends User
