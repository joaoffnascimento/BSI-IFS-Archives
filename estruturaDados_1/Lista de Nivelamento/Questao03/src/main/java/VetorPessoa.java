public class VetorPessoa {

    private Pessoa[] pessoas = new Pessoa[10];
    private int qtd = 0;

    public void selectionSort() {
        //Procurar o índice com o menor valor e salvar (i = 0);
        //Pegar o índice do menor valor e trocar com a posição 0 do vetor, e assim por diante;
        //Diminuir o tamanho do vetor para "pular" os valores que já estão nas suas posições correta;
        //exemplo: (i = 5) menor valor; (i = 0) recebe esse valor e i(i-1) é a prox tamanho para busca;
        //Segundo valor para a segunda menor posição;
        //Ou no caso do for (int j = i + 1; j < vetor.length; j++);

        int menorIndice = 0;
        for (int i = 0; i < qtd; i++) {
            menorIndice = i;
            for (int j = i + 1; j < qtd; j++) {
                //Seleção da chave, ano nascimento.
                int anoPessoaJ = anoNascimento(pessoas[j]);
                int anoPessoaMenorIndice = anoNascimento(pessoas[menorIndice]);

                if (anoPessoaJ < anoPessoaMenorIndice) {
                    menorIndice = j;
                }
                //Efetuar a troca do menor valor para o menor índice;
                //Salvar os dados que estão no menor índice para colocar no lugar a ser trocado;
                Pessoa aux;
                aux = pessoas[i];
                pessoas[i] = pessoas[menorIndice];
                pessoas[menorIndice] = aux;

            }

        }


    }

    //Método de classe para poder chamar no método acima
    public static int anoNascimento(Pessoa pessoa) {
        //dd/mm/aaaa
        //0123456789
        String ano = pessoa.getDataNascimento().substring(6, 9);
        return Integer.parseInt(ano);
    }


    public boolean cadastrarPessoa(Pessoa pessoa) {
        if (qtd > pessoas.length) {
            return false;
        }

        pessoas[qtd] = pessoa;
        qtd++;
        return true;
    }

    public boolean verificarCPF(String cpf) {
        boolean result = false;
        for (int i = 0; i < qtd; i++) {
            if (pessoas[i].getCpf().equalsIgnoreCase(cpf)) {
                result = true;
            }
        }
        return result;
    }

    public void exibirPessoas() {
        for (int i = 0; i < qtd; i++) {
            System.out.println(pessoas[i]);
        }
    }

}
