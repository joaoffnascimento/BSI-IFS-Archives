/*
public class Testepublic class Lista {
    Elemento primeiro;
    Elemento ultimo;
    int qtd;

    public Lista(){
        this.primeiro=null;
        this.ultimo = null;
        this.qtd = 0;
    }

    public boolean addInicio(No e){
        if(this.primeiro==null){
            primeiro
            this.ultimo = e;
            this.qtd++;
            e.proximo=null;
            return true;
        }else{
            e.proximo = this.primeiro;
            primeiro = e;
            this.qtd++;
            return true;
        }
    }



    public boolean addFim(Elemento e){
        if(this.primeiro==null){
            return this.addInicio(e);
        }else{
            this.ultimo.proximo = e;
            this.ultimo = e;
            this.qtd++;
            return true;
        }

    }

    public void  listar(){
        Elemento aux;
        aux = this.primeiro;
        if(aux == null){
            System.out.println("Lista Vazia");
        }else{
            while(aux!=null){
                System.out.println("A lista possui" + qtd);
                aux.mostrar();
                aux = aux.proximo;
            }
        }
    }

    public void removeInicio(){
        if(this.primeiro==null){
            System.out.println("Lista vazia");
        }else{
            this.primeiro = this.primeiro.proximo;
            this.qtd--;
        }

    }

    public void removeFim(){
        if(this.primeiro==null){
            System.out.println("Lista Vazia");
        }
        if(this.ultimo == this.primeiro){
            this.primeiro.mostrar();
            this.primeiro=null;
            this.ultimo=null;
            this.qtd--;
        }
        else{
            Elemento aux, pena;
            aux=this.primeiro;
            pena = aux;
            while(aux.proximo!=null){
                pena = aux;
                aux = aux.proximo;
            }
            pena.proximo = null;
            this.ultimo = pena;
            this.qtd--;
        }
    }

    public void quantidade(){
        System.out.println(this.qtd);
    }

    public void removePosicao(int p){
        Elemento aux = this.primeiro;
        Elemento anterior = null;

        if(p==0){
            this.removeInicio();
        }
        else if(p==(qtd-1)){
            this.removeFim();
        }
        else{
            for(int i=0; i<p; i++){
                anterior = aux;
                aux = aux.proximo;
            }
            anterior.proximo = aux.proximo;
            qtd--;
        }
    }
    public void addPosicao(Elemento e, int p){
        Elemento novo = e;
        Elemento aux = this.primeiro;

        if(p==0){
            this.addInicio(e);
        }
        else if(p==(qtd-1)){
            this.addFim(e);
        }
        else if(p<qtd){
            this.addInicio(e);
            System.out.println("Posição não existente, foi adicionado no inicio");
        }
        else{
            for(int i=0; i<p; i++){
                aux.proximo=aux;
            }
            novo.proximo=aux.proximo;
            aux.proximo=novo;
            qtd++;
        }

    }

    public void mostraNaPosicao(int p){
        if(p==0){
            System.out.println("Lista Vazia");
        }
        Elemento aux = this.primeiro;
        for(int i=0; i<p; i++){
            aux.proximo=aux;
        }
        aux.mostrar();
    }

}

 {
}
*/