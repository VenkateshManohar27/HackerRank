package com.vm.trie;

import java.util.HashMap;

public class Trie {
	private class TrieNode {
		private HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
		private boolean endOfWorld;

		public HashMap<Character, TrieNode> getChildren() {
			return children;
		}

		/*public void setChildren(HashMap<Character, TrieNode> children) {
			this.children = children;
		}*/

		public boolean isEndOfWorld() {
			return endOfWorld;
		}

		public void setEndOfWorld(boolean endOfWorld) {
			this.endOfWorld = endOfWorld;
		}

	}

	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode current = root;

		for (int i = 0; i < word.length(); i++) {
			char character = word.charAt(i);
			if (current.getChildren().get(character) != null) {
				current = current.getChildren().get(character);
				continue;
			}else{
				TrieNode node = new TrieNode();
				current.getChildren().put(character, node);
				current = node;
			}
		}
		current.setEndOfWorld(true);
	}
	
	public boolean search(String search){
		TrieNode current = root;
		for (int i = 0; i < search.length(); i++) {
			char character = search.charAt(i);
			if (current.getChildren().get(character) == null) {
				return false;
			}
			current = current.getChildren().get(character);
		}
		
		return current.endOfWorld;
	}
	
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("test");
		System.out.println(trie);
		System.out.println(trie.search("test"));
		System.out.println(trie.search("tests"));
		System.out.println(trie.search("abc"));
	}

}
