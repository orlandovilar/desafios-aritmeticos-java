package com.digitalinnovationone.desafiosAritmeticos;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;
        import java.util.ArrayList;
        import java.util.Locale;
        import java.util.Scanner;
        import java.util.SortedMap;
        import java.util.TreeMap;

public class desafio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

//declare as variaveis corretamente e continue a sua solução

        SortedMap<Integer, Integer> variavel = new TreeMap<>();
        ArrayList<Integer> lista = new ArrayList<Integer>();

        int contaQuant = sc.nextInt();
        while(contaQuant-- > 0)
            lista.add(sc.nextInt());

        lista.forEach(id -> variavel.compute(id, (valor,quantidade) -> (quantidade == null ? 1 : quantidade + 1)));

        variavel.entrySet().forEach(entry->{
            System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
        });

        sc.close();
    }
}