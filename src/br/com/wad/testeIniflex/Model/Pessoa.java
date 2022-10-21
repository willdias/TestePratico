package br.com.wad.testeIniflex.Model;

import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private LocalDate dtNasc; //data nascimento
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(LocalDate dtNasc) {
		this.dtNasc = dtNasc;
	}

	
}
