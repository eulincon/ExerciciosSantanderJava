package exercicioBancoSantander;

public class Main {

	public static void main(String[] args) {
		var conta = new ContaCorrente();
		var cheque = new Cheque(1500, "BB", null);
		conta.depositarValor(100);
		System.out.println(conta.consultarSaldo());
		conta.depositarCheque(cheque);
		System.out.println(conta.consultarSaldo());
		conta.sacarValor(50);
		System.out.println(conta.consultarSaldo());
	}

}
