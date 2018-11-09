import java.io.Serializable;

public class ArvoreBinariaAVL<T extends Comparable> implements Serializable {

     /*     Compare to
            -1 quando a < b
            0 quando a == b
            1 quando a > b
            para utilizar com generico extender Comparable
     */

    //Inicio da arvore, raiz
    private No<T> r;

    //Construtor
    public ArvoreBinariaAVL() {
        r = null;
    }


    // -------------------------- ARVORE BINARIA BALANCEADA ----------------------//
    // -------------------- Metodo para descobrir Altura da Arvore ---------------//
    // --------------------------- Verificar balanceamento -----------------------//
    // ------------------------------ Fazer as rotacoes --------------------------//

    public int altura(No<T> r) { // retorna a altura
        return r == null ? -1 : r.getAltura();
    }

    public void verificarBalanceamento(No<T> atual) {
        setBalanceamento(atual);
        int balanceamento = atual.getAltura();

        if (balanceamento == -2) {

            if (altura(atual.getMenor().getMenor()) >= altura(atual.getMenor().getMaior())) {
                atual = rotacaoDireita(atual);

            } else {
                atual = duplaRotacaoEsquerdaDireita(atual);
            }

        } else if (balanceamento == 2) {

            if (altura(atual.getMaior().getMaior()) >= altura(atual.getMaior().getMenor())) {
                atual = rotacaoEsquerda(atual);

            } else {
                atual = duplaRotacaoDireitaEsquerda(atual);
            }
        }

        if (atual.getNoPai() != null) {
            verificarBalanceamento(atual.getNoPai());
        } else {
            this.r = atual;
        }
    }

    private void setBalanceamento(No no) {
        no.setAltura(altura(no.getMaior()) - altura(no.getMenor()));
    }

    public No<T> rotacaoEsquerda(No<T> inicial) {

        No<T> direita = inicial.getMaior();
        direita.setNoPai(inicial.getNoPai());

        inicial.setMaior(direita.getMenor());

        if (inicial.getMaior() != null) {
            inicial.getMaior().setNoPai(inicial);
        }

        direita.setMenor(inicial);
        inicial.setNoPai(direita);

        if (direita.getNoPai() != null) {

            if (direita.getNoPai().getMaior() == inicial) {
                direita.getNoPai().setMaior(direita);

            } else if (direita.getNoPai().getMenor() == inicial) {
                direita.getNoPai().setMaior(direita);
            }
        }

        setBalanceamento(inicial);
        setBalanceamento(direita);

        return direita;
    }

    public No rotacaoDireita(No<T> inicial) {

        No<T> esquerda = inicial.getMenor();
        esquerda.setNoPai(inicial.getNoPai());

        inicial.setMenor(esquerda.getMaior());

        if (inicial.getMenor() != null) {
            inicial.getMenor().setNoPai(inicial);
        }

        esquerda.setMaior(inicial);
        inicial.setNoPai(esquerda);

        if (esquerda.getNoPai() != null) {

            if (esquerda.getNoPai().getMaior() == inicial) {
                esquerda.getNoPai().setMaior(esquerda);

            } else if (esquerda.getNoPai().getMenor() == inicial) {
                esquerda.getNoPai().setMenor(esquerda);
            }
        }

        setBalanceamento(inicial);
        setBalanceamento(esquerda);

        return esquerda;
    }

    public No duplaRotacaoEsquerdaDireita(No<T> inicial) {
        inicial.setMenor(rotacaoEsquerda(inicial.getMenor()));
        return rotacaoDireita(inicial);
    }

    public No duplaRotacaoDireitaEsquerda(No<T> inicial) {
        inicial.setMaior(rotacaoDireita(inicial.getMaior()));
        return rotacaoEsquerda(inicial);
    }

    //-------------------------- METODO PARA INSERCAO -------------------------------------//
    public void inserir(T dado) {
        inserir(r, dado);
    }

