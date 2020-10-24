package com.grupo30.model;
/**
* Modelo de Alimento que contém código, nome, quantidade consumida e quantidade de calorias
*/
public class Alimento {

	/**
	 * O código do alimento
	 */
    private int codAlimento;
    /**
     * O nome do alimento
     */
    private String nome;
    /**
     * A quantidade consumida
     */
    private Double qtConsumida;
    /**
     * A quantidade de calorias consumidas
     */
    private int qtCalorias;

    public Alimento(int codAlimento, String nome, Double qtConsumida, int qtCalorias) {
        this.codAlimento = codAlimento;
        this.nome = nome;
        this.qtConsumida = qtConsumida;
        this.qtCalorias = qtCalorias;
    }

    public int getCodAlimento() {
        return codAlimento;
    }

    public void setCodAlimento(int codAlimento) {
        this.codAlimento = codAlimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getQtConsumida() {
        return qtConsumida;
    }

    public void setQtConsumida(Double qtConsumida) {
        this.qtConsumida = qtConsumida;
    }

    public int getQtCalorias() {
        return qtCalorias;
    }

    public void setQtCalorias(int qtCalorias) {
        this.qtCalorias = qtCalorias;
    }
}
