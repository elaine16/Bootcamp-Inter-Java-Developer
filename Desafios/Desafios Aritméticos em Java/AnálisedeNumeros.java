/*
Análise de Números

Desafio
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.

 
Exemplo de Entrada:
-5
0
-3
-4
12

  Exemplo de Saída:
3 valor(es) par(es)
2 valor(es) impar(es)
1 valor(es) positivo(s)
3 valor(es) negativo(s)
  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberAnalysis {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int pares = 0, impares = 0, positivos = 0, negativos = 0;

        for (int i = 0; i < 5; i++) {

            st = new StringTokenizer(br.readLine());
            Double num = Double.parseDouble(st.nextToken());

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            }

        }
        
        
        System.out.println( pares + " valor(es) par(es)\n");
        System.out.println( impares + " valor(es) impar(es)\n");
        System.out.println( positivos + " valor(es) positivo(s)\n");
        System.out.println( negativos + " valor(es) negativo(s)\n");
                          
    }

}
