package com.digitalinnovationone.desafiosAritmeticos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class desafio02 {
    //declare suas variaveis corretamente
    private static int pares = 0;
    private static int impares = 0;
    private static int positivos = 0;
    private static int negativos = 0;

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        Collection<Integer> numeros = new ArrayList<>();

        numeros.add(Integer.parseInt(leitor.next()));
        numeros.add(Integer.parseInt(leitor.next()));
        numeros.add(Integer.parseInt(leitor.next()));
        numeros.add(Integer.parseInt(leitor.next()));
        numeros.add(Integer.parseInt(leitor.next()));

//continue a solução

        numeros
                .stream()
                .forEach(numero -> {
                    if(numero % 2 == 0) pares++;
                    if(numero % 2 != 0) impares++;
                    if(numero < 0) negativos++;
                    if(numero > 0) positivos++;
                });

//insira suas variaveis corretamente
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }
}