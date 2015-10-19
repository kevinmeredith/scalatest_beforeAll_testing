package net

import org.scalatest._

class Test extends FunSpec with BeforeAndAfterAll {

	override def beforeAll: Unit = {
		println("beforeAll")
	}

	describe("running a test") {
		println("in describe")

		it("should do something") {
			println("in my test")
			assert(true)
		}
	}
}