package br.com.dio.model;

public interface Iconta {
    void sacar(Double valor);
    void depositar(Double valor);
    void transferir(Double valor, Iconta conta);
    void imprimirExtrato();
}
