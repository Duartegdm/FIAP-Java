package aula02.exercicio02;

public class ContaCorrente {
    double saldo;
    Cliente titular;

    void depositar(double valor) {
        saldo += valor;
    }

    void retirar(double valor) {
        saldo -= valor;
    }

    double returnarSaldo() {
        return saldo;
    }
}
