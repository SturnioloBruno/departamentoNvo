package com.example.Dpto.login.controller;

import com.example.Dpto.login.dto.AuthenticationRequest;
import com.example.Dpto.login.dto.AuthenticationResponse;
import com.example.Dpto.login.service.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PreAuthorize("permitAll")
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody @Valid AuthenticationRequest authRequest) {

        AuthenticationResponse jwtDto = authenticationService.login(authRequest);
        return ResponseEntity.ok(jwtDto);
    }

    @PreAuthorize("permitAll")
    @GetMapping("/public-access")
    public String pubclicAccessEndpoint() {
        return "este endpoint es publico";
    }
}
