package com.lain.calculator.mockito

import java.util.*

class LoginModel(val presenter: Login.Presenter ): Login.Model {

    override fun validateUser(user: String, password: String) {
        if (user.toLowerCase(Locale.ROOT) == "andrea" && password.toLowerCase(Locale.ROOT) == "1234")
            presenter.validUser()
        else
            presenter.error()
    }

}