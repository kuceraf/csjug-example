package cz.csjug.example.d_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JavaService {
    @Autowired KotlinStateService kotlinStateService;

    public void printMessage(String message) {
        System.out.println(message);
    }

    private void changeState() {
        kotlinStateService.changeState();
    }

}
