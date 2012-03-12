package services

import model.library.Book
import javax.management.remote.rmi._RMIConnection_Stub

/**
 * Created by IntelliJ IDEA.
 * User: glca
 * Date: 3/12/12
 * Time: 9:00 PM
 * To change this template use File | Settings | File Templates.
 */

object BookService {

  private var books = Map.empty[String, Book]

  def registerBook(book : Book) : Either[Book, Book] = {
    books.get(book.id) match {
      case None => {
        books += book.id -> book
        Right(book)
      }
      case Some(b) => Left(b)
    }
  }

  def deregisterBook(bookId : String) : Unit = {
    books -= bookId
  }

  def getBook(id : String) : Option[Book] = books.get(id)

  def lendBook(book : Book, borrowerId : String) : Option[Book] = {

    books.get(book.id) map { b =>
      val lent = b.copy(borrower =  borrowerId)
      books += lent.id -> lent
      lent
    }

  }

  def returnBook(book : Book) : Option[Book] = lendBook(book, "")


}