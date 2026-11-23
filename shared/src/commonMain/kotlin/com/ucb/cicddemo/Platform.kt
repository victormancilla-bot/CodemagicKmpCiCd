package com.ucb.cicddemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform