public class TreeApp {
    public static void main(String[] args) {

        MTree tree = new MTree();
        int[] nums = {10, 6, 8, 20};
        for (int num : nums) {
            tree.insert(num);
        }
        VisualizeTree.printTree(tree.root, null, false);

        System.out.println("Pre-Order traversal of the Tree");
        tree.preOrderTraversal(tree.root);
        System.out.println("\nIn-Order traversal of the Tree");
        tree.inOrderTraversal(tree.root);
        System.out.println("\nPost-Order traversal of the Tree");
        tree.postOrderTraversal(tree.root);
        System.out.println("\nLevel-Order traversal of the Tree");
        tree.levelOrderTraversal(tree.root);
        System.out.println();
        System.out.println(tree.contains(8));
        System.out.println();
        tree.printLeaves(tree.root);
        System.out.println();
        System.out.println("Height of the root : " + tree.height(tree.root));
        System.out.println("Sum of tree nodes : " + tree.sumOfNodes(tree.root));
        System.out.println("Amount of leaves : " + tree.countLeaves(tree.root));
        System.out.println("Sum of leaves : " + tree.findSomeOfLeaves(tree.root));
        System.out.println("Sum of nodes with helper : " + tree.calculateNodeSums());
    }
}
