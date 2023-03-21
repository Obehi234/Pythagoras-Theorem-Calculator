package com.example.pythagorastheoremcalculator

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test


class MainActivityTest {

    @Test
    fun test_CalculateResult_ReturnsAccurateValue() {
        val expected = 5.0
        val actual = MainActivity().calculateResult(3.0, 4.0)
        assertThat(actual, `is`(expected))

    }
}