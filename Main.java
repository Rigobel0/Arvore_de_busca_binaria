void main() {
    BinarySearchTree tree = new BinarySearchTree();

    tree.addNode(5);
    tree.addNode(7);
    tree.addNode(3);
    tree.addNode(11);
    tree.addNode(15);

    tree.inOrder();

    System.out.print("Quantidade de folhas: " + tree.countLeaves());
    System.out.println(" ");
    System.out.print("Nós folhas: "); tree.printLeaves();

}
