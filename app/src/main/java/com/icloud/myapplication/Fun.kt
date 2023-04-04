package com.icloud.myapplication

class Fun {
}


fun main(){
    val user: User = User("     Buba      ",12) // instatiating

    //println("${user.name} ")
   // println("age: ${user.age}")

    val user1: User = User("          Bobo",15)

   // println("${user1.name} ")
  //  println("age: ${user1.age}")

    val user3: User = User(age =  44)

   // println("${user3.name} ")
   // println("age: ${user3.age}")

    val user4: User = User("          ",75)
}

class User(name: String = "No Name yet", var age: Int) {
    //val name = name.trim()

    init {
        println("New user created.   Age: ${age}," )
    }



    val name: String
    init {
        if (name.isBlank()) {
            this.name = "No Name yet"
        } else {
            this.name = name.trim()
        }
       // println("New user created. Name: ${this.name}  and age: ${age} ")
        println("New user name : ${this.name}")
    }






}