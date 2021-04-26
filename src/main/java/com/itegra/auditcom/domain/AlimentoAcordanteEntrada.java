package com.itegra.auditcom.domain;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AlimentoAcordanteEntrada implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private int crt;
    private double percentualICMS;

    private String ufEmitente;
    private String ufDestinatario;

    private double valorItem;

    private double valorIPI;

    private double valorFrete;

    private double valorSeguro;

    private double valorOutros;

    private int cfop;

    private String cnpjEmitente;

    private String cnpjDestinatario;

    public AlimentoAcordanteEntrada(int crt, double percentualICMS) {
        this.crt = crt;
        this.percentualICMS = percentualICMS;
    }

    public AlimentoAcordanteEntrada(String ufEmitente, String ufDestinatario) {
        this.ufEmitente = ufEmitente;
        this.ufDestinatario = ufDestinatario;
    }

    public int getCrt() {
        return this.crt;
    }

    public void setCrt(int crt) {
        this.crt = crt;
    }

    public double getPercentualICMS() {
        return this.percentualICMS;
    }

    public void setPercentualICMS(double percentualICMS) {
        this.percentualICMS = percentualICMS;
    }

    public String getUfEmitente() {
        return this.ufEmitente;
    }

    public void setUfEmitente(String ufEmitente) {
        this.ufEmitente = ufEmitente;
    }

    public String getUfDestinatario() {
        return this.ufDestinatario;
    }

    public void setUfDestinatario(String ufDestinatario) {
        this.ufDestinatario = ufDestinatario;
    }

    public double getValorItem() {
        return this.valorItem;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }

    public double getValorIPI() {
        return this.valorIPI;
    }

    public void setValorIPI(double valorIPI) {
        this.valorIPI = valorIPI;
    }

    public double getValorFrete() {
        return this.valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public double getValorSeguro() {
        return this.valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public double getValorOutros() {
        return this.valorOutros;
    }

    public void setValorOutros(double valorOutros) {
        this.valorOutros = valorOutros;
    }

    public int getCfop() {
        return this.cfop;
    }

    public void setCfop(int cfop) {
        this.cfop = cfop;
    }

    public String getCnpjEmitente() {
        return this.cnpjEmitente;
    }

    public void setCnpjEmitente(String cnpjEmitente) {
        this.cnpjEmitente = cnpjEmitente;
    }

    public String getCnpjDestinatario() {
        return this.cnpjDestinatario;
    }

    public void setCnpjDestinatario(String cnpjDestinatario) {
        this.cnpjDestinatario = cnpjDestinatario;
    }
}