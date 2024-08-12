
# Árvore Binária em Java

Este repositório contém uma implementação de uma árvore binária em Java com funcionalidades básicas de inserção e remoção de nós.

## Funcionalidades

### Inserção de Nós

- **inserir(int valor)**: Adiciona um novo nó com o valor especificado na árvore binária. O novo nó é inserido na posição correta para manter a propriedade da árvore binária de busca.

### Remoção de Nós

- **RemoverNoFolha(int valor)**: Remove um nó que é uma folha (sem filhos). Se o nó a ser removido for uma folha, ele é simplesmente removido da árvore.
  
- **RemoverNoUmFilho(int valor)**: Remove um nó que possui exatamente um filho. Dependendo se o filho está à esquerda ou à direita, o nó é removido e o filho é conectado diretamente ao pai do nó removido.
  
- **RemoverNoDoisFilhos(int valor)**: Remove um nó que possui dois filhos. O nó é substituído pelo menor valor na subárvore direita.




# ÁrvoreBase

![ÁrvoreBase](https://github.com/user-attachments/assets/e1f81cdd-424d-48a1-9744-ea1ff78b5909)
