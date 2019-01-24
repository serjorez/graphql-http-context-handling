package graphql

import play.api.mvc.{Cookie, Headers}

import scala.collection.mutable.ListBuffer

case class Context(requestHeaders: Headers,
                   newHeaders: ListBuffer[(String, String)] = ListBuffer.empty,
                   newCookies: ListBuffer[Cookie] = ListBuffer.empty)