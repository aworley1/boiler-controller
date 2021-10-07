package io.github.aworley1.boiler_controller

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class HelloWorldTest {
    @Test
    fun `should return hello world`() {
        assertThat(HelloWorld().helloWorld()).isEqualTo("Hello World!")
    }
}