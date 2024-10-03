package com.leninfranco.pruebatecnica2.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leninfranco.pruebatecnica2.models.request.PalindromoRequest;
import com.leninfranco.pruebatecnica2.models.response.PalindromoResponse;
import com.leninfranco.pruebatecnica2.services.PalindromoService;

@RestController
@RequestMapping("/api/v1/palindromo")
public class PalindromoController {

    private final PalindromoService palindromoService;

    public PalindromoController(PalindromoService palindromoService) {
        this.palindromoService = palindromoService;
    }

    @PostMapping
    public ResponseEntity<PalindromoResponse> postPalindromo(@RequestBody PalindromoRequest request){
        return ResponseEntity.ok(palindromoService.verificarPalindromo(request));
    }
}
