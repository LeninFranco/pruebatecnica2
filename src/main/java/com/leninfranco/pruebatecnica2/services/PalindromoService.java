package com.leninfranco.pruebatecnica2.services;

import org.springframework.stereotype.Service;

import com.leninfranco.pruebatecnica2.models.request.PalindromoRequest;
import com.leninfranco.pruebatecnica2.models.response.PalindromoResponse;

@Service
public class PalindromoService {

    public PalindromoResponse verificarPalindromo(PalindromoRequest request){
        PalindromoResponse response = new PalindromoResponse();
        response.setLengthCadena(request.getPalindromo().length());
        int lengthCaracteresEspeciales = 0;
        int isPalindromo = 1;
        int left = 0;
        int right = response.getLengthCadena() - 1;

        while (left <= right){
            char leftChar = Character.toLowerCase(request.getPalindromo().charAt(left));
            char rightChar = Character.toLowerCase(request.getPalindromo().charAt(right));

            if(!Character.isLetterOrDigit(leftChar) && !Character.isWhitespace(leftChar)){
                lengthCaracteresEspeciales++;
            }

            if(!Character.isLetterOrDigit(rightChar) && !Character.isWhitespace(rightChar)){
                lengthCaracteresEspeciales++;
            }

            if (leftChar != rightChar) {
                isPalindromo = 1;
            }
            left++;
            right--;
        }

        response.setIsPalindromo(isPalindromo);
        response.setLengthCaracteresEspeciales(lengthCaracteresEspeciales);
        
        return response;
    }
}
