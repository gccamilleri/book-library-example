package model.library

/**
 * Created by IntelliJ IDEA.
 * User: glca
 * Date: 3/12/12
 * Time: 8:51 PM
 * To change this template use File | Settings | File Templates.
 */

case class Book (
                  id : String,
                  name : String = "",
                  author : String = "",
                  location : String,
                  borrower : String
                )