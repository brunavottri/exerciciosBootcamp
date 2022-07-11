package classes;

import interfaces.ConsultaDeSaldo;
import interfaces.PagamentoDeServicos;
import interfaces.SaqueEmDinheiro;

public class Basico implements ConsultaDeSaldo, PagamentoDeServicos, SaqueEmDinheiro {
    @Override
    public void fazConsultaDeSaldo() {
        System.out.println("Consulta o saldo");
    }

    @Override
    public void fazPagamentoDeServicos(String tipodeServico) {
        System.out.println("Faz pagamento do serviço " + tipodeServico);
    }

    @Override
    public void fazSaqueEmDinheiro(Double valor) {
        System.out.println("Saca o valor " + valor + " em dinheiro");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Transação Ok");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transação Não Ok");
    }
}
