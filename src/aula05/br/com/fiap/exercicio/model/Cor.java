package aula05.br.com.fiap.exercicio.model;

public class Cor {
    private String nome;
    private int r;
    private int g;
    private int b;

    public void alterarCor(int r, int g, int b, String nome){
        this.nome = nome;
        this.r = r;
        this.g = g;
        this.b = b;
    }
}
