package devops.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ben Huang
 * @version 1.0.0
 * @ClassName DemoController.java
 * @Description TODO
 * @createTime 2024年03月28日 13:43:00
 */
@RestController
@RequestMapping
public class DemoController {
    @GetMapping("/")
    public String helloWorld(){
        return "Hello Java !";
    }
}
