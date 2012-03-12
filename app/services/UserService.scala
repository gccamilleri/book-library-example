package services

import model.library.{User, Librarian, Borrower}
import collection.mutable.Map

/**
 * Created by IntelliJ IDEA.
 * User: glca
 * Date: 3/12/12
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */

sealed trait UserService[A <: User] {

  protected val users : Map[String, A]


  def registerUser(user: A) : Either[A, A] = {
    users.get(user.id) match {
      case None => {
        users += user.id -> user
        Right(user)
      }
      case Some(l) => Left(l)
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