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

    //P04
    def length(list: List[Any]): Any = {
        def count(i: Int, list: List[Any]): Any = {
            list match {
                case Nil => i
                case current :: tail => count(i + 1, tail)
            }
        }

        count(0, list)
    }
}