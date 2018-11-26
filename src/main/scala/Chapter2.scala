object Chapter2 {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(i:Int):Boolean = {
      if (i == (as.length-2))
        ordered(as(as.length-2),as(as.length-1))
      else if (ordered(as(i), as(i+1))) go(i+1)
      else false
    }
    go(0)
  }

  def curry[A,B,C](f: (A, B) => C): A => (B => C) = a => b => f(a,b)
}