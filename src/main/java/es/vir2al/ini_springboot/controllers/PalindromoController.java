package es.vir2al.ini_springboot.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Clase para verificar palíndromos
 */

@RestController
@RequestMapping("/words")
@Slf4j
@AllArgsConstructor
public class PalindromoController {

    /**
     * Endpoint para verificar si una palabra un palíndromo
     * @param word
     * @return Un mensaje indicando si la palabra es un palíndromo o no
     */
    @GetMapping("/palindromo/{word}")
    public String palidromo(@PathVariable String word) {

        if (isPalindromo(word)) return "La palabra "+word+" es un palindromo";

        return "La palabra "+word+" NO es un palindromo";
    }

    /**
     * Método para verificar si una palabra es un palídromo
     * @param word
     * @return true si una palabra es palíndromo
     */
    private boolean isPalindromo(String word) {

        int length = word.length();

        for (int i = 0; i < length / 2; i++) {

            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }

        }

        return true;
    }



}
