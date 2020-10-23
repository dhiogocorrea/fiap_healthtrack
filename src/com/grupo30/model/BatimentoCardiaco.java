package com.grupo30.model;
import java.util.Date;
/**
* Modelo de Batimento Cardíaco que contém batimento minimo, maximo, medio e data de medicação
* Armazena os batimentos cardiacos de um usuario durante atividades fisicas
*/
public class BatimentoCardiaco implements Crud{

	/**
	 * O minimo de batimento na atividade
	 */
    private int batimentoMinimo;
    /**
     * O batimento máximo na atividade
     */
    private int batimentoMaximo;
    /**
     * O batimento médio na atividade
     */
    private int batimentoMedio;
    /**
     * A data da medição
     */
    private Date dtMedicao;

    public BatimentoCardiaco(int batimentoMinimo, int batimentoMaximo, int batimentoMedio, Date dtMedicao) {
        this.batimentoMinimo = batimentoMinimo;
        this.batimentoMaximo = batimentoMaximo;
        this.batimentoMedio = batimentoMedio;
        this.dtMedicao = dtMedicao;
    }

    public int getBatimentoMinimo() {
        return batimentoMinimo;
    }

    public void setBatimentoMinimo(int batimentoMinimo) {
        this.batimentoMinimo = batimentoMinimo;
    }

    public int getBatimentoMaximo() {
        return batimentoMaximo;
    }

    public void setBatimentoMaximo(int batimentoMaximo) {
        this.batimentoMaximo = batimentoMaximo;
    }

    public int getBatimentoMedio() {
        return batimentoMedio;
    }

    public void setBatimentoMedio(int batimentoMedio) {
        this.batimentoMedio = batimentoMedio;
    }

    public Date getDtMedicao() {
        return dtMedicao;
    }

    public void setDtMedicao(Date dtMedicao) {
        this.dtMedicao = dtMedicao;
    }

    @Override
    public Object consultar(int cod) {
        return null;
    }

    @Override
    public void inserir(Object obj) {

    }

    @Override
    public void alterar(Object obj) {

    }

    @Override
    public void excluir(int cod) {

    }
}
