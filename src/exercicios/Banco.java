package exercicios;

public class Banco {
	private String nome;
	private int numero_conta;
	private double saldo;
	
	public Banco(int numero_conta) {
		this.numero_conta = numero_conta;
	}
	
	public void depositar(int valor) {
		this.saldo += valor;
	}
	
	public void saque(int valor) {
		this.saldo -= valor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero_conta() {
		return numero_conta;
	}
	
	
}
