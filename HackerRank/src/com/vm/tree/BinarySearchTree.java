package com.vm.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node<T extends Comparable<T>> {
	private T data;
	private Node<T> left = null;
	private Node<T> right = null;

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

}

public class BinarySearchTree<T extends Comparable<T>> {
	private static Queue queue = new LinkedList();
	private Node<T> root;

	public Node<T> insert(T t) {
		Node<T> node = new Node<T>(t);
		if (root == null) {
			root = node;
			return node;
		}
		Node<T> current = root;
		Node<T> parent = null;
		while (current != null) {
			parent = current;
			if (current.getData().compareTo(t) > 0) {
				current = current.getLeft();
			} else {
				current = current.getRight();
			}

		}
		if (parent.getData().compareTo(t) > 0) {
			parent.setLeft(node);
		} else {
			parent.setRight(node);
		}

		return root;
	}

	public static void preorder(Node node) {
		Node current = node;
		if (current != null) {
			System.out.println(node.getData());
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}

	public static void inorder(Node node) {
		Node current = node;
		if (current != null) {
			inorder(node.getLeft());
			System.out.println(node.getData());
			inorder(node.getRight());
		}
	}

	public static void postorder(Node node) {
		Node current = node;
		if (current != null) {
			postorder(node.getLeft());
			postorder(node.getRight());
			System.out.println(node.getData());

		}
	}

	public static void levelOrder(Node node) {
		Node current = node;
		if (current != null) {
			queue.add(node);

			while (!queue.isEmpty()) {
				Node tree = (Node) queue.remove();
				System.out.println(tree.getData());
				if (tree.getLeft() != null) {
					queue.add(tree.getLeft());
				}
				if (tree.getRight() != null) {
					queue.add(tree.getRight());
				}
			}

		}
	}

	public static int height(Node node) {
		if (node == null) {
			return -1;
		}
		int leftHeight = height(node.getLeft());
		int rightHeight = height(node.getRight());
		return Math.max(leftHeight, rightHeight) + 1;

	}

	public static int size(Node node) {
		if (node == null) {
			return 0;
		}
		int leftHeight = size(node.getLeft());
		int rightHeight = size(node.getRight());
		return leftHeight + rightHeight + 1;

	}

	private static boolean sameTree(Node root1, Node root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		return root1.getData() == root2.getData() && sameTree(root1.getLeft(), root2.getLeft())
				&& sameTree(root1.getRight(), root2.getRight());

	}

	public static void main(String[] args) {

		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		bst.insert(10);
		bst.insert(4);
		bst.insert(3);
		bst.insert(5);
		bst.insert(12);
		bst.insert(15);
		bst.insert(18);
		bst.insert(8);
		System.out.println("Pre Order:");
		preorder(bst.root);
		System.out.println("In Order:");
		inorder(bst.root);
		System.out.println("Post Order:");
		postorder(bst.root);
		System.out.println("Height:" + height(bst.root));
		System.out.println("SIZE:" + size(bst.root));

		bst = new BinarySearchTree<Integer>();

		bst.insert(4);
		bst.insert(2);
		bst.insert(1);
		bst.insert(3);
		bst.insert(6);
		bst.insert(5);
		bst.insert(7);

		System.out.println("Pre Order:");
		preorder(bst.root);
		System.out.println("In Order:");
		inorder(bst.root);
		System.out.println("Post Order:");
		postorder(bst.root);
		System.out.println("Level Order:");
		levelOrder(bst.root);

		System.out.println("Height:" + height(bst.root));
		
		System.out.println("SIZE:" + size(bst.root));

		BinarySearchTree<Integer> a = new BinarySearchTree<Integer>();

		a.insert(4);
		a.insert(2);
		a.insert(1);
		a.insert(3);
		a.insert(6);
		a.insert(5);
		a.insert(7);
		System.out.println("BST AND A are the same:" + sameTree(bst.root, a.root));

		BinarySearchTree<Integer> test = new BinarySearchTree<Integer>();
		test.insert(10);
		test.insert(4);
		test.insert(3);
		test.insert(5);
		test.insert(12);
		test.insert(15);
		test.insert(18);
		test.insert(8);

		System.out.println("test AND A are the same:" + sameTree(test.root, a.root));
	}

}
