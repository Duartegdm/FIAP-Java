package br.com.fiap.view;

import br.com.fiap.model.ContaCorrente;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        Scanner leitor = new Scanner(System.in);
        //Menu: 1-Depositar 2-Sacar 3-Exibir Saldo 0-Sair
        int opcao;
        opcao = 1;
        do {
            System.out.println("Escolha: \n1-Depositar \n2-Sacar \n3-Saldo \n0-Sair");
            try {
                opcao = leitor.nextInt();

                switch (opcao) {
                    case (1):
                        System.out.println("Informe o valor para o depósito:");
                        double valor = leitor.nextDouble();
                        cc.depositar(valor);
                        break;
                    case (2):
                        System.out.println("Informe o valor para o realizar o saque:");
                        valor = leitor.nextDouble();
                        cc.sacar(valor);
                    case (3):
                        System.out.println("Saldo atual " + cc.consultarSaldo());
                    case (0):
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            } catch (InputMismatchException e) {
                leitor.next();
                System.err.println("Opção inválida, digite um número.");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        } while (opcao != 0);

    }//main
}//class
