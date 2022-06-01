package com.thao.kmm

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    fun countryName(): String {
        return "My countr ${Country().countryName}"
    }
}