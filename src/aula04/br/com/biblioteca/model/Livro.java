package aula04.br.com.biblioteca.model;

public class Livro {

    // atributos
    public String titulo;
    public int paginas;
    boolean disponivel;

    // métodos
    void emprestar() {
        disponivel = false;
    }



}
