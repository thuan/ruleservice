package com.itegra.auditcom.domain;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ResultadoAlimentoAcordanteEntrada implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private double valorImposto;
    private double valorBaseDeCalculo;
    private double percentualCargaLiquida;

    private boolean calcularImposto;
    private boolean simplesNacional;

    private String mensagem;

    private String regiaoEmitente;
    private String regiaoDestinatario;
    private String fluxo;
    private String tipoProduto;
    private String categoria;

    public ResultadoAlimentoAcordanteEntrada() {}

    public ResultadoAlimentoAcordanteEntrada(
        double valorImposto,
        double valorBaseDeCalculo,
        double percentualCargaLiquida,
        boolean calcularImposto,
        boolean simplesNacional,
        String mensagem,
        String regiaoEmitente,
        String regiaoDestinatario,
        String fluxo,
        String tipoProduto,
        String categoria
    ) {
        this.valorImposto = valorImposto;
        this.valorBaseDeCalculo = valorBaseDeCalculo;
        this.percentualCargaLiquida = percentualCargaLiquida;
        this.calcularImposto = calcularImposto;
        this.simplesNacional = simplesNacional;
        this.mensagem = mensagem;
        this.regiaoEmitente = regiaoEmitente;
        this.regiaoDestinatario = regiaoDestinatario;
        this.fluxo = fluxo;
        this.tipoProduto = tipoProduto;
        this.categoria = categoria;
    }

    public boolean isCalcularImposto() {
        return this.calcularImposto;
    }

    public void setCalcularImposto(boolean calcularImposto) {
        this.calcularImposto = calcularImposto;
    }

    public double getValorImposto() {
        return this.valorImposto;
    }

    public void setValorImposto(double valorImposto) {
        this.valorImposto = valorImposto;
    }

    public double getValorBaseDeCalculo() {
        return this.valorBaseDeCalculo;
    }

    public void setValorBaseDeCalculo(double valorBaseDeCalculo) {
        this.valorBaseDeCalculo = valorBaseDeCalculo;
    }

    public double getPercentualCargaLiquida() {
        return percentualCargaLiquida;
    }

    public void setPercentualCargaLiquida(double percentualCargaLiquida) {
        this.percentualCargaLiquida = percentualCargaLiquida;
    }

    public boolean isSimplesNacional() {
        return this.simplesNacional;
    }

    public void setSimplesNacional(boolean simplesNacional) {
        this.simplesNacional = simplesNacional;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getRegiaoEmitente() {
        return this.regiaoEmitente;
    }

    public void setRegiaoEmitente(String regiaoEmitente) {
        this.regiaoEmitente = regiaoEmitente;
    }

    public String getRegiaoDestinatario() {
        return this.regiaoDestinatario;
    }

    public void setRegiaoDestinatario(String regiaoDestinatario) {
        this.regiaoDestinatario = regiaoDestinatario;
    }

    public String getFluxo() {
        return this.fluxo;
    }

    public void setFluxo(String fluxo) {
        this.fluxo = fluxo;
    }

    public String getTipoProduto() {
        return this.tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
