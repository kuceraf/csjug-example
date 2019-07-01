package cz.csjug.example.d_spring

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class KotlinService {
    @Autowired
    lateinit var javaService: JavaService // Normally, properties declared as having a non-null type must be initialized in the constructor

    @PostConstruct
    fun setUp() {
        javaService.printMessage("Message for Java service");
    }
}