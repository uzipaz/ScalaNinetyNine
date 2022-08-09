import ListProblems._

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
  }
}