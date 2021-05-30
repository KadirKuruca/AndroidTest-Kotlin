package com.kadirkuruca.androidtest_kotlin.utils

object RegistrationUtil {

    private val existingUser = listOf("Mike","Alison","Peter","Alex")

    /**
     * the input is not valid if...
     * ... the username/password is empty
     * ... the username is already taken
     * ... passwords not matched
     * ... the password contains less than 2 digits
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ):Boolean{
        if(username.isEmpty() || password.isEmpty())
            return false
        if(username in existingUser)
            return false
        if(password != confirmedPassword)
            return false
        if(password.count { it.isDigit() } < 2)
            return false

        return true
    }
}