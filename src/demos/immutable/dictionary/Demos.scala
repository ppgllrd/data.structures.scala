/** ****************************************************************************
  * Data Structures in Scala
  *
  * Pepe Gallardo, 2018
  * ****************************************************************************/

package demos.immutable.dictionary

import dataStructures.immutable.dictionary.{BSTDictionary, Dictionary}

object Demos extends App {

  var d1: Dictionary[Int, String] = BSTDictionary[Int, String]()

  d1 = d1.insert(1, "One")
  d1 = d1.insert(2, "Two")
  d1 = d1.insert(0, "Zero")

  println(d1)

  d1 = d1.delete(2)

  println(d1)

  println(d1.valueOf(0))


  val factory = BSTDictionary.factory[Int, String]

  var d2: Dictionary[Int, String] = factory.empty

  d2 = d2.insert(1, "One")
  d2 = d2.insert(2, "Two")
  d2 = d2.insert(0, "Zero")

  println(d2)

  d2 = d2.delete(2)

  println(d2)

  println(d2.valueOf(0))
}
