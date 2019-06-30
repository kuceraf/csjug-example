package cz.csjug.example

import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class ExampleService {

    @PostConstruct
    fun setUp() {
        System.out.println("ExampleService - setUp")
    }
}
