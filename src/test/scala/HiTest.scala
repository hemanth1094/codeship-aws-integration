import org.scalatest.FunSuite

class HiTest extends FunSuite{
  val hi = new HelloWorld
  test("get hi message"){
    assert(hi.greeting("hi") === "hi")
  }
}
