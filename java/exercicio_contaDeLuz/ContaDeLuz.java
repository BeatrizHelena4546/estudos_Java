package exercicio_contaDeLuz;

class ContaLuz {
    private String dataLeitura;
    private int numeroLeitura;
    private double quantidadeKw;
    private double valorPagar;
    private String dataPagamento;
    private double mediaConsumo;

    public ContaLuz(String dataLeitura, int numeroLeitura, double quantidadeKw, double valorPagar, String dataPagamento, double mediaConsumo) {
        this.dataLeitura = dataLeitura;
        this.numeroLeitura = numeroLeitura;
        this.quantidadeKw = quantidadeKw;
        this.valorPagar = valorPagar;
        this.dataPagamento = dataPagamento;
        this.mediaConsumo = mediaConsumo;
    }

    public String getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(String dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    public int getNumeroLeitura() {
        return numeroLeitura;
    }

    public void setNumeroLeitura(int numeroLeitura) {
        this.numeroLeitura = numeroLeitura;
    }

    public double getQuantidadeKw() {
        return quantidadeKw;
    }

    public void setQuantidadeKw(double quantidadeKw) {
        this.quantidadeKw = quantidadeKw;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getMediaConsumo() {
        return mediaConsumo;
    }

    public void setMediaConsumo(double mediaConsumo) {
        this.mediaConsumo = mediaConsumo;
    }
}
