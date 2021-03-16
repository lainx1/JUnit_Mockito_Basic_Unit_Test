package com.lain.calculator.mockito

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito

import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class LoginModelTest {

    @Mock
    private lateinit var presenter: Login.Presenter

    private lateinit var loginModel: LoginModel

    @Before
    fun setUp(){
        loginModel = LoginModel(presenter)
    }

    @Test
    fun shouldSuccessWithValidUserAndPassword(){

        loginModel.validateUser(user = "andrea", password = "1234")
        Mockito.verify(presenter).validUser()

    }

    @Test
    fun shouldErrorWitInvalidUserAndPassword(){

        loginModel.validateUser(user = "andreaa", password = "1234")
        Mockito.verify(presenter).error()

    }

}