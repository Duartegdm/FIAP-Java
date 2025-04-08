package aula02.exercicio02;

public class Cliente {
    String nome;
    String cpf;
    Endereco endereco;

    String retornarDados() {
        return "Nome: " + nome + "\nCPF: " + cpf +
                "\nendereço: " + endereco.retornarEndereco();
    }
}
