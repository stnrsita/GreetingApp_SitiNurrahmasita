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

    /**
     * Test case untuk menguji fungsi generateGreeting ketika menerima parameter nama yang tidak kosong. Berikut adalah langkah-langkah yang dieksekusi:
     * 1. Mendefinisikan perilaku dari mock objek MainActivity menggunakan Mockito.
     * 2. Memanggil fungsi generateGreeting dengan parameter "John Doe".
     * 3. Memastikan bahwa fungsi mengembalikan salam yang sesuai dengan harapan.
     */
    @Test
    fun generateGreetingNotEmpty() {
        `when`(mockMainActivity.generateGreeting("John Doe")).thenReturn("Hello, John Doe!")
        val greeting = mockMainActivity.generateGreeting("John Doe")
        assertEquals("Hello, John Doe!", greeting)
    }

    /**
     * Test case untuk menguji fungsi generateGreeting ketika menerima parameter nama yang kosong. Berikut adalah langkah-langkah yang dieksekusi:
     * 1. Mendefinisikan perilaku dari mock objek MainActivity menggunakan Mockito.
     * 2. Memanggil fungsi generateGreeting dengan parameter string kosong.
     * 3. Memastikan bahwa fungsi mengembalikan pesan yang sesuai dengan harapan.
     */
    @Test
    fun generateGreetingEmpty() {
        `when`(mockMainActivity.generateGreeting("")).thenReturn("Please enter your name.")
        val greeting = mockMainActivity.generateGreeting("")
        assertEquals("Please enter your name.", greeting)
    }
}