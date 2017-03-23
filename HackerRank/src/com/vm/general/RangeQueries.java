package com.vm.general;

import java.util.ArrayList;
import java.util.Scanner;

public class RangeQueries {

	public RangeQueries() {
		// TODO Auto-generated constructor stub
	}

	private static ArrayList<DataPoint> data = new ArrayList<DataPoint>();

	private static void printCount(int[] a) {
		for (DataPoint d : data) {
			int count = 0;
			for (int i = d.getLeft(); i <= d.getRight(); i++) {
				if ((a[i] % d.getX()) == d.getY()) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		for (int a0 = 0; a0 < q; a0++) {
			int left = in.nextInt();
			int right = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			// your code goes here
			DataPoint dp = new DataPoint(left,right,x,y );
			
			data.add(dp);
			
		}
		printCount(a);
	}
}

class DataPoint {
	
	
	public DataPoint(int left, int right, int x, int y) {
		super();
		this.left = left;
		this.right = right;
		this.x = x;
		this.y = y;
	}

	private int left;
	private int right;
	private int x;
	private int y;

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
