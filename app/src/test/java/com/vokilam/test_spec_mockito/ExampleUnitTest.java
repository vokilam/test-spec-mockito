package com.vokilam.test_spec_mockito;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        MainActivity activity = Mockito.mock(MainActivity.class);
        assertEquals(4, 2 + 2);
    }
}