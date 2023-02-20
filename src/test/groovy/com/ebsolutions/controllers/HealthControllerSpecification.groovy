package com.ebsolutions.controllers

import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification
import spock.lang.Unroll

@MicronautTest
class HealthControllerSpecification extends Specification {
    @Inject
    @Client('/')
    HttpClient client

    @Unroll
    void "Health controller should return correct response"() {

        when: "the health endpoint is invoked"
        HttpStatus response = client.toBlocking().retrieve(HttpRequest.GET("/health"), HttpStatus)

        then: "the it should return the correct response"
        response == HttpStatus.OK
    }


}
