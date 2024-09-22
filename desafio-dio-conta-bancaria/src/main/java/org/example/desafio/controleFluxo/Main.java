package org.example.desafio.controleFluxo;

import org.example.desafio.controleFluxo.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Insira os parametros");

            System.out.print("Primeiro parametro: ");
            int parametro1 = scan.nextInt();

            System.out.print("Segundo parametro: ");
            int parametro2 = scan.nextInt();

            contar(parametro1, parametro2);

        }catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {

        if(parametro2 <= parametro1){
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }

        int contagem = parametro2 - parametro1;

        for(int i=1; i<= contagem; i++){
            System.out.println(String.format("Número: %s", i));
        }
    }
}
