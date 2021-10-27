package Assignment4

object IntersectionAndUnion {
  def Union(set1: Set[Int],set2:Set[Int] ):Set[Int]= set1 ++ set2

  def Intersection(set1: Set[Int], set2: Set[Int]): Set[Int] = {
    val temp:Set[Int]=Set()
    if(set1.isEmpty || set2.isEmpty){
      temp
    }
    val temp2=set1--set2
    set1--temp2
  }
}
