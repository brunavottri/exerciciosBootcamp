package classes;

import interfaces.Deposito;
import interfaces.Transferencia;

public class Executivo implements Deposito, Transferencia {
    @Override
    public void fazDeposito(Double valor) {
        System.out.println("Faz Deposito de " + valor);
    }

    @Override
    public void fazTransferencia(Double valor) {
        System.out.println("Faz Trasferencia de valor " + valor);
    }

    @Override
    public void transacaoOk() {
        System.out.println("Transacao Ok");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transacao Não Ok");
    }
}
