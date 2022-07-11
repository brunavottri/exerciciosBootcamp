public class Documento {
    private String tipoDeDocumento;

    public Documento(String tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "tipoDeDocumento='" + tipoDeDocumento + '\'' +
                '}';
    }
}
