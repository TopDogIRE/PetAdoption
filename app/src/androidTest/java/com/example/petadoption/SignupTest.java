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
public class SignupTest {

    @Rule
    public ActivityScenarioRule<Signup> activityScenarioRule
            = new ActivityScenarioRule<Signup>(Signup.class);
    @Test
    public void canEnterNameAndSignUp() throws InterruptedException {
        onView(withId(R.id.name)).perform(typeText("Jeff W"));
        onView(withId(R.id.email)).perform(typeText("Jeff@gmail.com"));
        onView(withId(R.id.username)).perform(typeText("JeffW"));
        onView(withId(R.id.pword)).perform(typeText("password"));

        onView(withId(R.id.goToSecondActivity)).perform(click());

        onView(anyOf(withId(R.id.framecat))).check(matches(isDisplayed()));

    }
    @Test
    public void checkValidEmail() {
        onView(withId(R.id.email)).perform(typeText("bademail"));
        onView(withId(R.id.name)).perform(typeText("Jeff W"));
        onView(withId(R.id.username)).perform(typeText("JeffW"));
        onView(withId(R.id.pword)).perform(typeText("password"));

       onView(withId(R.id.goToSecondActivity)).perform(click());

        onView(allOf(withId(R.id.email), hasErrorText("Email not valid!")));

    }
    @Test
    public void checkNameNotBlank() {
        onView(withId(R.id.name)).perform(typeText(""));
        onView(withId(R.id.goToSecondActivity)).perform(click());
        onView(allOf(withId(R.id.email), hasErrorText("Cannot Be Blank!")));

    }
    @Test
    public void checkEmailNotBlank() {
        onView(withId(R.id.name)).perform(typeText("Jeff W"));
        onView(withId(R.id.email)).perform(typeText(""));
        onView(withId(R.id.goToSecondActivity)).perform(click());
        onView(allOf(withId(R.id.email), hasErrorText("Cannot Be Blank!")));

    }
}
