package com.lain.calculator.mockito

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.Spy
import org.mockito.junit.MockitoJUnitRunner
import java.lang.RuntimeException
import org.mockito.Mockito.`when` as wheen

@RunWith(MockitoJUnitRunner::class)
class LoginPresenterTest{


    @Mock
    private lateinit var view: Login.View

    @Mock
    private lateinit var model: Login.Model

    private lateinit var presenter: LoginPresenter


    @Before
    fun setup(){
        presenter = LoginPresenter(view)
    }

    @Test
    fun showShowErrorMessageWhenTheUserOrPasswordIsIncorrectTest(){
        wheen(view.userName()).thenReturn("Maria")
        wheen(view.password()).thenReturn("1273891237")

        presenter.validUser(view.userName(), view.password())
        
        verify(view).error()
    }

    @Test
    fun shouldCallUserValidWhenUserAndPasswordIsRightTest(){
        //Hace una llamada real al metodo
        wheen(view.userName()).thenReturn("andrea")
        wheen(view.password()).thenReturn("1234")

        assertEquals("andrea", view.userName())
        assertEquals("1234", view.password())

        presenter.validUser(
                user = view.userName(),
                password = view.password()
        )

        verify(view).userValid()
    }

    @Test
    fun shouldThrowingException(){
        wheen(view.userName()).thenThrow(RuntimeException::class.java)
        try {
            view.userName()
        }catch (runtTimeException: RuntimeException){

        }
    }

    @Test
    fun shouldCallUserValidWhenUserAndPasswordIsRightDoReturnTest(){
        //No hace una llamada real al metodo
        doReturn("andrea").`when`(view).userName()
        assertEquals("andrea", view.userName())
    }

    @Test
    fun shouldCallUserValidWhenUserAndPasswordIsRightTest2(){
        //Hace una llamada real al metodo
        wheen(view.userName()).thenReturn("andrea")
        wheen(view.password()).thenReturn("1234")

        assertEquals("andrea", view.userName())
        assertEquals("1234", view.password())

        presenter.validUser(
                user = view.userName(),
                password = view.password()
        )

        verify(view).userValid()
        verify(view, times(1)).userValid()
        verify(view, never()).userValid()

        //Pasa si se llama al menos 1 vez
        verify(view, atLeast(4)).userValid()

        //Pasa si se llama menos de 7 veces
        verify(view, atMost(7)).userValid()

        //Solo 1 vez
        verify(view, only()).userValid()
    }

    @Mock
    val mockList = mutableListOf<String>()

    @Spy
    val spyList = mutableListOf<String>()

    @Test
    fun spyTest(){

        spyList.add("one")
        spyList.add("two")

        verify(spyList).add("one")
        verify(spyList).add("two")

        assertEquals(2, spyList.size)

    }

    @Test
    fun mockTest(){

        mockList.add("one")
        mockList.add("two")

        verify(mockList).add("one")
        verify(mockList).add("two")

        assertEquals(2, mockList.size)

    }




}