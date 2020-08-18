package exercicioBancoSantander;

public class ContaCorrente extends Conta{
	private double limiteChequeEspecial;

	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	public boolean depositarCheque(Cheque cheque) {
		// Implementar validações de dados do cheque.
		this.depositarValor(this.consultarSaldo() + cheque.getValor());
		return true;
	}

	@Override
	public boolean sacarValor(double value) {
		if(super.sacarValor(value)) {
			if(value < 0) {
				return false;
			} else if(value > 0 && value > this.consultarSaldo() + this.limiteChequeEspecial) {
				return false;
			}else {
				value -= this.consultarSaldo();
				this.sacarValor(this.consultarSaldo());
				this.limiteChequeEspecial -= value;
				return true;
			}
		} else {
			return true;
		}
		
	}
	
	
}
