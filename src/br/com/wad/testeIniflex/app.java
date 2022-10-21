package br.com.wad.testeIniflex;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import br.com.wad.testeIniflex.Model.Funcionario;

public class app {

	public static void main(String[] args) {
		List<Funcionario> pessoas = new ArrayList<Funcionario>();
		Funcionario funcionario = new Funcionario();
		final DecimalFormat df = new DecimalFormat("#,###.00");
		final BigDecimal reajuste = new BigDecimal(1.1);
		final BigDecimal salMinimo = new BigDecimal(1212.00);
		HashMap<String, String> funcionarios = new HashMap<String, String>();
        String funcao = null;
        String nome = null;

//3.1 - Inserir todos os funcionários, na mesma ordem e informações da tabela
		funcionario.setNome ("Maria");
		funcionario.setDtNasc(LocalDate.of(2000, 10, 18));		
		funcionario.setSalario(new BigDecimal("2009.44"));
		funcionario.setFuncao("Operador");
		pessoas.add(0,funcionario);
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome ("João");
		funcionario1.setDtNasc(LocalDate.of(1990, 05, 12));		
		funcionario1.setSalario(new BigDecimal("2284.38"));
		funcionario1.setFuncao("Operador");
		pessoas.add(1,funcionario1);
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome ("Caio");
		funcionario2.setDtNasc(LocalDate.of(1961, 05, 02));		
		funcionario2.setSalario(new BigDecimal("9836.14"));
		funcionario2.setFuncao("Coordenador");
		pessoas.add(2,funcionario2);
		
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setNome ("Miguel");
		funcionario3.setDtNasc(LocalDate.of(1988, 10, 14));		
		funcionario3.setSalario(new BigDecimal("19119.88"));
		funcionario3.setFuncao("Diretor");
		pessoas.add(3,funcionario3);
		
		Funcionario funcionario4 = new Funcionario();
		funcionario4.setNome ("Alice");
		funcionario4.setDtNasc(LocalDate.of(1995, 01, 05));		
		funcionario4.setSalario(new BigDecimal("2234.68"));
		funcionario4.setFuncao("Recepcionista");
		pessoas.add(4,funcionario4);
		
		Funcionario funcionario5 = new Funcionario();
		funcionario5.setNome ("Heitor");
		funcionario5.setDtNasc(LocalDate.of(1999, 11, 19));		
		funcionario5.setSalario(new BigDecimal("1582.72"));
		funcionario5.setFuncao("Operador");
		pessoas.add(5,funcionario5);
		
		Funcionario funcionario6 = new Funcionario();
		funcionario6.setNome ("Arthur");
		funcionario6.setDtNasc(LocalDate.of(1993, 03, 31));		
		funcionario6.setSalario(new BigDecimal("4071.84"));
		funcionario6.setFuncao("Contador");
		pessoas.add(6,funcionario6);
		
		Funcionario funcionario7 = new Funcionario();
		funcionario7.setNome ("Laura");
		funcionario7.setDtNasc(LocalDate.of(1994, 07, 8));		
		funcionario7.setSalario(new BigDecimal("3017.45"));
		funcionario7.setFuncao("Gerente");
		pessoas.add(7,funcionario7);
		
		Funcionario funcionario8 = new Funcionario();
		funcionario8.setNome ("Heloísa");
		funcionario8.setDtNasc(LocalDate.of(2003, 05, 24));		
		funcionario8.setSalario(new BigDecimal("1606.85"));
		funcionario8.setFuncao("Eletricista");
		pessoas.add(8,funcionario8);
		
		Funcionario funcionario9 = new Funcionario();
		funcionario9.setNome ("Helena");
		funcionario9.setDtNasc(LocalDate.of(1996, 9, 02));		
		funcionario9.setSalario(new BigDecimal("2799.93"));
		funcionario9.setFuncao("Gerente");
		pessoas.add(9,funcionario9);
//FINAL - Inserir todos os funcionários, na mesma ordem e informações da tabela
				
//3.3 - Imprimir todos os funcionários com todas suas informações		
		System.out.println("    Imprimir todos os funcionários com todas suas informações:");		
		System.out.println(" Nome   | Data Nascimento | Salário   | Função ");
		System.out.println("-----------------------------------------------");
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i).getNome() +"   |    " + pessoas.get(i).getDtNasc().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +"   | " + df.format(pessoas.get(i).getSalario()) +"  | " + pessoas.get(i).getFuncao());
		}
		
