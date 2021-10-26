package Assignment4

object IntersectionAndUnion {
  def Union(set1: Set[Int],set2:Set[Int] ):Set[Int]= set1 ++ set2

  def Intersection(set1: Set[Int], set2: Set[Int]): Set[Int] = {
    val i:Set[Int]=Set()
    if(set1.isEmpty || set2.isEmpty){
      i
    }
    val temp2=set1--set2
    set1--temp2
  }
}
