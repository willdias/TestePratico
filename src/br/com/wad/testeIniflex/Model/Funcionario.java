package br.com.wad.testeIniflex.Model;

import java.math.BigDecimal;

public class Funcionario extends Pessoa {
	private BigDecimal salario;
	private String funcao;
	
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
}
