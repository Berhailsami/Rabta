package com.example.rabta

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform