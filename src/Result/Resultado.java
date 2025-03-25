package Result;

import java.util.concurrent.ThreadLocalRandom;

public class Resultado {
	public int numero;
	public double aposta;
	public double lucro = aposta * 10;
	public int sorteio;

	
	public int sortear() {
		return ThreadLocalRandom.current().nextInt(1, 2);
		}
	
	
	
	public void imprimirResultado() {
		if (numero == sorteio) {
			System.out.printf("Parabens você ganhou $%.2f", this.lucro);
		} else {
			System.out.println("Parabens vc perdeu!!");
		}
	}
	
	
}




