package com.lain.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.lain.calculator.mockito.Login
import com.lain.calculator.mockito.LoginPresenter
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() , Login.View{

    val presenter = LoginPresenter(view = this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onStart() {
        super.onStart()

        loginBTN.setOnClickListener {
            presenter.validUser(
                user = userName(),
                password = password()
            )
        }
    }

    override fun userValid() {
        startActivity(Intent(
            this,
            MainActivity::class.java
        ))
    }

    override fun error() = Toast.makeText(this, "Usuario no valido", Toast.LENGTH_SHORT).show()

    override fun userName(): String =  userET.text.toString()

    override fun password(): String = passwordET.text.toString()

}