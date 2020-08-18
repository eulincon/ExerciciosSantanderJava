package exercicioInterface;

public class SuperHomem implements Voador {
	protected int experiencia;
	
	@Override
	public void voar() {
		this.experiencia += 3;
		System.out.println("- Estou voando como um campeão.");
	}

}
