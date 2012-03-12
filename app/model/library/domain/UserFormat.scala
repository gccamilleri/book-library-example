package model.library.domain

import model.library.{Borrower, Librarian}
import play.api.libs.json._

/**
 * Created by IntelliJ IDEA.
 * User: glca
 * Date: 3/12/12
 * Time: 10:26 PM
 * To change this template use File | Settings | File Templates.
 */

object UserFormat {

  implicit object LibrarianFormat extends Format[Librarian] {
    def reads(json : JsValue): Librarian = Librarian (
      (json \ "id").as[String],
      (json \ "name").as[String],
      (json \ "station").as[String]
    )

    def writes(l : Librarian): JsValue = JsObject( Seq(
        "id" -> JsString(l.id),
        "name" -> JsString(l.name),
        "station" -> JsString(l.station)
    ))
  }

  implicit object BorrowerFormat extends Format[Borrower] {
    def reads(json : JsValue): Borrower = Borrower (
      (json \ "id").as[String],
      (json \ "name").as[String],
      (json \ "email").as[String],
      (json \ "maxBorrows").as[Int]
    )

    def writes(b : Borrower): JsValue = JsObject( Seq(
        "id" -> JsString(b.id),
        "name" -> JsString(b.name),
        "email" -> JsString(b.email),
        "maxBorrows" -> JsNumber(b.maxBorrows)
    ))
  }
}