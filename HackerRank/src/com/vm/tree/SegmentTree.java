package com.vm.tree;

import com.vm.utility.ArrayUtility;
import com.vm.utility.NextPowerOf2;

public class SegmentTree {

	private int[] segTree;

	public SegmentTree(int[] input) {
		super();
		int nextPowOfTwo = NextPowerOf2.nextPowerOf2(input.length);
		this.segTree = new int[nextPowOfTwo * 2 - 1];
		constructTree(input, 0, input.length - 1, 0);
	}

	public void constructTree(int[] input, int low, int high, int pos) {
		if (low == high) {
			segTree[pos] = input[low];
			return;
		}
		int mid = (int) Math.floor((low + high) / 2);
		constructTree(input, low, mid, 2 * pos + 1);
		constructTree(input, mid+1, high, 2 * pos + 2);
		segTree[pos] = Math.min(segTree[2 * pos + 1], segTree[2 * pos + 2]);
	}
	
	private int rangeMinimumQuery(int low,int high,int qlow,int qhigh,int pos){
        if(qlow <= low && qhigh >= high){
            return segTree[pos];
        }
        if(qlow > high || qhigh < low){
            return Integer.MAX_VALUE;
        }
        int mid = (low+high)/2;
        return Math.min(rangeMinimumQuery( low, mid, qlow, qhigh, 2 * pos + 1),
                rangeMinimumQuery( mid + 1, high, qlow, qhigh, 2 * pos + 2));
    }
	public int rangeMinimumQuery(int qlow,int qhigh,int len){
        return rangeMinimumQuery(0,len-1,qlow,qhigh,0);
    }

	public static void main(String[] args) {
		int input[] = { 0, 3, 4, 2, 1, 6, -1 };
		SegmentTree st = new SegmentTree(input);
		ArrayUtility.print(st.segTree);
		System.out.println(st.rangeMinimumQuery( 0, 3, input.length));
		System.out.println(st.rangeMinimumQuery(1, 5, input.length));
		System.out.println(st.rangeMinimumQuery( 1, 6, input.length));
        
        int input2[] = { -1, 2, 4, 0 };
		st = new SegmentTree(input2);
		ArrayUtility.print(st.segTree);
	}

}
