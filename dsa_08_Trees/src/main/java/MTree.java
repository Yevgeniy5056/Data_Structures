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
}
