package Assignment4

abstract class IntTree
case object EmptyTree extends IntTree
case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree

object NewTree {
  def contains(t: IntTree, v: Int): Boolean = t match {
    case EmptyTree => false
    case node: Node if node.elem == v => true
    case node: Node => contains(node.left, v) || contains(node.right, v)
  }

  def insert(t: IntTree, v: Int): IntTree = t match {
    case EmptyTree
    => Node(v, EmptyTree, EmptyTree)
    case node: Node if size(node.left) < size(node.right)
    => Node(node.elem, insert(node.left, v), node.right)
    case node: Node
    => Node(node.elem, node.left, insert(node.right, v))
  }

  def size(intTree: IntTree): Int = {
    intTree match {
      case EmptyTree => 0
      case node: Node => 1 + size(node.left) + size(node.right)
    }
  }
}