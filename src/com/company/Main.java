package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma =  0;


        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            count = count + 1;
            soma = soma + numero;
            if (numero > maior) maior = numero;
        }while(count <5 );
        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));
      }
    }