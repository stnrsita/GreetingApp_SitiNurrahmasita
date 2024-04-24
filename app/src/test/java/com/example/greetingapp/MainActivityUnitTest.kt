package com.example.greetingapp

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

class MainActivityUnitTest {

    @Mock
    lateinit var mockMainActivity: MainActivity

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun generateGreetingNotEmpty() {
        `when`(mockMainActivity.generateGreeting("John Doe")).thenReturn("Hello, John Doe!")
        val greeting = mockMainActivity.generateGreeting("John Doe")
        assertEquals("Hello, John Doe!", greeting)
    }

    @Test
    fun generateGreetingEmpty() {
        `when`(mockMainActivity.generateGreeting("")).thenReturn("Please enter your name.")
        val greeting = mockMainActivity.generateGreeting("")
        assertEquals("Please enter your name.", greeting)
    }
}
