object ListProblems {
    def last(list: List[Any]): Any = {
        list.last
    }

    def penultimate(list: List[Any]): Any = {
        list.length match {
            case x if x == 0 => Nil
            case x if x == 1 => list.head
            case x if x > 1 => list(list.length - 2)
        }
    }
}