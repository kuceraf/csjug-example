package cz.csjug.example.d_spring

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class KotlinService {
    @Autowired
    lateinit var javaService: JavaService

    @PostConstruct
    fun setUp() {
        javaService.printMessage("Good bye");
    }
}