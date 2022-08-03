package com.gwi.springdoc.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloWorldResource {

    @GetMapping("/{user}")
    public ResponseEntity<HelloResponse> sayHello(@PathVariable(name = "user") String userName) {
        return ResponseEntity.ok(
                HelloResponse.builder()
                        .userName(userName)
                        .message(String.format("Hello %s. How are you?", userName))
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }
}
