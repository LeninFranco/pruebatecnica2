package com.leninfranco.pruebatecnica2.models.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PalindromoRequest {

    @NotBlank(message = "El palindromo no debe ser nulo o vacio")
    private String palindromo;
}
