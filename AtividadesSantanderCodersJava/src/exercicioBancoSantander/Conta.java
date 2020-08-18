package exercicioBancoSantander;

public abstract class Conta {
	private double saldo;

	public boolean depositarValor(double value) {
		if(value > 0) {
			this.saldo += value;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean sacarValor(double value) {
		if(value < 0 || this.saldo < value) {
			return false;
		} else {
			this.saldo -= value;
			return true;
		}
	}
	
	public double consultarSaldo() {
		return this.saldo;
	}
	
}
