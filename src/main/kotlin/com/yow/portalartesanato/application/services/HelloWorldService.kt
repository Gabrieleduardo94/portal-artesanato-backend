package com.yow.portalartesanato.application.services

import org.springframework.stereotype.Service

@Service
class HelloWorldService() {

    fun helloWorld(): String {
        return "Hello World"
    }

}