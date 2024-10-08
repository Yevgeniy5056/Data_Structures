package Trees_Review_1;

public class LeetCodeTree {
    TreeNode root;

    public LeetCodeTree() {
    }

    void insert(int val) {
        TreeNode newNode = new TreeNode(val);
        // Tree is empty case
        if (root == null) {
            root = newNode;
            return;
        }
        // If tree is not empty find a place to insert new node
        TreeNode current = root;// start with root
        while (true) {
            if (val <= current.val) {

                if (current.left == null) {
                    // if left is null insert there!!!
                    current.left = newNode;
                    break;
                }
                //if left is not null branch into left subtree!!
                current = current.left;
            } else {
                if (current.right == null) {
                    // if right is null insert there!!!
                    current.right = newNode;
                    break;
                }
                //if rightChild is not null branch into right subtree!!
                current = current.right;
            }
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if (root == null) { // Tree empty
            return node;
        }
        // Not empty
        TreeNode curr = root;
        while (true) {
            if (val < curr.val) {
                if (curr.left == null) {
                    // insert node here!!!
                    curr.left = node;
                    return root;
                }
                curr = curr.left;// branch into left sub-tree
            } else {
                if (curr.right == null) {
                    // insert node here!!!
                    curr.right = node;
                    return root;
                }
                curr = curr.right;// branch into right sub-tree
            }
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        TreeNode current = root;
        while (current != null) {
            if (val < current.val) current = current.left;
            else if (val > current.val) current = current.right;
            else return current;
        }
        return null;
    }

    public void preOrderTraversal(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void inOrderTraversal(TreeNode root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    public void postOrderTraversal(TreeNode root) {
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }
}