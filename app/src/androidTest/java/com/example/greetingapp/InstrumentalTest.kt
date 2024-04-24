package com.example.greetingapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class InstrumentalTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    /**
     * Test case untuk memastikan bahwa saat teks pada EditText tidak kosong, setelah tombol Greet ditekan, teks salam yang sesuai ditampilkan di TextView. Berikut adalah langkah-langkah yang dieksekusi:
     * 1. Memastikan bahwa teks "John Doe" dimasukkan ke dalam EditText dengan ID R.id.editTextName.
     * 2. Memastikan bahwa tombol Greet dengan ID R.id.buttonGreet ditekan.
     * 3. Memeriksa apakah TextView dengan ID R.id.textViewGreeting menampilkan teks "Hello, John Doe!" sesuai yang diharapkan.
     */
    @Test
    fun testEditTextNotEmpty() {
        onView(withId(R.id.editTextName)).perform(replaceText("John Doe"))
        onView(withId(R.id.buttonGreet)).perform(click())
        onView(withId(R.id.textViewGreeting)).check(matches(withText("Hello, John Doe!")))
    }

    /**
     * Test case untuk memastikan bahwa saat tombol Greet ditekan tanpa teks di EditText, pesan yang meminta pengguna untuk memasukkan nama ditampilkan di TextView. Berikut adalah langkah-langkah yang dieksekusi:
     * 1. Memastikan bahwa tombol Greet dengan ID R.id.buttonGreet ditekan.
     * 2. Memeriksa apakah TextView dengan ID R.id.textViewGreeting menampilkan pesan "Please enter your name." sesuai yang diharapkan.
     */
    @Test
    fun testGreetButton() {
        onView(withId(R.id.buttonGreet)).perform(click())
        onView(withId(R.id.textViewGreeting)).check(matches(withText("Please enter your name.")))
    }
}