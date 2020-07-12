package com.sample.app.model

class Employee(id: Int, firstName: String, lastName: String) {
  
  override def toString = s"$id : ($firstName, $lastName)"
  
}