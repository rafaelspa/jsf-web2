package br.nead.ads.jee.mb;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class FormularioMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	
	public FormularioMB() {
		System.out.println("Criando uma instância de ExemploMB");
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		System.out.println("GetNome " + nome);
		this.nome = nome;
	}

	public void executar() {
		System.out.println("Invocando o método executar() ...");
		System.out.println("Nome digitado: " + nome);
	}
	
	
	
	

}
