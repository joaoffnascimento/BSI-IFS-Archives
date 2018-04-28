public class MetodosOrdenacao {
    public void mergeSort(int[] vetorElementos, int inicio, int fim, boolean flag) {
        int meio = (inicio + fim) / 2;

        if (inicio < fim) {
            mergeSort(vetorElementos, inicio, meio, flag);
            mergeSort(vetorElementos, meio + 1, fim, flag);
            ordenar(vetorElementos, inicio, meio, fim, flag);
        }
    }

    public void ordenar(int[] vetorElementos, int inicio, int meio, int fim, boolean flag) {
        //Lembrar dos indices, e lembrar que o merge utiliza um vetor auxiliar.
        int indiceVetorEsq, indiceVetorDir, posVetorAuxiliar;
        indiceVetorEsq = inicio;
        indiceVetorDir = meio + 1;
        posVetorAuxiliar = inicio;
        int[] vetorAuxiliar = new int[vetorElementos.length];

        while (indiceVetorEsq <= meio && indiceVetorDir <= fim) {

            if (flag) {
                if (vetorElementos[indiceVetorEsq] <= vetorElementos[indiceVetorDir]) {
                    vetorAuxiliar[posVetorAuxiliar] = vetorElementos[indiceVetorEsq];
                    indiceVetorEsq++;
                } else {
                    vetorAuxiliar[posVetorAuxiliar] = vetorElementos[indiceVetorDir];
                    indiceVetorDir++;
                }
                posVetorAuxiliar++;
            } else {
                if (vetorElementos[indiceVetorEsq] <= vetorElementos[indiceVetorDir]) {
                    vetorAuxiliar[posVetorAuxiliar] = vetorElementos[indiceVetorDir];
                    indiceVetorDir++;
                } else {
                    vetorAuxiliar[posVetorAuxiliar] = vetorElementos[indiceVetorEsq];
                    indiceVetorEsq++;
                }
                posVetorAuxiliar++;
            }
        }


        for (int i = indiceVetorEsq; i <= meio; i++) {
            vetorAuxiliar[posVetorAuxiliar] = vetorElementos[i];
            posVetorAuxiliar++;
        }

        for (int i = indiceVetorDir; i <= fim; i++) {
            vetorAuxiliar[posVetorAuxiliar] = vetorElementos[i];
            posVetorAuxiliar++;
        }

        for (int i = inicio; i <= fim; i++) {
            vetorElementos[i] = vetorAuxiliar[i];
        }

    }

    public void trocaPos(int[] vetorElementos, int indiceVetorEsq, int indiceVetorDir) {
        int varAux = vetorElementos[indiceVetorEsq];
        vetorElementos[indiceVetorEsq] = vetorElementos[indiceVetorDir];
        vetorElementos[indiceVetorDir] = varAux;
    }

    public void quickSort(int[] vetorElementos, int inicio, int fim, boolean flag) {
        int posPivo;

        if (inicio < fim) {
            posPivo = particao(vetorElementos, inicio, fim, flag);
            quickSort(vetorElementos, inicio, posPivo, flag);
            quickSort(vetorElementos, posPivo + 1, fim, flag);
        }
    }

    public int particao(int[] vetorElementos, int inicio, int fim, boolean flag) {
        int indiceVetorEsq, indiceVetorDir, posPivo, pivo;
        indiceVetorEsq = inicio;
        indiceVetorDir = fim;
        posPivo = (inicio + fim) / 2;
        pivo = vetorElementos[posPivo];

        while (indiceVetorEsq < indiceVetorDir) {
            if(flag){
                while (vetorElementos[indiceVetorEsq] < pivo) {
                    indiceVetorEsq++;
                }

                while (vetorElementos[indiceVetorDir] > pivo) {
                    indiceVetorDir--;
                }
            } else {
                while (vetorElementos[indiceVetorEsq] > pivo) {
                    indiceVetorEsq++;
                }

                while (vetorElementos[indiceVetorDir] < pivo) {
                    indiceVetorDir--;
                }
            }


            if (indiceVetorEsq < indiceVetorDir) {
                trocaPos(vetorElementos, indiceVetorEsq, indiceVetorDir);
                indiceVetorEsq++;
                indiceVetorDir--;
            }
        }
        return indiceVetorDir;
    }

}
