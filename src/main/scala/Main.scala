object S99 {
  def main(args: Array[String]): Unit = {
    println("Hello, World!")
    println(last(List(1, 2, 3, 5)))
  }

  def last(list: List[Any]): Any = {
    list.last
  }
}