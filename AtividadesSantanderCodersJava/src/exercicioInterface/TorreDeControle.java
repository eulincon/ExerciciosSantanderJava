package exercicioInterface;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {
	Voador voadores[];
	List<Voador> listaVoadores = new ArrayList<Voador>();

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
