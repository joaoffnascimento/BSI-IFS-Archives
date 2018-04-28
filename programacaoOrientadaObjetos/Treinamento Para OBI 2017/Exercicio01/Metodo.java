import java.util.*;

public class Metodo {

	public static boolean calculoHomem(float altura, float peso) {
		float resultado = (72.7f * altura) - 58;
		boolean pesoIdeal = false;
		if (peso == resultado) {
			pesoIdeal = true;
		}

		return pesoIdeal;
	}

	public static boolean calculoMulher(float altura, float peso) {
		float resultado = (62.1f * altura) - 42.7f;
		boolean pesoIdeal = false;
		if (peso == resultado) {
			pesoIdeal = true;
		}

		return pesoIdeal;
	}
}
