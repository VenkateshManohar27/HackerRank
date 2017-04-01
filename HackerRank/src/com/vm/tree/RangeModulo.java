package com.vm.tree;

import com.vm.utility.ArrayUtility;
import com.vm.utility.NextPowerOf2;

class SegmentTree2 {

	protected int[] segTree;

	public SegmentTree2(int[] input) {
		super();
		int nextPowOfTwo = NextPowerOf2.nextPowerOf2(input.length);
		this.segTree = new int[nextPowOfTwo * 2 - 1];
		constructTree(input, 0, input.length - 1, 0);
	}

	public void constructTree(int[] input, int low, int high, int pos) {
		if (low == high) {
			int count = 0;
			if(input[low]%2==0){
				count=1;
			}
			segTree[pos] = count;
			return;
		}
		int mid = (int) Math.floor((low + high) / 2);
		constructTree(input, low, mid, 2 * pos + 1);
		constructTree(input, mid + 1, high, 2 * pos + 2);
		segTree[pos] = segTree[2 * pos + 1]+segTree[2 * pos + 2];
	}

	private int rangeMinimumQuery(int low, int high, int qlow, int qhigh, int pos) {
		if (qlow <= low && qhigh >= high) {
			return segTree[pos];
		}
		if (qlow > high || qhigh < low) {
			return 0;
		}
		int mid = (low + high) / 2;
		return rangeMinimumQuery(low, mid, qlow, qhigh, 2 * pos + 1) +
				rangeMinimumQuery(mid + 1, high, qlow, qhigh, 2 * pos + 2);
	}

	public int rangeMinimumQuery(int qlow, int qhigh, int len) {
		return rangeMinimumQuery(0, len - 1, qlow, qhigh, 0);
	}
}

public class RangeModulo {
	public static void main(String[] args) {
		int input[] = { 2, 4, 5, 7, 8, 10 };
		SegmentTree2 st = new SegmentTree2(input);
		ArrayUtility.print(st.segTree);	
		System.out.println("Range 0*0 :" +st.rangeMinimumQuery( 0, 0, input.length));
		System.out.println("Range 0*1 :" +st.rangeMinimumQuery( 0, 1, input.length));
		System.out.println("Range 0*2 :" +st.rangeMinimumQuery( 0, 2, input.length));
		System.out.println("Range 0*3 :" +st.rangeMinimumQuery( 0, 3, input.length));
		System.out.println("Range 0*4 :" +st.rangeMinimumQuery( 0, 4, input.length));
		System.out.println("Range 0*5 :" +st.rangeMinimumQuery( 0, 5, input.length));
		
		System.out.println("Range 1*1 :" +st.rangeMinimumQuery( 1, 1, input.length));
		System.out.println("Range 1*2 :" +st.rangeMinimumQuery( 1, 2, input.length));
		System.out.println("Range 1*3 :" +st.rangeMinimumQuery( 1, 3, input.length));
		System.out.println("Range 1*4 :" +st.rangeMinimumQuery( 1, 4, input.length));
		System.out.println("Range 1*5 :" +st.rangeMinimumQuery( 1, 5, input.length));
		
		System.out.println("Range 2*2 :" +st.rangeMinimumQuery( 2, 2, input.length));
		System.out.println("Range 2*3 :" +st.rangeMinimumQuery( 2, 3, input.length));
		System.out.println("Range 2*4 :" +st.rangeMinimumQuery( 2, 4, input.length));
		System.out.println("Range 2*5 :" +st.rangeMinimumQuery( 2, 5, input.length));
		
		System.out.println("Range 3*3 :" +st.rangeMinimumQuery( 3, 3, input.length));
		System.out.println("Range 3*4 :" +st.rangeMinimumQuery( 3, 4, input.length));
		System.out.println("Range 3*5 :" +st.rangeMinimumQuery( 3, 5, input.length));
		
		System.out.println("Range 4*4 :" +st.rangeMinimumQuery( 4, 4, input.length));
		System.out.println("Range 4*5 :" +st.rangeMinimumQuery( 4, 5, input.length));		
		
		System.out.println("Range 5*5 :" +st.rangeMinimumQuery( 5, 5, input.length));
		
	}
	
	
}
