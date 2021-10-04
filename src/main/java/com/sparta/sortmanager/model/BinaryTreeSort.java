package com.sparta.sortmanager.model;

import com.sparta.sortmanager.controller.Sortable;

public class BinaryTreeSort implements Sortable {

    @Override
    public int[] runSort(int[] arry) {
        treeins(arry);
        inorderRec(root);
        return theLength.sortedArray;
    }

    private class GetTreeArray{
        int[] sortedArray;
        int sortedArrayIndex = 0;

        void setSortedArrayLength(int length){
            this.sortedArray = new int[length];
        }

        void getNodeValue(int nodeValue){
            this.sortedArray[sortedArrayIndex] = nodeValue;
            this.sortedArrayIndex++;
        }

    }

    private class Node {
            int key;
            Node left, right;

            public Node(int item)
            {
                key = item;
                left = right = null;
            }
        }

        // Root of BST
        Node root;

        // Constructor
        public BinaryTreeSort()
        {
            root = null;
        }

        // This method mainly
        // calls insertRec()

    void insert(int key){

            root = insertRec(root, key);
        }

        /* A recursive function to
        insert a new key in BST */
        Node insertRec(Node root, int key)
        {

        /* If the tree is empty,
        return a new node */
            if (root == null)
            {
                root = new Node(key);
                return root;
            }

        /* Otherwise, recur
        down the tree */
            if (key <= root.key)
                root.left = insertRec(root.left, key);
            else if (key > root.key)
                root.right = insertRec(root.right, key);

            /* return the root */
            return root;
        }

        // A function to do
        // inorder traversal of BST

    void inorderRec(Node root)
        {   int currentNode;
            if (root != null)
            {
                inorderRec(root.left);
                theLength.getNodeValue(root.key);
                inorderRec(root.right);
            }
        }
    GetTreeArray theLength = new GetTreeArray();
        void treeins(int arr[])
        {

            theLength.setSortedArrayLength(arr.length);

            for(int i = 0; i < arr.length; i++)
            {
                insert(arr[i]);
            }

        }


}
