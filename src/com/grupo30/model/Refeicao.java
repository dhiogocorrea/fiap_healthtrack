package com.grupo30.model;
import java.util.Date;

import com.grupo30.enums.TipoRefeicao;
/**
* Modelo de Refeicao que contém código, tipo e data da refeição
* Armazena as refeições feitas pelo usuário
*/
public class Refeicao {

    private int codRefeicao;
    private TipoRefeicao tipoRefeicao;
    private Date dtRefeicao;

    public Refeicao(int codRefeicao, TipoRefeicao tipoRefeicao, Date dtRefeicao) {
        this.codRefeicao = codRefeicao;
        this.tipoRefeicao = tipoRefeicao;
        this.dtRefeicao = dtRefeicao;
    }

    public int getCodRefeicao() {
        return codRefeicao;
    }

    public void setCodRefeicao(int codRefeicao) {
        this.codRefeicao = codRefeicao;
    }

    public TipoRefeicao getTipoRefeicao() {
        return tipoRefeicao;
    }

    public void setTipoRefeicao(TipoRefeicao tipoRefeicao) {
        this.tipoRefeicao = tipoRefeicao;
    }

    public Date getDtRefeicao() {
        return dtRefeicao;
    }

    public void setDtRefeicao(Date dtRefeicao) {
        this.dtRefeicao = dtRefeicao;
    }
}
