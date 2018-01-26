import org.scalatest.FunSuite
import org.slf4j.LoggerFactory
import org.slf4j.Logger

class HelloWorldTest extends FunSuite{
  val logger: Logger = LoggerFactory.getLogger(this.getClass())
  val helloWorld = new HelloWorld
  test("able get message"){
    logger.info("testing...")
    assert(helloWorld.greeting("hi") === "hi")
  }
}
