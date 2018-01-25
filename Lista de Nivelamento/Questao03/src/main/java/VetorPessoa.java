public class VetorPessoa {

    private Pessoa[] pessoas = new Pessoa[10];
    private int qtd = 0;


    public int anoNascimento(String dataNascimento) {
        int count = dataNascimento.length();
        String ano = "";
        for (int i = 0; i < count; i++) {
            if (i >= 6) {
                ano = ano + dataNascimento.charAt(i);
            }
        }
        return Integer.parseInt(ano);
    }

    public int mesNascimento(String dataNascimento) {
        //dd/mm/yyyy
        //0123456789
        String mes = dataNascimento.substring(3, 4);
        return Integer.parseInt(mes);
    }

    public int diaNascimento(String dataNascimento) {
        String dia = dataNascimento.substring(0, 1);
        return Integer.parseInt(dia);
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
