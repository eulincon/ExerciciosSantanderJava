package exercicioBancoSantander;

public class ContaPoupanca extends Conta{
	private double taxaJuros = 0.0011;

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		// Implementar valida��es sobre a taxa de juros - Se completou a data anivers�rio.
		this.taxaJuros = taxaJuros;
	}
	
	public boolean recolherJuros() {
		this.depositarValor(this.consultarSaldo() * this.taxaJuros);
		return true;
	}
}
