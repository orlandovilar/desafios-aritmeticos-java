package com.digitalinnovationone.desafiosAritmeticos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class desafio01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

//declare suas variaveis
        int divisor = Integer.parseInt(st.nextToken());
        int naoDivisor = Integer.parseInt(st.nextToken());
        int multiplo = Integer.parseInt(st.nextToken());
        int naoMultiplo = Integer.parseInt(st.nextToken());
        br.close();

        //declare suas variaveis com o valor correto
        int inicio = 0, fim = 0, resultado = -1;

        //continue o codigo
        if(divisor != naoDivisor && multiplo != naoDivisor) {
            fim = multiplo;
            inicio = divisor;
        }
        while(inicio <= fim) {
            if(inicio % divisor == 0 && inicio % naoDivisor != 0 && multiplo % inicio == 0 && naoMultiplo % inicio != 0) {
                resultado = inicio;
                break;
            }
            inicio += divisor;
        }
        System.out.println(resultado);
    }
}