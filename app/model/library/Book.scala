package model.library

case class Book (
                  id : String,
                  name : String = "",
                  author : String = "",
                  location : String,
                  borrower : String
                )