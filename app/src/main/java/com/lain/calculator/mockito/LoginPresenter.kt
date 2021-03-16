package com.lain.calculator.mockito

class LoginPresenter(val view: Login.View) : Login.Presenter {

    val model: Login.Model
    init {
        this.model = LoginModel(presenter = this)
    }

    override fun validUser(user: String, password: String) {
        model.validateUser(
                user = user,
                password = password
        )
    }

    override fun validUser() {
        view.userValid()
    }

    override fun error() {
        view.error()
    }
}