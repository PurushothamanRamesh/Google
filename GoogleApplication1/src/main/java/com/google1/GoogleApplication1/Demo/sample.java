package com.google1.GoogleApplication1.Demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Out")
public class sample {
    @GetMapping("/get")
    public ResponseEntity<String> helo(){
        return ResponseEntity.ok("Code is Working Properly in sample class");
    }

    @PostMapping("/post")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Code is Working Properly in sample class");
    }
}
