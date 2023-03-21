package com.example.pythagorastheoremcalculator

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    val x: Int = 2
    val y: Int = 2
    val z: Int = 3
    val a: Boolean = (x == y)
    val b: Boolean = (y == z)

    @Test
    fun test_xAndy_areEqual() {
        assertEquals(x, y)
    }

    @Test
    fun test_notEquals() {
        assertNotEquals(x, z)
    }

    @Test
    fun test_AssertTrue() {
        assertTrue(a)
    }

    @Test
    fun test_AssertNotTrue() {
        assertFalse(b)
    }

    @Test
    fun test_NotEquals() {
        assertNotEquals(a, b)
    }
}