package com.vokilam.test_spec_mockito

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Test
import org.mockito.Mockito

import org.junit.Assert.assertEquals
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

/**
 * Example local unit test, which will execute on the development machine (host).

 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(JUnitPlatform::class)
class ExampleUnitTestKotlinSpek : Spek({
    given("MainActivity") {
        on("mock activity") {
            val activity = Mockito.mock(MainActivity::class.java)
            it("test") {
                Mockito.verify(activity)
            }
        }
    }
})