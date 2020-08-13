package ententies;

public class ObjFunc {
	private int idFunc;
	private String nomeFunc;
	private Double salarioFunc;
	
	public ObjFunc(int idFunc, String nomeFunc, Double salarioFunc) {
		this.idFunc = idFunc;
		this.nomeFunc = nomeFunc;
		this.salarioFunc = salarioFunc;
	}

	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public int getIdFunc() {
		return idFunc;
	}

	public double getSalarioFunc() {
		return salarioFunc;
	}
	
	public void aumentoSalario(Double aumento) {
		salarioFunc = salarioFunc+(salarioFunc*(aumento/100));
	}	
	
	public String toString() {
		return idFunc
				+","
				+nomeFunc
				+","
				+String.format("%.2f", salarioFunc);
	}
	
}
