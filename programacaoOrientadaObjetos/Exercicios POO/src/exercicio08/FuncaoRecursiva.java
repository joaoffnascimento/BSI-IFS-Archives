package exercicio08;
import java.util.*;

public class FuncaoRecursiva {
	public static int somatorio(int numero) {
		if (numero == 0) {
			return 0;
		} else if (numero == 1) {
			return 1;
		} else {
			return (numero+somatorio(numero-1));
		}
	}
}
