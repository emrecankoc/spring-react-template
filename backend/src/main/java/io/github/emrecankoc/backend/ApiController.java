package io.github.emrecankoc.backend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ApiController {

    @GetMapping("/hello")
    public ResponseEntity<?> endpointPrintsHello() {
        return ResponseEntity.ok("Hello world");
    }
}
