package exercicioInterface;

public class Main {

	public static void main(String[] args) {
		var pato = new Pato();
		var aviao = new Aviao();
		var superHomem = new SuperHomem();
		Voador[] arraiVoadores = {pato, aviao, superHomem};
		var torreDeControle = new TorreDeControle(arraiVoadores);

		torreDeControle.voemTodos();
		torreDeControle.voemTodos();
		torreDeControle.voemTodos();
		torreDeControle.voemTodos();
		torreDeControle.voemTodos();
		
	}

}
