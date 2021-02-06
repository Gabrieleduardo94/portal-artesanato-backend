package com.yow.portalartesanato.web.controllers

import com.yow.portalartesanato.application.services.HelloWorldService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @Autowired
    lateinit var helloWorldService: HelloWorldService;

    @GetMapping
    fun Index(): String {
        return helloWorldService.helloWorld()
    }
}