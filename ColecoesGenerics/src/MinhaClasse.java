
public class MinhaClasse {
	public int num;
	public double num1;
	
	public MinhaClasse(int num) {
		this.num = num;
	}
	
	public MinhaClasse(double num1) {
		this.num1 = num1;
	}
	
	public int aoQuadrado() {
		return num * num;
	}

	public double aoQuadradoDouble() {
		return num1 * num1;
	}
}
