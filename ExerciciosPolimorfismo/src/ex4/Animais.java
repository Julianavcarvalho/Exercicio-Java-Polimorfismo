package ex4;

public class Animais {
	
	private String nome;

	public Animais(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void movimento() {
		System.out.print("Esse animal se movimenta: ");
	}
	
	public void falar() {
		System.out.print("Esse animal faz: ");
	}
	
	
	
}
