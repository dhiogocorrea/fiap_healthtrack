package com.grupo30.model;
import java.util.Date;
import java.util.ArrayList;

/**
* Modelo de usuário que contém todos os dados pertinentes a ele
*/
public class Usuario extends Pessoa {
	
	/**
	 * Refeiçao do usuário
	 */
	private Refeicao refeicao;
	/**
	 * Pesos do usuário
	 */
    private ArrayList<Peso> peso = new ArrayList<Peso>();
    /**
	 * Batimentos Cardíacos do usuário
	 */
    private ArrayList<BatimentoCardiaco> batimentoCardiaco = new ArrayList<BatimentoCardiaco>();
    /**
	 * Atividade do usuário
	 */
    private ArrayList<Atividade> atividade = new ArrayList<Atividade>();
    /**
	 * Plano do usuário
	 */
    private Plano plano;
     
	public Usuario(int _codPessoa, String _nomePessoa, int _cpfPessoa)
	{
		super(_codPessoa, _nomePessoa, _cpfPessoa);	
	}
	
 

	public Refeicao getRefeicao() {
		return refeicao;
	}
	public void setRefeicao(Refeicao refeicao) {
		this.refeicao = refeicao;
	}
	public ArrayList<Peso> getPeso() {
		return peso;
	}
	public void setPeso(Peso peso) {
		this.peso.add(peso);
	}
	public ArrayList<BatimentoCardiaco> getBatimentoCardiaco() {
		return batimentoCardiaco;
	}
	public void setBatimentoCardiaco(BatimentoCardiaco batimentoCardiaco) {
		this.batimentoCardiaco.add(batimentoCardiaco);
	}
	public ArrayList<Atividade> getAtividade() {
		return atividade;
	}
	public void setAtividade(Atividade atividade) {
		this.atividade.add(atividade);
	}
	
	public Plano getPlano() {
		return plano;
	}
	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	
	
	
}
