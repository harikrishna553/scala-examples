package com.sample.app

import com.sample.app.dao.User
import com.sample.app.dto.UserDto

object MainApp extends App {

  val user1 = new User(1, "Ram")

  val userDto1 = new UserDto(1, "Ram")

  println(user1)

  println(userDto1)

}