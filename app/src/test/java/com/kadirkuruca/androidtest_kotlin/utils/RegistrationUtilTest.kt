package com.kadirkuruca.androidtest_kotlin.utils

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated passwords returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Kadir",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `username already taken returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Mike",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Kadir",
            "",
            ""
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Kadir",
            "12",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digit password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Kadir",
            "asd1",
            "asd1"
        )

        assertThat(result).isFalse()
    }
}