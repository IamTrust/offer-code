package edu.gdut.controller;

import edu.gdut.util.ResponseDate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/ping")
    public ResponseDate ping() {
        return ResponseDate.success().data("ping", "pong");
    }
}
