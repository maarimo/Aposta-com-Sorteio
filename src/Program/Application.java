package Program;
import java.util.Scanner;
import java.util.Locale;
import Result.Resultado;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Resultado result = new Resultado();
		
		
		System.out.println("Escolha um numero entre 1 e 10!!");
		result.numero = sc.nextInt();
		
		System.out.println("Quanto deseja apostar?");
		result.aposta = sc.nextDouble();
		
		System.out.printf("Você apostou $%.2f no numero %d", result.aposta, result.numero);
		
		result.sorteio = result.sortear();
		
		System.out.println();
		System.out.println("Numero sorteado: " + result.sorteio);
		
		result.imprimirResultado();
		
		
		sc.close();
	}

}
