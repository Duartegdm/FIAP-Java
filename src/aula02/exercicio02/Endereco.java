package aula02.exercicio02;

public class Endereco {
    String logradouro;
    short numero;
    String complemento;
    String cep;

    String retornarEndereco() {
        return "Logradouro: "+logradouro + ", "+numero+" " +
                complemento + ", CEP: "+cep;
    }


}
