package Trees.CreationAndTraversal;
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class Tree {
    Node root;

    public Tree() {
        root = null;
    }

    void add(int data) {
        root = addRecursive(root, data);
    }

    Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            return current;
        }
        return current;
    }

    void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }

    }

    void preOrderTraversal(Node node) {

        if (node != null) {
            System.out.print(node.data + " ");
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
        }

    }

    void postOrderTraversal(Node node) {

        if (node != null) {
            inOrderTraversal(node.left);
            inOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }

    }
}

public class Test_Trees {
    public static void main(String[] args) {
        Tree t1 = new Tree();
        t1.add(6);
        t1.add(4);
        t1.add(8);
        t1.add(3);
        t1.add(5);
        t1.add(7);
        t1.add(9);
        t1.inOrderTraversal(t1.root);
        System.out.println();
        t1.postOrderTraversal(t1.root);
        System.out.println();
        t1.preOrderTraversal(t1.root);
    }
}
