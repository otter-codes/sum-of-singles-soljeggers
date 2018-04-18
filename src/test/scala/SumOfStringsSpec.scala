import org.scalatest._

class SumOfStringsSpec extends WordSpec with MustMatchers {

  "SumOfStrings" must {

    "when given a list of 1, 1 return 0 " in {
      SumOfStrings.singleSum(List(1,1)) mustEqual 0
    }

    "when given a list of 1, 2 return 3" in {
      SumOfStrings.singleSum(List(1,2)) mustEqual 3
    }

    "when given a list of 1,2,3 return 6" in {
      SumOfStrings.singleSum(List(1,2,3)) mustEqual 6
    }
    "when given a list of 1,2,2,3 return 3" in {
      SumOfStrings.singleSum(List(1,2,2,3)) mustEqual 4
    }
    "when given a List of 4,5,7,5,4,8 return 15" in {
      SumOfStrings.singleSum(List(4,5,7,5,4,8)) mustEqual 15
    }
    "when given a list of 1,1,2,2,3,3,4,5 return 9" in {
      SumOfStrings.singleSum(List(1,1,2,2,3,3,4,5)) mustEqual 9
    }

  }

}
