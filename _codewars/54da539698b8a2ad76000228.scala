object Solution {
  def isValidWalk(walk: Seq[Char]): Boolean = {
    if (walk.length != 10) false
    else
      walk.foldLeft((0,0)){
        case ((x,y), direction) => direction match {
          case 'n' => (x, y + 1)
          case 's' => (x, y - 1)
          case 'w' => (x - 1, y)
          case 'e' => (x + 1, y)
        }
      }.equals((0,0))
  }
}
