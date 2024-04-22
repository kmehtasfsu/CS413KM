package HW4ParsingandBST;
/*************************************************
File: ParsingandBST.java
By: Kalise G. Shields
Date: April 15th, 2023
Compile: Suppose to properly compile with the Driver.java file in order to make a Binary Search Tree
Usage: 
System: Using VSCode on MacOs
Description: This file is used to create the functions for the Binary Search Tree
*************************************************/

import java.util.LinkedList;
import java.util.Queue;

public class ParsingandBST{

    static class Node{
        //Variables for the Nodes
        int data;
        Node left;
        Node right;

        Node(int data){
            //Initializes the varaibles used in the Node class
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Initializes the root of the tree
    public Node root;

    //Initializes the temp varaible to the root
    public Node temp = root;

    //Insertion of elements in the tree
    public void insertion(Node temp, int data){
        if(temp == null){
            root = new Node(data);
            return;
        }

        //Linked List made to store the elements
        Queue<Node> initialQ = new LinkedList<Node>();
        initialQ.add(temp);

        //
        while(!initialQ .isEmpty()){
            temp = initialQ.peek();
            initialQ.remove();

            if(temp.left == null){
                temp.left = new Node(data);
                break;

            }else{
                initialQ.add(temp.left);
            }

            if(temp.right == null){
                temp.right = new Node(data);
                break;

            }else{
                initialQ.add(temp.right);
            }
        }

        if(initialQ.isEmpty()){
            System.out.println("Oops there is no elements in this tree!");
        }
    }

    //Deletion of elements in the tree
    public Node deletion(Node root, int data){
        if(root == null){
            return root;
        }

        //Recursively call the deletion function to find the element to delete
        if(root.data > data){
            root.left = deletion(root.left, data);
            return root;
        }else if(root.data < data){
            root.right = deletion(root.right, data);
            return root;
        }

        // Handling case where the node to be deleted is a leaf node
        if(root.left == null && root.right == null){
            return null;
        }
        else if(root.left == null){
            Node temp = root.right;
            return temp;
        }else if(root.right == null){
            Node temp = root.left;
            return temp;
        }
        else{
            Node parent = root;
            Node successor = root.right;
            while(successor.left != null){
                parent = successor;
                successor = successor.left;
            }
        
            if(parent != root){
                parent.left = successor.right;
            }else{
                parent.right = successor.right;
            }
        
            // Copy the data from the successor to the current node
            root.data = successor.data;
            
            // Now we've copied the data, this will delete the successor node
            
            if (parent == root) {
                root.right = deletion(root.right, successor.data);
            } else {
                parent.left = deletion(parent.left, successor.data);
            }
        
            return root;
        }
    }
    

    //Search for elements in the tree
    public void search(Node root, int data){
        //New Linked list to store the elements
        Queue<Node> initialQ = new LinkedList<Node>();
        initialQ.add(root);

        //While loop to search for the element
        while(!initialQ.isEmpty()){
            temp = initialQ.peek();
            initialQ.remove();

            if(temp.data == data){
                System.out.println("The element " + data + " is in the tree!");
                break;
            }

            if(temp.left != null){
                initialQ.add(temp.left);
            }

            if(temp.right != null){
                initialQ.add(temp.right);
            }
        }

        //Will check to see if the element is not in the tree
        if(initialQ.isEmpty()){
            System.out.println("The element " + data + " is not in the tree!");
        }

    }
    //In-order traversal of the tree
    public void inorder(Node temp){
    
        if(temp == null){
            return;
        }

        //Inputs the elements in order
        inorder(temp.left);
        System.out.println(temp.data + " ");
        inorder(temp.right);
    }

    //Pre-order traversal of the tree
    public void preorder(Node temp){
        //
        if(temp == null){
            return;
        }

        //Puts elements in previous order
        System.out.print(temp.data + " ");
        preorder(temp.left);
        preorder(temp.right);
        
    }

    //Post-order traversal of the tree
    public void postorder(Node temp){
        //
        if(temp == null){
            return;
        }

        //Puts the elements in new order
        postorder(temp.left);
        postorder(temp.right);
        System.out.print(temp.data + " ");
    }

}
