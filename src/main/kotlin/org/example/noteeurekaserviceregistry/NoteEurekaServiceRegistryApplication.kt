package org.example.noteeurekaserviceregistry

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class NoteEurekaServiceRegistryApplication

fun main(args: Array<String>) {
    runApplication<NoteEurekaServiceRegistryApplication>(*args)
}
