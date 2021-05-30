package com.kadirkuruca.androidtest_kotlin.utils

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class MathUtilTest{

    @Test
    fun `Fibonacci(5) equals 5`(){
        val result = MathUtil.fib(5)

        assertThat(result).isEqualTo(5)
    }

    @Test
    fun `Fibonacci(6) is greater than 5`(){
        val result = MathUtil.fib(6)

        assertThat(result).isGreaterThan(5)
    }

    @Test
    fun `Fibonacci(7) is not equal to 8`(){
        val result = MathUtil.fib(7)

        assertThat(result).isNotEqualTo(8)
    }
}