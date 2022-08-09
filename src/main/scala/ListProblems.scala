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

    //P05
    def reverse(list: List[Any]): Any = {
        def rebuild(newList: List[Any], list: List[Any]): List[Any] = {
            list match {
                case Nil => newList
                case item :: tail => rebuild(item :: newList, tail)
            }
        }

        rebuild(Nil, list) 
    }

    //P06
    def isPalindrome(list: List[Any]): Boolean = {
        def doesMatch(counter: Int, list: List[Any]): Boolean = {
            counter match {
                case x if x == (list.length / 2) => true
                case _ => {
                    list(counter) match {
                        case x if x == list((list.length - 1) - counter) => doesMatch(counter + 1, list)
                        case _ => false
                    }
                }
            }
        }

        doesMatch(0, list)
    }
}