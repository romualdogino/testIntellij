package br.com.dio;

import br.com.dio.model.Cc;
import br.com.dio.model.Cp;
import br.com.dio.model.Iconta;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Iconta cc = new Cc();
        Iconta cp = new Cp();

        cc.depositar(100.0);
        cc.transferir(100.0, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
