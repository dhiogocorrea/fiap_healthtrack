package com.grupo30.main;
 
import java.util.Date;

import com.grupo30.model.Peso;
import com.grupo30.model.Usuario;
import com.sun.corba.se.spi.orb.ParserData;

import javafx.application.Application;
import javafx.stage.Stage;

public class main   {

    public static void main(String[] args) {
         
       //Instanciando a classe usu�rio 
    	Usuario usuario = new Usuario(1, "Guilherme Souza Paulo", 666666666);
        usuario.setEmail("guilherBH@gmail.com");
        usuario.setNumeroTelefone(1166666666);
        usuario.setSenha("mypass");
        usuario.setSexo("M");
        usuario.setDtAssinatura(new Date("20/08/2020"));
        usuario.setDtNascimento(new Date("20/08/2020"));
        usuario.setDtRegistro(new Date("20/08/2020"));

        Peso peso = new Peso(1,175.5,new Date("25/05/2020"));
        usuario.setPeso(peso); 
       
        System.out.println("UserID: " + usuario.getCodPessoa() +  "\nUsu�rio: " + usuario.getNome()+   "\nCPF:"  + usuario.getCpf());
 		System.out.println("\nDados: \nE-mail: "  + usuario.getEmail() +  "\nSexo: " + usuario.getSexo()+   "\nData Nascimento: "  + usuario.getDtNascimento()+"\n");
    }

}

    
    


