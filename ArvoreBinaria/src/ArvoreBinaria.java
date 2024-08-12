public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (this.raiz == null) {
            this.raiz = novoNo;
        } else {
            No atual = this.raiz;
            No pai = null;
            boolean esquerda = false;
            while (atual != null) {
                if (novoNo.getValor() < atual.getValor()) {
                    pai = atual;
                    atual = atual.getEsq();
                    esquerda = true;
                } else {
                    pai = atual;
                    atual = atual.getDir();
                    esquerda = false;
                }
            }
            if (esquerda) {
                pai.setEsq(novoNo);
            } else {
                pai.setDir(novoNo);
            }
        }
    }

    public No getRaiz() {
        return this.raiz;
    }

    public void preOrdem(No no) {
        if (no == null) {
            return;
        }
        System.out.println(no.getValor());
        preOrdem(no.getEsq());
        preOrdem(no.getDir());
    }

    public void emOrdem(No no) {
        if (no == null) {
            return;
        }
        emOrdem(no.getEsq());
        System.out.println(no.getValor());
        emOrdem(no.getDir());
    }

    public void posOrdem(No no) {
        if (no == null) {
            return;
        }
        posOrdem(no.getEsq());
        posOrdem(no.getDir());
        System.out.println(no.getValor());
    }

    public boolean RemoverNoFolha(int valor) {

        No atual = this.raiz;
        No pai = null;

        while (atual != null) {
            if (valor == atual.getValor()) {
                if (atual.getEsq() == null && atual.getDir() == null) {
                    if (pai == null) {
                        this.raiz = null;
                    } else if (pai.getEsq() == atual) {
                        pai.setEsq(null);
                    } else {
                        pai.setDir(null);
                    }
                    return true;
                } else {
                    return false;
                }
            }
            pai = atual;
            if (valor < atual.getValor()) {
                atual = atual.getEsq();
            } else {
                atual = atual.getDir();
            }
        }
        return false;
    }

        //caso 1 filho esquerda
    public boolean RemoverNoFilhoEsquerda(int valor) {

        No atual = this.raiz;
        No pai = null;

        while (atual != null) {
            if (valor == atual.getValor()) {
                if (atual.getEsq() != null && atual.getDir() == null) {
                    if (pai == null) {
                        this.raiz = atual.getEsq();
                    } else if (pai.getEsq() == atual) {
                        pai.setEsq(atual.getEsq());
                    } else {
                        pai.setDir(atual.getEsq());
                    }
                    return true;
                } else {
                    return false;
                }
            }

            pai = atual;
            if (valor < atual.getValor()) {
                atual = atual.getEsq();
            } else {
                atual = atual.getDir();
            }
        }

        return false;
    }

    //caso 2 filho direita
    public boolean RemoverNoFilhoDireita(int valor) {

        No atual = this.raiz;
        No pai = null;

        while (atual != null) {
            if (valor == atual.getValor()) {
                if (atual.getEsq() == null && atual.getDir() != null) {
                    if (pai == null) {
                        this.raiz = atual.getDir();
                    } else if (pai.getEsq() == atual) {
                        pai.setEsq(atual.getDir());
                    } else {
                        pai.setDir(atual.getDir());
                    }
                    return true;
                } else {
                    return false;
                }
            }

            pai = atual;
            if (valor < atual.getValor()) {
                atual = atual.getEsq();
            } else {
                atual = atual.getDir();
            }
        }

        return false;
    }

    public boolean RemoverNoDoisFilhos(int valor) {

        No atual = this.raiz;
        No pai = null;

        while (atual != null) {
            if (valor == atual.getValor()) {
                if (atual.getEsq() != null && atual.getDir() != null) {
                    No paiMenor = atual;
                    No menor = atual.getDir();
                    while (menor.getEsq() != null) {
                        paiMenor = menor;
                        menor = menor.getEsq();
                    }
                    atual.setValor(menor.getValor());
                    if (paiMenor.getEsq() == menor) {
                        paiMenor.setEsq(menor.getDir());
                    } else {
                        paiMenor.setDir(menor.getDir());
                    }
                    return true;
                } else {
                    return false;
                }
            }
            pai = atual;
            if (valor < atual.getValor()) {
                atual = atual.getEsq();
            } else {
                atual = atual.getDir();
            }
        }
        return false;
    }
}









