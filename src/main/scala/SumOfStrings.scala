object SumOfStrings extends App {

  def singleSum (numberList : List[Int]) : Int = {

    val removeDuplicates = numberList.distinct
    val pullDupes = numberList.diff(removeDuplicates)
    val pullNonDupes = removeDuplicates.diff(pullDupes)

    pullNonDupes.sum
  }
}
