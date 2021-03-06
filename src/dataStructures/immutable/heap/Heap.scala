/** ****************************************************************************
  * Data Structures in Scala
  *
  * Pepe Gallardo, 2018
  * ****************************************************************************/

package dataStructures.immutable.heap

trait Heap[A] {
  def isEmpty: Boolean

  def size: Int

  def insert(x: A): Heap[A]

  def minElem: A

  def delMin: Heap[A]
}
