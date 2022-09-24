package exercicios;

public class Calcular {
	public double soma(double n1, double n2) {
		return n1+n2;
	}
	public double multiplica(double n1, double n2) {
		return n1*n2;
	}
	public double divide(double n1, double n2) {
		if (n2!=0) {
			return n1/n2;
		} else {
			throw new IllegalArgumentException("Argument 'divisor' is 0");
		}
	}
	public double subtrai(double n1, double n2) {
		return n1-n2;
	}
	
}
