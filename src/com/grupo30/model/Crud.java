package com.grupo30.model;
/**
 * Interface base para operações de CRUD
 * @author root
 *
 */
public interface Crud {
    public Object consultar(int cod);
    public void inserir(Object obj);
    public void alterar(Object obj);
    public void excluir(int cod);
}