    private void inserir(No<T> noAtual, T dado) {
        //se a arvore estiver vazia, instancia a raiz com o primeiro dado.
        //O no anterior a raiz nao existe, logo null.
        if (r == null) {
            r = new No<>(dado, null); // correcao do no pai
            System.out.println("Criada a raiz = {" + r.getDado() + "}");
            //se ja existe algum valor na arvore
        } else {
            //se o dado a ser inserido for menor que o dado do
            //no atual (durante a chamada recursiva); percorrer
            //a subarvore a esquerda para inserir um novo no a esquerda do atual
            if (dado.compareTo(noAtual.getDado()) < 0) {

                if (noAtual.getMenor() != null) {
                    inserir(noAtual.getMenor(), dado);
                    verificarBalanceamento(noAtual);

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
                    verificarBalanceamento(noAtual);
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

    //---------------------------- METODO PARA REMOCAO ----------------------------//

    public void remover(T dado) {
        //arvore está vazia
        if (this.r == null) ;
            //há apenas a raiz
        else if (this.getR().getDado() == dado &&
                this.getR().getMenor() == null &&
                this.getR().getMaior() == null) {
            this.r = null;
        } else {
            remover(this.getR(), null, dado);
            verificarBalanceamento(r);
        }
    }

    private void remover(No<T> desejado, No<T> noAnterior, T dado) {
        //se o no em questao nao possui o valor a ser removido
        //Fazer a busca na arvore
        if (desejado.getDado().compareTo(dado) != 0) {
            if (desejado.getDado().compareTo(dado) > 0) {
                if (desejado.getMenor() != null) {
                    remover(desejado.getMenor(), desejado, dado);
                }
            } else {
                if (desejado.getMaior() != null) {
                    remover(desejado.getMaior(), desejado, dado);
                }
            }
        } // se o no em questao possui o valor a ser removido
        else if (desejado.getDado().compareTo(dado) == 0) {
            No<T> auxiliar;
            //Remocao de folha (OK)
            if ((desejado.getMaior() == null) && (desejado.getMenor() == null)) {
                //se o no a ser removido for filho direito do pai
                if (noAnterior.getMaior() == desejado) {
                    noAnterior.setMaior(null);
                } else {
                    noAnterior.setMenor(null);
                }
            }
            //Remocao de NO QUE POSSUA 1 FILHO (OK)
            else if ((desejado.getMaior() == null) || (desejado.getMenor() == null)) {
                //pegue o antecessor ja que nao tem subarvore a DIREITA
                if (desejado.getMenor() != null) {
                    //ESQUEMA MAROTO PARA SABER QUAL LADO DA ARVORE TEM QUE ALTERAR
                    if (desejado.getDado().compareTo(r.getDado()) > 0) {
                        noAnterior.setMaior(desejado.getMenor());
                    } else {
                        noAnterior.setMenor(desejado.getMenor());
                    }
                    //pegue o antecessor ja que nao tem subarvore a ESQUERDA
                } else if (desejado.getMaior() != null) {
                    if (desejado.getDado().compareTo(r.getDado()) > 0) {
                        noAnterior.setMaior(desejado.getMaior());
                    } else {
                        noAnterior.setMenor(desejado.getMaior());
                    }

                }
            } else {
                //2 filhos, caso simples
                if (desejado.getDado().compareTo(r.getDado()) > 0) {
                    if (desejado.getMaior().getMenor() == null) {
                        //caso que nao tem que percorrer
                        desejado.getMaior().setMenor(noAnterior.getMaior().getMenor());
                        noAnterior.setMaior(desejado.getMaior());
                    }
                } else {
                    if (desejado.getMenor().getMaior() == null) {
                        //caso que nao tem que percorrer
                        desejado.getMenor().setMaior(noAnterior.getMenor().getMaior());
                        noAnterior.setMenor(desejado.getMenor());
                    }
                }
                //2 filhos caso que tem que percorrer a extrema esq ou dir
                //fazendo isso eu vou saber quem e o anterior ao mais esquerdo da direita
                //para poder quebrar a ligacao entre o anterior e o ultimo
                //e guardar o valor do ultimo para substituir pelo que vai ser apagado

                if (desejado.getDado().compareTo(r.getDado()) > 0) {//ok
                    No<T> extremo = maisEsquerda(desejado.getMaior());
                    No<T> anteriorExtremo = anteriorMaisEsquerda(desejado.getMaior(), noAnterior);
                    desejado.setDado(extremo.getDado());
                    remover(extremo, anteriorExtremo, extremo.getDado());
                } else {//ok
                    No<T> extremo = maisDireita(desejado.getMenor());
                    No<T> anteriorExtremo = anteriorMaisDireita(desejado.getMenor(), noAnterior);
                    desejado.setDado(extremo.getDado());
                    remover(extremo, anteriorExtremo, extremo.getDado());
                }

                //Remover valor do topo
                if ((r.getDado().compareTo(dado) == 0) && noAnterior == null) {
                    if (r.getMaior() == null) {
                        r = null;
                    } else {
                        No<T> auxExtremEsq = maisEsquerda(desejado.getMaior());
                        r.setDado(auxExtremEsq.getDado());
                        remover(auxExtremEsq, r, auxExtremEsq.getDado());
                    }
                }

            }
        }
    }

    //-------------- METODOS AUXILIARES ---------------------//

    //-------------------------------------------------------//
    // Método de pesquisa
    // Menor, procurar o maior.

    //-------------------------------------------------------//

    /*private No<T> maisDireita(No<T> aux) {
        if (aux.getMaior() == null) {
            return aux;
        }
        return maisDireita(aux.getMaior());
        //return aux.getMaior()==null?aux:maisDireita(aux.getMaior());
    }*/

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
        //return aux.getMaior()==null?aux:maisDireita(aux.getMaior());
    }

    //ALTERACOES NESTES METODOS PARA PEGAR A REFERENCIA DO ANTERIOR DO
    //ULTIMO NO AO PERCORRER A EXTREMA DIREITA OU ESQUERDA

    private No<T> anteriorMaisDireita(No<T> aux, No<T> anterior) {
        if (aux.getMaior() == null) {
            return anterior;
        } else {
            anterior = anteriorMaisDireita(aux.getMaior(), aux);
        }
        return anterior;
        //return aux.getMaior()==null?aux:maisDireita(aux.getMaior());
    }

    private No<T> anteriorMaisEsquerda(No<T> aux, No<T> anterior) {
        if (aux.getMenor() == null) {
            return anterior;
        } else {
            anterior = anteriorMaisEsquerda(aux.getMenor(), aux);
        }
        return anterior;
    }

    //----------------- Metodo Busca (melhorado) -----------------//
    public boolean buscar(T dado) {
        return buscar(r, dado);
    }

    private boolean buscar(No<T> r, T dado) {
        if (r == null)
            return false;

        if (r.getDado().compareTo(dado) == 0)
            return true;

        if (r.getDado().compareTo(dado) >= 0)
            return buscar(r.getMenor(), dado);

        return buscar(r.getMaior(), dado);
    }

    //-------- Listar Arvore -----------//

    //listar recursivamente
    public void listarArvore() {
        ListarCrescente(getR());
    }

    /*private void listarPreOrdem(No<T> no){
        if( no != null){
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

    //---------------- OUTROS --------------------//

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