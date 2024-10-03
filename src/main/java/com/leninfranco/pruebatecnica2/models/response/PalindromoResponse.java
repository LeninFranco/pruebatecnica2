package com.leninfranco.pruebatecnica2.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PalindromoResponse {
    private int lengthCadena;
    private int isPalindromo;
    private int lengthCaracteresEspeciales;
}
