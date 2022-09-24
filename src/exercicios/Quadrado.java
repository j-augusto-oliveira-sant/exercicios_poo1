package exercicios;

public class Quadrado {
	private int lado;
	private double area;
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
		this.area = lado*lado;
	}
	public double getArea() {
		return area;
	}
}
