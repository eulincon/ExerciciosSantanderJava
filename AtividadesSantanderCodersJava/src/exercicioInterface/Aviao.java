package exercicioInterface;

public class Aviao implements Voador {
	protected static int nAviao = 0;
	private double horasDeVoo;

	public Aviao() {
		super();
		Aviao.nAviao += 1;
	}

	@Override
	public void voar() {
		this.horasDeVoo += 13;
		System.out.println("- Estou voando como um avião, e tenho " + this.horasDeVoo + " horas de voo.");
	}

}
