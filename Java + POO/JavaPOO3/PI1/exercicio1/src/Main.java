import classes.Basico;
import classes.Cobrador;
import classes.Executivo;

public class Main {
    public static void main(String[] args) {
        Basico basico = new Basico();
        basico.fazConsultaDeSaldo();
        basico.fazPagamentoDeServicos("Boleto");
        basico.fazSaqueEmDinheiro(1500.1);
        basico.transacaoOk();
        basico.transacaoNaoOk();

        Cobrador cobrador = new Cobrador();
        cobrador.fazSaqueEmDinheiro(1002.1);
        cobrador.fazConsultaDeSaldo();
        cobrador.transacaoOk();
        cobrador.transacaoNaoOk();

        Executivo executivo = new Executivo();
        executivo.fazDeposito(2200.1);
        executivo.fazTransferencia(12.1);
        executivo.transacaoOk();
        executivo.transacaoNaoOk();
    }
}
