package exercicios;

public class Calc_Imposto {
	private double sal_hora;
	private double horas;
	private double SAL_BRUTO;
	private double IR = 0.11f;
	private double INSS = 0.08f;
	private double SIND = 0.05f;
	public Calc_Imposto(double sal_hora,double horas) {
		this.setSal_hora(sal_hora);
		this.setHoras(horas);
		this.SAL_BRUTO = (sal_hora*horas);
	}
	public double salario_liquido() {
		return SAL_BRUTO-(IR*SAL_BRUTO)-(INSS*SAL_BRUTO)-(SIND*SAL_BRUTO);
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	@Override
	public String toString() {
		return "Calc_Imposto [sal_hora=" + sal_hora + ", horas=" + horas + ", SAL_BRUTO=" + SAL_BRUTO + ", IR=" + IR
				+ ", INSS=" + INSS + ", SIND=" + SIND + "]";
	}
	public double getSal_hora() {
		return sal_hora;
	}
	public void setSal_hora(double sal_hora) {
		this.sal_hora = sal_hora;
	}
}
