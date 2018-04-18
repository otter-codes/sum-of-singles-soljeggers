import org.scalatest._

class SumOfStringsSpec extends WordSpec with MustMatchers {

  "SumOfStrings" must {

    "when given a list of 1, 1 return 0 " in {
      SumOfStrings.singleSum(List(1,1)) mustEqual 0
    }

  }

}
