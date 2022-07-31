package br.com.dio.model;

public abstract class Conta implements Iconta {
    private static int SEQUENCIAL = 0;
    private static int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;

    Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(Double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(Double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(Double valor, Iconta conta) {
        this.sacar(valor);
        conta.depositar(valor);
    }
}
