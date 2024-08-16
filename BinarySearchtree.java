package DataStructers;

public class BinarySearchtree {
    treenode root;

    public void insert(treenode node) {
        root = insertHelper(root, node);
    }

    private treenode insertHelper(treenode root, treenode node) {
        int data = node.data;

        if (root == null) {
            root = node;
            return root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }

        return null;
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(treenode root) {
        if (root != null) {
            displayHelper(root.left);
        }

    }

    public boolean search(int data) {
        return false;
    }

    private boolean searcHelper(treenode root, int data) {
        return false;
    }

    public void remove(int data) {

    }

    private treenode removeHelper(treenode root, int data) {
        return null;
    }

    private int successor(treenode root) {
        return 0;
    }



    private int predecessor(treenode root) {
        return 0;
    }
}
