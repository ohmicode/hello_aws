package example.hello.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest
class HelloControllerTest(@Autowired val mockMvc: MockMvc) {

    @Test
    fun canSayHelloAws() {
        val expectedAnswer = "Hello AWS"

        mockMvc.perform(get("/hello"))
            .andExpect(status().isOk)
            .andExpect(content().string(expectedAnswer));
    }

    @Test
    fun canSayHelloName() {
        val name = "World"
        val expectedAnswer = "Hello $name"

        mockMvc.perform(get("/hello").param("name", name))
            .andExpect(status().isOk)
            .andExpect(content().string(expectedAnswer));
    }
}
