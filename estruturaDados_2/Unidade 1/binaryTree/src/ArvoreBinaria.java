/**
 * @author João F.F. Nascimento em 11/09/2018
 * @project binaryTree
 */

import java.io.Serializable;

public class ArvoreBinaria<T extends Comparable> implements Serializable {

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

    //-------------------------- Metodo Inserir OK -------------------------------------//

    public void inserir(T dado) {
        inserir(r, dado);
    }

    private void inserir(No<T> noAtual, T dado) {
        //se a arvore estiver vazia, instancia a raiz com o primeiro dado.
        //O no anterior a raiz nao existe, logo null.
        if (r == null) {
            r = new No<>(dado, null);
            System.out.println("Criada a raiz = {" + r.getDado() + "}");
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
                    System.out.println("Inserido o valor {" + noAtual.getMenor().getDado() + "} a esquerda de {" + noAtual.getDado() + "}");
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
                    System.out.println("Inserido o valor {" + noAtual.getMaior().getDado() + "} a direita de {" + noAtual.getDado() + "}");
                }
            }
        }
    }

    //----------------------------------- Metodo Busca ------------------------------------------------//
    public boolean buscar(T dado) {
        return buscar(r, dado);
    }

    private boolean buscar(No<T> r, T dado) {
        boolean achou = true;

        if (r == null) {
            achou = false;
        } else if (r.getDado().compareTo(dado) == 0) {
            achou = true;
        } else {
            if (r.getDado().compareTo(dado) >= 0) {
                achou = buscar(r.getMenor(), dado);
            } else if (r.getDado().compareTo(dado) < 0) {
                achou = buscar(r.getMaior(), dado);
            }
        }
        return achou;
    }
    //------------------------------------------------------------------------------------------------//

    public void remover(T dado) {
        remover(r, null, dado);
    }

    private void remover(No<T> desejado, No<T> noAnterior, T dado) {

        if (desejado != null) {
            if (desejado.getDado().compareTo(dado) >= 0) {
                remover(desejado.getMaior(), noAnterior, dado);

            } else if (desejado.getDado().compareTo(dado) < 0) {
                //
                remover(desejado.getMenor(), noAnterior, dado);

            } else if (desejado.getDado().compareTo(dado) == 0) {
                //Já encontrou o nó desejado
                //Casos de remoção
                //Resolve caso de subarvore
                //Remocao de um no folha
                if ((desejado.getMenor() == null) && (desejado.getMaior() == null)) {

                }
                if (desejado.getMenor() != null) {
                    noAnterior.setMenor(desejado.getMenor());
                    // metodo obter maior elemento do no que possa ter subarvore
                    No<T> maisDireita = maisDireita(desejado.getMenor());
                    //jogo de ponteiros
                    maisDireita.setMaior(desejado.getMaior());
                } else if (desejado.getMaior() != null) {
                    //Direita
                    noAnterior.setMaior(desejado.getMaior());
                    // metodo obter maior elemento do no que possa ter subarvore
                    No<T> maisEsquerda = maisEsquerda(desejado.getMenor());
                    //jogo de ponteiros
                    maisEsquerda.setMaior(desejado.getMenor());
                }
            }
        }
    }

    private void atualizarFilho(T dado, No<T> noPai, No<T> novo) {
        if (noPai == null) {
            r = novo;
        } else {
            if (noPai.getDado().compareTo(dado) > 0) {
                noPai.setMenor(novo);
            } else {
                noPai.setMaior(novo);
            }
        }
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

    public String testeVazia() {
        if (isVazia()) {
            return "Arvore vazia !!";
        } else {
            return "Arvore possue no mínimo 1 elemento !!";
        }
    }
}
