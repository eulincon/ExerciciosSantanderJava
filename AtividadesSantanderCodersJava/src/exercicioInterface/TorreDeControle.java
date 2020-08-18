package exercicioInterface;

public class TorreDeControle {
	Voador voadores[];

	public TorreDeControle(Voador[] voadores) {
		super();
		this.voadores = voadores;
	}

	// Percorre lista de voadores e fazer com que eles voem.
	public void voemTodos() {
		for (var i : this.voadores) {
			i.voar();
		}
		System.out.println("==========================");
	}
}
