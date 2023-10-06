package com.tuengo.security.greeting;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greeting")
public class Greeting {

    @GetMapping
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok("Hello from Spring Security");
    }
}
