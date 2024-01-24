package org.springtask.pmbackend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PmBackendController {
    @RequestMapping
    public String heloWorld() {
        return "Hello World from Spring Boot";
    }
}
