package {{cookiecutter.package_name}}.R

{{cookiecutter.package_name}}.activity

import android.view.View
import junit.framework.Assert.assertEquals
import {{cookiecutter.package_name}}.R
import {{cookiecutter.package_name}}.application.TestDaggerSetupApplication
import org.junit.Before
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment

/**
 * Tests created to test functional requirements for the MainActivity
 *
 * To run, remove the @ignore annotation and update the JUnit Run configuration with the following
 *
 * VM Options : -ea -noverify
 * Working directory : $MODULE_DIR$
 *
 * Details on running Robolectric tests in Android Studio can be found at http://robolectric.org/other-environments/
 *
 * Created by jdvp on 6/19/18.
 */
@Ignore
@RunWith(RobolectricTestRunner::class)
class MainActivityTest {


    /**
     * Builds the activity under test. Call after setting the mocks appropriately
     *
     * @return A resumed version of MainActivity
     */
    private val resumedActivity: MainActivity
        get() = Robolectric.buildActivity(MainActivity::class.java)
                .create().start().resume().visible().get()


    @Before
    fun setup() {
        //inject the unit test with the same dependencies that will be injected into the activity
        val app = RuntimeEnvironment.application as TestDaggerSetupApplication
        app.testAppComponent.inject(this)
    }


    //todo add actual tests here

    @Test
    fun testVisible() {
        val mainActivity = resumedActivity

        assertEquals(View.VISIBLE, mainActivity.findViewById<View>(R.id.hello_world_text_view).visibility)
    }
}
