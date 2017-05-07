package com.vokilam.test_spec_mockito

import org.junit.Test
import org.mockito.Mockito

import org.junit.Assert.assertEquals

/**
 * Example local unit test, which will execute on the development machine (host).

 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTestKotlin {
    @Test
    @Throws(Exception::class)
    fun addition_isCorrect() {
        val activity = Mockito.mock(MainActivity::class.java)
        assertEquals(4, (2 + 2).toLong())
    }
}