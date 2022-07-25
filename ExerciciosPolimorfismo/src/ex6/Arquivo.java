package ex6;

import java.util.Scanner;

public class Arquivo {
	
	private int bytes;
	private double preco;
	private String autor;
	
	
	
	public int getBytes() {
		return bytes;
	}

	public void setBytes(int bytes) {
		this.bytes = bytes;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Arquivo() {
		
	}

	public Arquivo(int bytes, double preco, String autor) {
		this.bytes = bytes;
		this.preco = preco;
		this.autor = autor;
	}
	
	
	
	public String getTipo() {
		return "Arquivo: ";
	}
	
	public String getDetalhes() {
		return "Bytes: " + bytes 
				+ ", Preco R$ " + preco
				+ ", Autor: " + autor;
	}
	
	public void Imprime() {
		String aux = getTipo() + "\n" 
				+ getDetalhes() + "\n";
		System.out.println(aux);
	}
	
	public void inserirDados() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bytes: ");
		int by = sc.nextInt();
		System.out.print("Preco: ");
		double pre = sc.nextDouble();
		System.out.print("Autor: ");
		String au = sc.next();
		
		setBytes(by);
		setPreco(pre);
		setAutor(au);
	}

}

