package uan.edu.co.examplespringgradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/helloworld")
    String home() {
        return "Hello, World!";
    }
}
