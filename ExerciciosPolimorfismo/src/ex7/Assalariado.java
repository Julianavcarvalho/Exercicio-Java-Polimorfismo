package ex7;

import java.util.Scanner;

public class Assalariado extends Funcionario{

	private double salario;
	
	public Assalariado() {
		
	}

	public Assalariado(String nome, double salario) {
		super(nome);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getPagamento(double sal) {
		this.salario = sal;
		return salario;
	}
	
	public String getDados() {
		return super.getDados() + 
				"recebe o salario de R$ "
				+ getSalario();
	}
	
	public void inserirDados() {
		super.inserirDados();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salario: ");
		double sal = sc.nextDouble();
		
		setSalario(sal);
		
	}
	
	
}