//3.2 - Remover o funcionário “João” da lista.
		pessoas.remove(1);
		System.out.println();
		System.out.println("    João removido da lista:");		
		System.out.println(" Nome   | Data Nascimento | Salário   | Função ");
		System.out.println("-----------------------------------------------");
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i).getNome() +"   |    " + pessoas.get(i).getDtNasc().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +"   | " + df.format(pessoas.get(i).getSalario()) +"  | " + pessoas.get(i).getFuncao());
		}
		
//3.4 - Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
		System.out.println();
		System.out.println("    Salário atualizado com 10% a mais:");		
		System.out.println(" Nome   | Data Nascimento | Salário   | Função ");
		System.out.println("-----------------------------------------------");
		for(int i = 0; i < pessoas.size(); i++) {
			pessoas.get(i).setSalario(pessoas.get(i).getSalario().multiply(reajuste));
			System.out.println(pessoas.get(i).getNome() +"   |    " + pessoas.get(i).getDtNasc().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +"   | " + df.format(pessoas.get(i).getSalario()) +"  | " + pessoas.get(i).getFuncao());
		}

//3.5 - Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
		System.out.println();
		for ( int i = 0; i < pessoas.size(); i++) {                       
            funcao = pessoas.get(i).getFuncao();
            nome = pessoas.get(i).getNome();                      
            if (funcionarios.containsKey(funcao)) {
            	String nomeAdd = funcionarios.get(funcao);
            	funcionarios.put(funcao, nome + ", "+nomeAdd);
            }
            else {
            	funcionarios.put(funcao, nome);  
            }
            
        }
		
//3.6 - Imprimir os funcionários, agrupados por função.
		System.out.println("    Funcionários, agrupados por função:");
	    for (String i : funcionarios.keySet()) {
        	var valores = funcionarios.get(i);
        	System.out.println(i +": "+valores);
        }
		
//3.8 - Imprimir os funcionários que fazem aniversário no mês 10 e 12.
		System.out.println();
		System.out.println("    Funcionários que fazem aniversário no mês 10 e 12:");
		System.out.println(" Nome   | Data Nascimento ");
		for ( int i = 0; i < pessoas.size(); i++) {
			String dtNascimento = pessoas.get(i).getDtNasc().format(DateTimeFormatter.ofPattern("MM"));
			if (dtNascimento.equals("10") || dtNascimento.equals("12")) {
				System.out.println(pessoas.get(i).getNome() +"   |    " + pessoas.get(i).getDtNasc().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			}
		}
		
//3.9 - Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
		System.out.println();
		System.out.println("    Funcionário com a maior idade:");
		System.out.println(" Nome   | Idade ");
		int  idade =0;
		int maiorIdade = 0;
		String maisVelho=null;
		LocalDate dtAtual = LocalDate.now();
		for ( int i = 0; i < pessoas.size(); i++) {
			
			LocalDate dtNascimento = pessoas.get(i).getDtNasc();
			Period periodo = Period.between(dtNascimento, dtAtual);
			
			idade = periodo.getYears();
			
			if (idade > maiorIdade) {
				maiorIdade = idade;
				maisVelho = pessoas.get(i).getNome();
			}
			
		}
		System.out.println( maisVelho +"    |    " + maiorIdade);
		
//3.10 - Imprimir a lista de funcionários por ordem alfabética
		System.out.println();
		System.out.println("    Funcionário em ordem alfabética:");
		System.out.println(" Nome   ");
		SortedSet<String> listagem = new TreeSet<String>();
		for ( int i = 0; i < pessoas.size(); i++) {
			listagem.add(pessoas.get(i).getNome());
		}
		for (String i : listagem) {
			System.out.println(i);
        }
		
//3.11 - Imprimir o total dos salários dos funcionários.
		System.out.println();
		System.out.println("    Total dos salários dos funcionários:");
		System.out.println(" Valor   ");
		BigDecimal totalSalario = new BigDecimal(0.0);
		for ( int i = 0; i < pessoas.size(); i++) {
			totalSalario = totalSalario.add(pessoas.get(i).getSalario());
		}
		System.out.println(df.format(totalSalario));
		
//3.12 - Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.
		System.out.println();
		System.out.println("    Quantos salários mínimos ganha cada funcionário:");
		System.out.println(" Nome   | Qtd. Salários Mínimos ");
		for ( int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i).getNome() +"   |   " + df.format(pessoas.get(i).getSalario().divide(salMinimo, 2, RoundingMode.HALF_UP)));
		}
	}
}
