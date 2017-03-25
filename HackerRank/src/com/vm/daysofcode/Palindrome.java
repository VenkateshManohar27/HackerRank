package com.vm.daysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Solution {
	
	private Stack<Character> stk = new Stack<Character>();
	private Queue<Character> q = new LinkedList<Character>();

	public void pushCharacter(char c) {
		stk.push(c);
	}

	public void enqueueCharacter(char c) {
		q.add(c);
	}

	public Object popCharacter() {
		return stk.pop();
	}

	public Object dequeueCharacter() {
		return q.remove();
	}

}

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Solution p = new Solution();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare
		// them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}
}
