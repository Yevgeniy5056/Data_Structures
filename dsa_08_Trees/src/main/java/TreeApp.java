public class TreeApp {
    public static void main(String[] args) {

        MTree tree = new MTree();
        int[] nums = {10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int num : nums) {
            tree.insert(num);
        }
        VisualizeTree.printTree(tree.root, null, false);
    }
}
