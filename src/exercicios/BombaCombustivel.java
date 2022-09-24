package exercicios;

public class BombaCombustivel {
	private String tipoCombustivel="Etanol";
	private double valorLitro=6.50;
	private double quantidadeCombustivel=100;
	
	public double abastecerPorValor(double valor){
		quantidadeCombustivel -= valor/valorLitro;
		return valor/valorLitro;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	public double abastecerPorLitro(double litros){
		quantidadeCombustivel -= litros;
		return litros*valorLitro;
	}
	public void alterarValor(double valor){
		valorLitro = valor;
	}
	public void alterarCombustivel(String tipo){
		tipoCombustivel = tipo;
	}
	public void alterarQuantidadeCombustivel(double litros){
		quantidadeCombustivel += litros;
	}
	
}
