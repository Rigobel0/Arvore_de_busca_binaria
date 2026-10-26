# Arvore_de_busca_binaria

i. Nome completo do aluno;
- Gabriel Ramos Rigobelo
  
ii. Breve descrição do projeto; 
-   Está sendo estudado a estrutura de dados chamado Árvores Binárias,
  uma estrutura não linear onde cada nó pode ter no máximo 2 filhos
  nesta árvore é possível adcionar nós e fazer procuras de 3 formas
  diferentes: pré-ordem, em ordem e pós-ordem.
-   A última coisa a ser implementada foi o contador de folhas junto
  com o PrintLeaves, onde o primeiro conta quantas folhas tem e o
  segundo mostra quais são as folhas.

iii. Explicação resumida sobre como a estrutura foi implementada;
- 

iv. Um exemplo de utilização da árvore (criação, inserção de nós e exibição da contagem de folhas)
void main() {
    BinarySearchTree tree = new BinarySearchTree();

    tree.addNode(5);
    tree.addNode(7);
    tree.addNode(3);
    tree.addNode(11);
    tree.addNode(15);
    tree.addNode(20);

    System.out.print("Quantidade de folhas: " + tree.countLeaves());
    System.out.println(" ");
    System.out.print("Nós folhas: "); tree.printLeaves();
}

Output: 
- Quantidade de folhas: 2 
- Nós folhas: 3 20 
