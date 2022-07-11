package classes;

import interfaces.ConsultaDeSaldo;
import interfaces.SaqueEmDinheiro;

public class Cobrador implements SaqueEmDinheiro, ConsultaDeSaldo {
    @Override
    public void fazSaqueEmDinheiro(Double valor) {
        System.out.println("Faz saque em dinheiro " + valor);
    }

    @Override
    public void fazConsultaDeSaldo() {
        System.out.println("Consulta o saldo");
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
