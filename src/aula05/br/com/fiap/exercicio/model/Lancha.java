package aula05.br.com.fiap.exercicio.model;

public class Lancha {
    private String modelo;
    private int quantidadeDeLugares;
    private double comprimento;
    private int anoFabricacao;
    private Cor cor;
    private int quantidadeDeMotores;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidadeDeLugares() {
        return quantidadeDeLugares;
    }

    public void setQuantidadeDeLugares(int quantidadeDeLugares) {
        this.quantidadeDeLugares = quantidadeDeLugares;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public int getQuantidadeDeMotores() {
        return quantidadeDeMotores;
    }

    public void setQuantidadeDeMotores(int quantidadeDeMotores) {
        this.quantidadeDeMotores = quantidadeDeMotores;
    }
}
