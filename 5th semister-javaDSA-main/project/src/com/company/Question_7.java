package com.company;

public class Question_7 {
    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
    Node root;
    Question_7()
    {
        root = null;
    }
    void insert(int key)
    {
        root = insertRec(root, key);
    }
//    insert a new key in BST */
    Node insertRec(Node root, int key)
    {
        if (root == null)
        {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }
    void inorder()
    {
        inorderRec(root);
    }
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        Question_7 tree = new Question_7();

        tree.insert(45);
        tree.insert(25);
        tree.insert(55);
        tree.insert(15);
        tree.insert(35);
        tree.insert(65);
        tree.inorder();
    }
}