import java.util.LinkedList;
import java.util.Queue;

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

    void levelOrderTraversal(TNode root) {

        if (root == null) return;

        Queue<TNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TNode temp = q.poll();
            System.out.print(temp.val + ", ");
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
    }

    boolean contains(int val) {
        if (root == null) return false;
        TNode curr = root;
        while (curr != null) {
            if (val < curr.val) curr = curr.left;
            else if (val > curr.val) curr = curr.right;
            else return true;
        }
        return false;
    }
}
