package site.unanchoi.boilerplate.controller

import org.springframework.web.bind.annotation.GetMapping

@ApiController
class HealthCheckController {

    @GetMapping("/health")
    fun healthCheck(): String {
        return "OK"
    }
}