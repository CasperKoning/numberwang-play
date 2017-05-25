package controllers

import org.scalatestplus.play._
import play.api.test._
import play.api.test.Helpers._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 *
 * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
 */
class NumberwangControllerSpec extends PlaySpec with OneAppPerTest {

  "HomeController GET" should {

    "render the index page from a new instance of controller" in {
      val controller = new NumberwangController
      val home = controller.isNumberwang.apply(FakeRequest())

      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
      contentAsString(home) must include ("That's Numberwang!")
    }

    "render the index page from the application" in {
      val controller = app.injector.instanceOf[NumberwangController]
      val home = controller.isNumberwang().apply(FakeRequest())

      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
      contentAsString(home) must include ("That's Numberwang!")
    }

    "render the index page from the router" in {
      // Need to specify Host header to get through AllowedHostsFilter
      val request = FakeRequest(GET, "/numberwang").withHeaders("Host" -> "localhost")
      val home = route(app, request).get

      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
      contentAsString(home) must include ("That's Numberwang!")
    }
  }
}
