package com.example.petadoption;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasErrorText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anyOf;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule
            = new ActivityScenarioRule<MainActivity>(MainActivity.class);
    @Test
    public void canSignIn() throws InterruptedException {

        onView(withId(R.id.user)).perform(typeText("JeffW"));
        onView(withId(R.id.pass)).perform(typeText("password"));
        onView(withId(R.id.gotoSignIn)).perform(click());
        onView(anyOf(withId(R.id.adoptions_view))).check(matches(isDisplayed()));

    }
    @Test
    public void canGotoSignUp() throws InterruptedException {

        onView(withId(R.id.gotoSignUp)).perform(click());
        onView(anyOf(withId(R.id.signup_view))).check(matches(isDisplayed()));

    }
}
