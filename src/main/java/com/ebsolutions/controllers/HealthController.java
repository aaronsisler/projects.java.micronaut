package com.ebsolutions.controllers;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;


@Controller("/health")
public class HealthController {
    @Get
    HttpStatus index() {
        return HttpStatus.OK;
    }
}