public class VetorPessoas {

    Pessoa[] pessoas = new Pessoa[10]; //Vetor de objetos
    int qtd = 0; //controle

    public boolean cadastrarPessoas(Pessoa pessoa) {
        if (qtd >= pessoas.length) {
            return false;
        }
        pessoas[qtd] = pessoa;
        qtd++;
        return true;
    }

    public boolean verificarCPF(String cpf) {
        boolean result = false;
        for (int i = 0; i < qtd; i++) {
            if (pessoas[i].getCPF().equalsIgnoreCase(cpf)) {
                result = true;
            }
        }
        return result;
    }


    public void listarPessoas() {
        for (int i = 0; i < qtd; i++) {
            System.out.println(pessoas[i]);
        }
    }

}
