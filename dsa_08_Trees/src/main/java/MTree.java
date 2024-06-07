public class MTree {
    TNode root;

    public MTree() {
    }

    void insert(int val) {
        TNode newNode = new TNode(val);
        if (root == null) {
            root = newNode;
            return;
        }
        TNode currNode = root;
        while (true) {
            if (val <= currNode.val) {
                if (currNode.left == null) {
                    currNode.left = newNode;
                    break;
                }
                currNode = currNode.left;
            } else {
                if (currNode.right == null) {
                    currNode.right = newNode;
                    break;
                }
                currNode = currNode.right;
            }
        }
    }

    void preOrderTraversal(TNode root) {

        if (root == null) return;

        System.out.print(root.val + ", ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    void inOrderTraversal(TNode root) {

        if (root == null) return;

        inOrderTraversal(root.left);
        System.out.print(root.val + ", ");
        inOrderTraversal(root.right);
    }

    void postOrderTraversal(TNode root) {

        if (root == null) return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + ", ");
    }
}
