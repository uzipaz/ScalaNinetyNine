object ListProblems {
    // P01
    def last(list: List[Any]): Any = { 
        list.length match {
            case 0 => Nil
            case _ => list.last
        }
    }

    // P02
    def penultimate(list: List[Any]): Any = {
        list.length match {
            case x if x == 0 => Nil
            case x if x == 1 => list.head
            case x if x > 1 => list(list.length - 2)
        }
    }

    //P03
    def nth(n: Int, list: List[Any]): Any = {
        def iterate(i: Int, list: List[Any]): Any = {
            (i, list) match {
                case (x, list) if x == n => list.head
                case (x, head :: tail) => iterate(x + 1, tail)
                case (_, Nil) => Nil
            }
        }

        iterate(0, list)
    }
}