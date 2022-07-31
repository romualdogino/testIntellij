package br.com.dio.model;

public class Cc extends Conta{
    @Override
    public void imprimirExtrato() {
        System.out.println("**** EXTRATO CONTA CORRENTE ****");
        System.out.println(String.format("agência: %d", super.agencia));
        System.out.println(String.format("numero: %d", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.saldo));
        System.out.println("..................................");
    }

}
