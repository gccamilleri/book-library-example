package services

import model.library.{User, Librarian, Borrower}
import collection.mutable.Map

sealed trait UserService[A <: User] {

  protected val users : Map[String, A]


  def registerUser(user: A) : Option[A] = {
    users.get(user.id) match {
      case None => {
        users += user.id -> user
        Some(user)
      }
      case Some(l) => None
    }
  }

  def deregisterUser(userId : String) : Unit = {
    users -= userId
  }

  def updateUser(user : A) : Option[A] = {
    users.get(user.id) map { l =>
      users += user.id -> user
      user
    }
  }

  def getUser(userId : String) : Option[A] = users.get(userId)

  def getUsers : Seq[A] = users.values.toSeq

}

object BorrowerService extends UserService[Borrower] {
  protected val users = Map.empty[String, Borrower]
}

object LibrarianService extends UserService[Librarian] {
  protected val users = Map.empty[String, Librarian]
}