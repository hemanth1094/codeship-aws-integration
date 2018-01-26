import org.scalatest.FunSuite

class HelloWorldTest extends FunSuite{
  val helloWorld = new HelloWorld
  test("able get message"){
    assert(helloWorld.greeting("hi") === "hi")
  }
}
