package com.soccernow

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}