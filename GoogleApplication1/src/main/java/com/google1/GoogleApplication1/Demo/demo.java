package com.google1.GoogleApplication1.Demo;

import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/code")
public class demo {
    Logger logger;
    @GetMapping
    public ResponseEntity<String> helo(){
        return ResponseEntity.ok("Code is Working Properly");
    }

    public Principal userdata(Principal principal){
        return principal;
    }
    @GetMapping("/user/Data")
    public Object userdata(OAuth2AuthenticationToken principal){
        return principal.getPrincipal().getAttributes();
    }
}
