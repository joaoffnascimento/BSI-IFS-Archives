package exercicio05;
import java.util.*;

public class FuncaoEquacao {
	public static float equacao(int seq) {
		float resultado = 0.0f;
		Scanner read = new Scanner(System.in);
		seq = read.nextInt();

		float fatorial = 0.0f;
		int count = 1;

		if (seq == 1) {
			resultado = 1;
			
		} else if (seq == 2) {
			resultado = 2;
		} else if (seq > 2){
			resultado = 1;
			for (int i = 1; i <= seq; i++) {
				fatorial = 1;
				for (int j = 1; j <= count; j++) {
					fatorial *= j;
				}
				resultado = (resultado + (1.0f / fatorial));
				count ++;
			}
		}

		return resultado;
	}
}
