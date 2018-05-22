package hi

import org.scalatest.FunSuite

class HiTest extends FunSuite{
  val hi = new HelloWorld
  test("get hi message123"){
    assert(hi.greeting("hi") === "hi")
  }
}
