package org.example;

import org.example.models.ContaCliente;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);

            println("Olá seja bem vindo ao Banco Terminal! Siga o passo a passo para criar sua conta!");

            println("Por favor, digite o seu nome completo!");
            print("Nome completo: ");
            String nome_cliente = scan.nextLine();

            println("Por favor, digite o número da Agência!");
            print("Agência: ");
            String agencia = scan.nextLine();

            println("Por favor, digite o número da conta");
            print("Conta: ");
            int numero_conta = scan.nextInt();

            println("Por favor, digite o saldo da conta");
            print("Saldo: ");
            double saldo = scan.nextDouble();

            ContaCliente contaCliente = new ContaCliente(numero_conta, agencia, nome_cliente, saldo);

            println(String.format("Olá %s obrigado por criar uma conta em nosso banco, " +
                            "sua agência é %s, conta %s e seu saldo %s já está disponível para saque!",
                    contaCliente.getNome(), contaCliente.getAgencia(), contaCliente.getNumero(), contaCliente.getSaldo())
            );
        }
        catch(InputMismatchException e){
            println("Erro ao criar a conta! Por favor insira valores válidos!");
        }
    }

    public static <T> void println(T m){
        System.out.println(m);
    }

    public static <T> void print(T m){
        System.out.print(m);
    }
}