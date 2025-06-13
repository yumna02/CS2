// Name: Yumna Ahmed; Date: 12/8/20; Assignment: Lab 24.21 Question9

import java.util.Iterator;  
import TreePackage.*;  

//import Tree.BinaryTreeInterface;

public class Labq9 {
	public static void main(String[] args) {
		
		BinaryTreeInterface<String> dTree = new BinaryTree<>();
		dTree.setTree("D", null, null);
		
		BinaryTreeInterface<String> fTree = new BinaryTree<>();
		fTree.setTree("F", null, null);
		
		BinaryTreeInterface<String> gTree = new BinaryTree<>();
		gTree.setTree("G", null, null);
		
		BinaryTreeInterface<String> hTree = new BinaryTree<>();
		hTree.setTree("H", null, null);
		
		BinaryTreeInterface<String> emptyTree = new BinaryTree<>();
		
		// Form larger subtrees
		BinaryTreeInterface<String> eTree = new BinaryTree<>();
		eTree.setTree("E", fTree, gTree); // Subtree rooted at E
		
		BinaryTreeInterface<String> bTree = new BinaryTree<>();
		bTree.setTree("B", dTree, eTree); // Subtree rooted at B
		
		BinaryTreeInterface<String> cTree = new BinaryTree<>();
		cTree.setTree("C", emptyTree, hTree); // Subtree rooted at C
		
		BinaryTreeInterface<String> aTree = new BinaryTree<>();
		aTree.setTree("A", bTree, cTree); // Desired tree rooted at A
		// Display root, height, number of nodes
		
		System.out.println("Root of tree contains " + aTree.getRootData());
		System.out.println("Height of tree is " + aTree.getHeight());
		System.out.println("Tree has " + aTree.getNumberOfNodes() + " nodes");
		// Display nodes in preorder
		
		System.out.println("A preorder traversal visits nodes in this order:");
		Iterator<String> preorder = aTree.getPreorderIterator();
		
		while (preorder.hasNext())
			System.out.print(preorder.next() + " ");
		System.out.println();
		
		System.out.println("A inorder traversal visits nodes in this order:");
		Iterator<String> inorder = aTree.getInorderIterator();
		
		while (inorder.hasNext())
			System.out.print(inorder.next() + " ");
		System.out.println();
		
		System.out.println("A postorder traversal visits nodes in this order:");
		Iterator<String> postorder = aTree.getPostorderIterator();
		
		while (postorder.hasNext())
			System.out.print(postorder.next() + " ");
		System.out.println();
		
		System.out.println("A level order traversal visits nodes in this order:");
		Iterator<String> levelorder = aTree.getLevelOrderIterator();
		
		while (levelorder.hasNext())
			System.out.print(levelorder.next() + " ");
		System.out.println();
		
	}
}