package com.cj.dscimeca.scala

object HelloService{
  def printSimple(): Unit ={
    var a = 0
    a += 1
    System.out.println("hello service");
    if( a == 1){
      println("aaaaaaacccalso this is very cool hh1")
    } else {
      println("bbbbbbb")
    }
  }
}