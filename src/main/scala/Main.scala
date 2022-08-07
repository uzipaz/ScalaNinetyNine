import ListProblems._

object S99 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 4, 7, 9)
    println(s"${list}")
    println(s"last: ${last(list)}")
    println(s"penultimate: ${penultimate(list)}")
  }
}