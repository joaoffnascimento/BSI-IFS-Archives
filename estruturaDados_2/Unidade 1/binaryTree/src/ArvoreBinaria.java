public class ArvoreBinaria<T extends Comparable> {

     /*     Compare to
            -1 quando a < b
            0 quando a == b
            1 quando a > b
            para utilizar com generico extender Comparable
     */

    //Inicio da arvore, raiz
    private No<T> r;

    //Construtor
    public ArvoreBinaria() {
        r = null;
    }

    //Recursivo
    public void inserir(T dado) {
        inserir(r, dado);
    }

    private void inserir(No<T> noAtual, T dado) {
        //se a arvore estiver vazia, instancia a raiz com o primeiro dado.
        //O no anterior a raiz nao existe, logo null.
        if (r == null) {
            r = new No<>(dado, null);
            //se ja existe algum valor na arvore
        } else {
            //se o dado a ser inserido for menor que o dado do
            //no atual (durante a chamada recursiva); percorrer
            //a subarvore a esquerda para inserir um novo no a esquerda do atual
            if (dado.compareTo(noAtual.getDado()) < 0) {

                if (noAtual.getMenor() != null) {
                    inserir(noAtual.getMenor(), dado);
                } else {
                    //Novo no a esquerda com as devidas referencias
                    noAtual.setMenor(new No<>(dado));
                    //Referenciar no pai
                    noAtual.getMenor().setNoPai(noAtual);
                }
            } else {
                //Percorrer a subarvore da direita para inserir um novo no
                //a direita do atual

                if (noAtual.getMaior() != null) {
                    inserir(noAtual.getMaior(), dado);
                } else {
                    //Novo no a direita com as devidas referencias
                    noAtual.setMaior(new No<>(dado));
                    //Referenciar no pai
                    noAtual.getMaior().setNoPai(noAtual);
                }
            }
        }
    }

    public No<T> remover(T dado) {
        return remover(r, null, dado);
    }

    private No<T> remover(No<T> corrente, No<T> ant, T dado) {

        if (corrente != null) {
            if (corrente.getDado().compareTo(dado) >= 0) {
                remover(corrente.getMaior(), corrente, dado);
            } else if (corrente.getDado().compareTo(dado) < 0) {
                //
                remover(corrente.getMenor(), corrente, dado);
            } else if (corrente.getDado().compareTo(dado) == 0) {
                //Já encontrou o nó desejado
                //Casos de remoção
                //Resolve caso de subarvore
                if (corrente.getMenor() != null) {
                    ant.setMenor(corrente.getMenor());
                    // metodo obter maior elemento do no que possa ter subarvore
                    No<T> maisDireita = maisDireita(corrente.getMenor());
                    //jogo de ponteiros
                    maisDireita.setMaior(corrente.getMaior());
                } else if (corrente.getMaior() != null) {
                    //Direita
                    ant.setMaior(corrente.getMaior());
                    // metodo obter maior elemento do no que possa ter subarvore
                    No<T> maisEsquerda = maisEsquerda(corrente.getMenor());
                    //jogo de ponteiros
                    maisEsquerda.setMaior(corrente.getMenor());
                }
            }
        }
        return r;
    }

    //listar recursivamente
    public void listarArvore() {
        ListarCrescente(getR());
    }

    /*private void listarPreOrdem(No<T> no){
        if(no != null){
            System.out.println(no.getDado() + " ");
            listarPreOrdem(no.getMenor());
            listarPreOrdem(no.getMaior());
        }
    }*/

    private void ListarCrescente(No<T> no) {
        if (no != null) {
            ListarCrescente(no.getMenor());
            System.out.println(no.getDado() + " ");
            ListarCrescente(no.getMaior());
        }
    }

    //----------------------------------------------------------------------------------------------------
    // Método de pesquisa
    // Menor, procurar o maior.

    //----------------------------------------------------------------------------------------------------
    private No<T> maisDireita(No<T> aux) {
        if (aux.getMaior() == null) {
            return aux;
        }
        return maisDireita(aux.getMaior());
        //return aux.getMaior()==null?aux:maisDireita(aux.getMaior());
    }

    private No<T> maisEsquerda(No<T> aux) {
        if (aux.getMenor() == null) {
            return aux;
        }
        return maisEsquerda(aux.getMenor());
    }


    public No<T> getR() {
        return r;
    }

    public void setR(No<T> r) {
        this.r = r;
    }

    public boolean isVazia() {
        return r == null;
    }
}
