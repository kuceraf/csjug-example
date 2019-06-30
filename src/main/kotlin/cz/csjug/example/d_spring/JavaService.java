package cz.csjug.example.d_spring;

import org.springframework.stereotype.Service;

@Service
public class JavaService {
    public void printMessage(String message) {
        System.out.println(message);
    }
}
