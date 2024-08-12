public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.inserir(17);
        arvoreBinaria.inserir(18);
        arvoreBinaria.inserir(5);
        arvoreBinaria.inserir(3);
        arvoreBinaria.inserir(7);
        arvoreBinaria.inserir(4);
        arvoreBinaria.inserir(62);
        arvoreBinaria.inserir(89);
        arvoreBinaria.RemoverNoFolha(7);
        arvoreBinaria.RemoverNoFilhoEsquerda(5);
        System.out.println("Pré-ordem: ");
        arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
        System.out.println("Em ordem: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println("Pós ordem: ");
        arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());
    }
}
