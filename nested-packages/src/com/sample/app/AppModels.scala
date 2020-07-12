package com.sample.app

package com {
  package sample {
    package app {

      package dao {
        class User(id: Int, name: String) {
          override def toString = s"$id : ($name)"
        }
      }

      package dto {
        class UserDto(id: Int, name: String) {
          override def toString = s"$id : ($name)"
        }
      }

    }
  }
}
