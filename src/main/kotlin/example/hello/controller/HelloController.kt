package example.hello.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

const val DEFAULT_NAME = "AWS"

@RestController
@RequestMapping("/hello")
class HelloController {

    @GetMapping
    fun sayHello(@RequestParam(required = false) name: String?): String {
        return "Hello ${name ?: DEFAULT_NAME}"
    }
}
