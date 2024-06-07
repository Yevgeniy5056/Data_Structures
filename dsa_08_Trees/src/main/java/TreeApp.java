public class TreeApp {
    public static void main(String[] args) {

        MTree tree = new MTree();
        int[] nums = {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
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
    }
}
