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
            else {
                if (isLeaf(curr)) System.out.println("It is a Leaf");
                return true;
            }
        }
        return false;
    }


    boolean isLeaf(TNode node) {
        return node.left == null && node.right == null;
    }

    public void printLeaves(TNode root) {
        if (root == null) return;
        printLeaves(root.left);
        printLeaves(root.right);
        if (isLeaf(root)) System.out.print(root.val + ", ");
    }

    int height(TNode root) {
        if (root == null) return -1;
        if (isLeaf(root)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    int sumOfNodes(TNode root) {
        if (root == null) return 0;
        return root.val + sumOfNodes(root.left) + sumOfNodes(root.right);

    }

    int countLeaves(TNode root) {
        if (root == null) return 0;
        if (isLeaf(root)) return 1;
        return countLeaves(root.left) + countLeaves(root.right);
    }

    int findSomeOfLeaves(TNode root) {
        if (root == null) return 0;
        if (isLeaf(root)) return root.val;
        return findSomeOfLeaves(root.left) + findSomeOfLeaves(root.right);
    }
    public int calculateNodeSums(){
        return nodeSums(root);
    }
    int nodeSums(TNode root) {
        if (root == null) return 0;
        return root.val + nodeSums(root.left) + nodeSums(root.right);
    }
}
