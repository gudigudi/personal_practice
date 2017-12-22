package com.gudigudigudi.mdtemplate;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.gudigudigudi.mdtemplate.activity.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by gu on 12/22/17.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityInstrumentationTest {

    @Rule
    public ActivityTestRule mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void sayHello() {
        onView(withText("hello world!")).perform(click());
        onView(withId(R.id.button2)).check(matches(withText("hello world!")));
    }
}
