package exercicioInterface;

public class Pato implements Voador{
	protected static int nPatos = 0;
	private int energia = 100;

	public Pato() {
		super();
		Pato.nPatos += 1;
	}

	@Override
	public void voar() {
		if(this.energia > 0) {
			this.energia -= 5;
			System.out.println("- Estou voando como um pato.");
		}else {
			System.out.println("- Não tenho energia suficiente para voar.");
		}
	}
	
}
