package io.github.aworley1.boiler_controller

class HelloWorld {
    fun helloWorld(): String = "Hello World!"
}

fun main() {
    println(HelloWorld().helloWorld())
}