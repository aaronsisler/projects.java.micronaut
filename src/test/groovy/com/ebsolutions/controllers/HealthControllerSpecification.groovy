package com.ebsolutions.controllers

import io.micronaut.http.HttpStatus
import spock.lang.Specification

class HealthControllerSpecification extends Specification {
    def "Health controller should return correct response"() {
        given: "A health controller is running"
        HealthController healthController = new HealthController();

        when: "it is invoked"
        HttpStatus response = healthController.index()

        then: "the it should return the correct response"
        response == HttpStatus.OK
    }
}
