public class ListaNO implements ILista{

    private Object lista[];
    private int tamanho;
    private boolean estaInicializado;

    public void inicializar(int quantidadeMaxima) {
        lista = new Object[quantidadeMaxima];
        tamanho = 0;
        this.estaInicializado = true;
    }

    public void adicionar(Comparable o) throws ListaException {
        if (this.tamanho < this.lista.length) {
            this.lista[tamanho] = o;
            this.tamanho++;
        } else if (this.tamanho >= this.lista.length) {
            throw new ListaException("Vetor cheio, não é possível incluir!");
        } else if (this.estaInicializado == false) {
            throw new ListaException("Vetor não foi inicializado");
        }
    }

    public void remover(Object chave) throws ListaException {

    }

    public boolean contem(Object chave) {
        return false;
    }

    /*


    public void imprimirLista() {
        System.out.println("*************IMPRIMINDO LISTA***************");
        for (int i = 0; i < this.tamanho; i++) {
            if (this.lista[i] != null) {
                System.out.println("Posição " + i + ": " + this.lista[i]);
            }
        }
        System.out.println("****************************");
    }

    @Override
    public void inicializar(int quantidadeMaxima) {
        lista = new Object[quantidadeMaxima];
        tamanho = 0;
        this.estaInicializado = true;
    }

    @Override
    public void incluir(Object elemento) throws Exception {
        if (this.tamanho < this.lista.length) {
            this.lista[tamanho] = elemento;
            this.tamanho++;
        } else if (this.tamanho >= this.lista.length) {
            throw new Exception("Vetor cheio, não é possível incluir!");
        } else if (this.estaInicializado == false) {
            throw new Exception("Vetor não foi inicializado");
        }
    }

    @Override
    public void incluirInicio(Object elemento) throws Exception {//O(1)
        if (verificarInicializacao() && this.tamanho < this.lista.length) {
            if (this.tamanho < this.lista.length) {
                this.lista[tamanho] = this.lista[0];
                this.lista[0] = elemento;
                this.tamanho++;
            }
        } else {
            throw new Exception("Vetor está cheio ou nao fo inicializado");
        }
    }

    @Override
    public void incluir(Object elemento, int posicao) throws Exception {
        if (posicao >= 0 && posicao <= this.tamanho && this.tamanho < this.lista.length) {
            this.tamanho++;//Crio uma nova posição
            this.lista[this.tamanho] = this.lista[posicao];//Movo o elemento que já ocupa a posição desejada para o final, deixando a "vaga livre"
            this.lista[posicao] = elemento;//Coloco o novo elemento na posição desejada.
        } else {
            throw new Exception("Erro ao incluir elemento na posição selecionada!");
        }
    }

    @Override
    public Object obterDaPosicao(int posicao) throws Exception {//Programa exibe o objeto na posição inserida pelo usuário
        if (posicao >= 0 && posicao <= this.lista.length && this.lista[posicao] != null) {
            return this.lista[posicao];
        } else {
            throw new Exception("A posição informada não é válida ou está nula!");
        }
    }

    @Override
    public int obter(Object item) throws Exception {//Corrigir
        for (int i = 0; i <= this.tamanho; i++) {
            if (item.equals(this.lista[i])) {
                return i;
            }
        }
        throw new Exception("Não foi possível localizar o objeto");
    }

    @Override
    public void remover(int posicao) throws Exception {
        if (posicao >= 0 && posicao <= this.tamanho) {
            this.lista[posicao] = this.lista[this.tamanho-1];//Corrigi aqui a parte this.tamanho-1
            this.tamanho--;
        } else {
            throw new Exception("Posição inválida!");
        }

    }

    @Override
    public void limpar() throws Exception {
        if (this.estaInicializado) {
            this.tamanho = 0;
        } else {
            throw new Exception("Erro! O vetor ainda não foi inicializado.");
        }
    }

    @Override
    public int getTamanho() throws Exception {
        if (verificarInicializacao() && this.lista[0] != null) {
            return this.tamanho;
        } else {
            throw new Exception("O vetor está limpo ou não foi inicializado");
        }

    }

    @Override
    public boolean contem(Object item) throws Exception {
        if (verificarInicializacao()) {
            for (int i = 0; i <= this.tamanho; i++) {
                if (item.equals(this.lista[i])) {
                    return true;
                }
            }
        } else {
            throw new Exception("Erro ao verificar a lista.");
        }
        return false;
    }

    @Override
    public boolean verificarInicializacao() throws Exception {
        if (this.estaInicializado == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean estahCheia() throws Exception {
        if (verificarInicializacao() == true) {
            if (this.tamanho == this.lista.length-2) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new Exception("Erro: O vetor não foi inicializado!");
        }
    }*/ //ListaIA**
    //http://blog.caelum.com.br/ordenando-colecoes-com-comparable-e-comparator/
}
