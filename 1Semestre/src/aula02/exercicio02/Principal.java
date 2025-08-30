package aula02.exercicio02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Instanciar os objetos
        Scanner leitor = new Scanner(System.in);
        Endereco endereco = new Endereco();
        Cliente cliente = new Cliente();
        ContaCorrente contaCorrente = new ContaCorrente();


        // Ler os dados do usuário
        System.out.println("Digite o seu nome: ");
        cliente.nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite o seu cpf: ");
        cliente.cpf = leitor.next() + leitor.nextLine();

        cliente.endereco = endereco;


        System.out.println("Digite o seu logradouro: ");
        endereco.logradouro = leitor.next() + leitor.nextLine();

        System.out.println("Digite o seu numero: ");
        endereco.numero = leitor.nextShort();

        System.out.println("Digite o seu complemento: ");
        endereco.complemento = leitor.next() + leitor.nextLine();

        System.out.println("Digite o seu cep: ");
        endereco.cep = leitor.next() + leitor.nextLine();

        contaCorrente.titular = cliente;

        // Pedir o valor para depósito
        System.out.println("Digite o valor para o depósito: ");
        contaCorrente.depositar(leitor.nextDouble());

        System.out.println("Digite o valor para sacar: ");
        contaCorrente.retirar(leitor.nextDouble());

        System.out.println("O seu saldo é: " + contaCorrente.returnarSaldo());

    }

}
