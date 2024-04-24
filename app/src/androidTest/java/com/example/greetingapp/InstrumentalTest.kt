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

    @Test
    fun testEditTextNotEmpty() {
        onView(withId(R.id.editTextName)).perform(replaceText("John Doe"))
        onView(withId(R.id.buttonGreet)).perform(click())
        onView(withId(R.id.textViewGreeting)).check(matches(withText("Hello, John Doe!")))
    }

    @Test
    fun testGreetButton() {
        onView(withId(R.id.buttonGreet)).perform(click())
        onView(withId(R.id.textViewGreeting)).check(matches(withText("Please enter your name.")))
    }
}