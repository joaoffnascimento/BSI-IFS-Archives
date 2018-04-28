package arrayInteirosAleatorios;
import java.util.*;

public class vetor {

	public static void methodVetor(int numeros[], String paridade[]) {
		Random random = new Random();
		boolean aux = false;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(10);
			if (numeros[i] % 2 == 0){
				aux = true;
			}
			if (aux){
				paridade[i] = "Par";
			} else if (!aux){
				paridade[i] = "Ímpar";
			}
			aux = false;
		}
	}
}
