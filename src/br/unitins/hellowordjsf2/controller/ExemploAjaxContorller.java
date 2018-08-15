package br.unitins.hellowordjsf2.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ExemploAjaxContorller implements Serializable{

	private static final long serialVersionUID = 3991483622407393786L;
	 
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimirConsole() {
		System.out.println("Imprimir no consolse");
		
	}
	

}
