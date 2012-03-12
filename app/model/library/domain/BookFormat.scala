package model.library.domain

import model.library.Book
import play.api.libs.json.{JsString, JsObject, JsValue, Format}

object BookFormats {

  implicit object BookFormat extends Format[Book] {
    def reads(json: JsValue): Book = Book (
      (json \ "id").as[String],
      (json \ "name").as[String],
      (json \ "author").as[String],
      (json \ "location").as[String],
      (json \ "borrower").as[String]
    )

    def writes(b: Book): JsValue = JsObject( Seq(
      "id" -> JsString(b.id),
      "name" -> JsString(b.name),
      "author" -> JsString(b.author),
      "location" -> JsString(b.location),
      "borrower" -> JsString(b.borrower)
    ))
  }

}