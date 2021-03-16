package com.lain.calculator.mockito

object Login {

    interface View{
        fun userValid()
        fun error()
        fun userName(): String
        fun password(): String
    }

    interface Presenter{
        fun validUser(user: String, password: String)
        fun validUser()
        fun error()
    }

    interface Model{
        fun validateUser(user: String, password: String)
    }

}