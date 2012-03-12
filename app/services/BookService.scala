package services

import model.library.Book

object BookService {

  private var books = Map.empty[String, Book]

  def registerBook(book : Book) : Option[Book] = {
    books.get(book.id) match {
      case None => {
        books += book.id -> book
        Some(book)
      }
      case Some(b) => None
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