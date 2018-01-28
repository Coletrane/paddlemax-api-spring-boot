package com.paddlemax.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration
import org.springframework.context.annotation.PropertySource
import org.springframework.context.annotation.PropertySources


@SpringBootApplication
@EnableAutoConfiguration(
    exclude = arrayOf(
        JacksonAutoConfiguration::class))
@PropertySources(arrayOf(
    PropertySource("classpath:application.yml"),
    PropertySource("classpath:auth0.yml")
))
class PaddleMaxApplication

fun main(args: Array<String>) {
    SpringApplication.run(PaddleMaxApplication::class.java, *args)
}
