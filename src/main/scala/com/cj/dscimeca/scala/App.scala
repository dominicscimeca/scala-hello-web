package com.cj.dscimeca.scala
import javax.servlet.http.{HttpServletRequest, HttpServletResponse}

class App extends HttpApp {
  override def handle(request: HttpServletRequest, response: HttpServletResponse): Unit = {
    HelloService.printSimple()
  }
}
