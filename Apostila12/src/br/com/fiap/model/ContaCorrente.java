package br.com.fiap.model;

public class ContaCorrente {

    private double saldo;

    //Criar os métodos Sacar, Depositar e Consultar
    public void sacar(double valor) throws Exception{
        validaValor(valor);
        validaSaldo(valor);
        saldo -= valor;
    }

    public void depositar(double valor) throws Exception{
        validaValor(valor);
        saldo += valor;
    }

    private void validaSaldo(double valor) throws Exception {
        if(valor > saldo){
            throw new Exception("Saldo insuficiente");
        }
    }

    private void validaValor(double valor) throws Exception {
        if(valor < 0) {
            throw new Exception("Valor não pode ser negativo");
        }
    }

    public double consultarSaldo(){
        return saldo;
    }

}
