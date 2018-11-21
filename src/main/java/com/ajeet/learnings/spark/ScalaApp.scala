package com.ajeet.learnings.spark

object ScalaApp extends App {
  val list:List[String] = List("")//List("A", "B", "C")

  list match {
    case Nil => println("List is null")
    case x::Nil => println("'" + x + "'")
    case x::xs => println("head was " + x + ", tail was " + xs)
  }


}
