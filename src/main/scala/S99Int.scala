package arithmetic {
    class S99Int(val start: Int) {
        import S99Int._

        def isPrime: Boolean = {
            def checkPrime(counter: Int, num: Int): Boolean = {
                num % counter match {
                    case 0 => false
                    case _ => {
                        counter match {
                            case x if x*2 > num => true
                            case _ => checkPrime(counter + 2, num)
                        }
                    }
                }
            }

            start match {
                case x if x == 1 => false
                case x if x % 2 == 0 => false
                case x if x % 2 == 1 => {
                    checkPrime(3, x)
                }
            }
        }
    }

    object S99Int {
        implicit def int2S99Int(i: Int): S99Int = new S99Int(i)
    }
}