public class Formulas {
    public float formulaLetraA(float salarioAtual, int idade, int qtdFilhos) {
        if (qtdFilhos == 1) {
            return salarioAtual + idade / 1;
        }
        return (salarioAtual + idade) / fatorial(qtdFilhos);
    }

    private float fatorial(float input) {
        if (input == 1 || input == 0) {
            return 1;
        }
        return input * fatorial(input - 1);
    }

    public float formulaLetraB(float input) {
        if (input == 1 || input == 0) {
            return 2 * (input) / (input - 1);
        }

        return 2 * fatorial(input) / fatorial(input - 1);
    }

    public int formularLetraC(int input) {
        if (input == 1) {
            return 0;
        }
        if (input == 2) {
            return 1;
        }

        return formularLetraC(input - 1) + formularLetraC(input - 2);
    }
}
