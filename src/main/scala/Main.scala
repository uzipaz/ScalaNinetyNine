import ListProblems._
import arithmetic.S99Int

object S99 {
  def main(args: Array[String]): Unit = {
    val list = List(11, 9, 9, 11)
    println(s"${list}")
    println(s"last: ${last(list)}")
    println(s"penultimate: ${penultimate(list)}")
    println(s"nth 2: ${nth(2, list)}")
    println(s"length: ${length(list)}")
    println(s"reverse: ${reverse(list)}")
    println(s"isPalindrome: ${isPalindrome(list)}")
    val listOfLists: List[Any] = List(1, 2, List(3, 4, 5), 6, List(7, 8, 9), 10)
    println(s"flatten: ${flatten(listOfLists)}")
    val listDuplicates = List(3, 3, 1, 1, 1, 9, 9, 2, 2, 1, 6, 6, 6, 9, 9, 9)
    println(s"compress: ${compress(listDuplicates)}")
    println(s"packConsecutive: ${packConsecutive(listDuplicates)}")
    val encoded = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(s"run-length encoding: ${encode(encoded)}")
    val s99Int: S99Int = 89
    println(s"isPrime: ${s99Int.isPrime}")
  }
}