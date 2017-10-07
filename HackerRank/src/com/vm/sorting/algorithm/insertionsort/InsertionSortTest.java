package com.vm.sorting.algorithm.insertionsort;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class InsertionSortTest {
	private Integer[] integerArray= {5,4,3,2,1};
	
	@Test
	public void testEmptyArray(){
		Integer[] resultingArr = InsertionSort.sort(integerArray);
		assertArrayEquals(resultingArr, integerArray);
	}
	
	@Test
	public void testFiveElements() {
		Integer[] arr = InsertionSort.sort(integerArray);
		assertEquals(arr[0], new Integer(1));
		assertEquals(arr[1], new Integer(2));
		assertEquals(arr[2], new Integer(3));
		assertEquals(arr[3], new Integer(4));
		assertEquals(arr[4], new Integer(5));
		
	}
	
	@Test
	public void testHundredElementsWorstCase() {
		Integer[] inputArr = new Integer[100];
		
		for (int i=0,j = 100; i < inputArr.length; i++,j--) {
			inputArr[i] = j;	
		}
		
		long start = System.nanoTime();
		Integer[] resultingArr = InsertionSort.sort(inputArr);
		System.out.println("testHundredElements: Time taken in nano:"+(System.nanoTime()-start) );
		assertEquals(resultingArr[0], new Integer(1) );
		assertEquals(resultingArr[50], new Integer(51) );
		assertEquals(resultingArr[99], new Integer(100) );
		
	}

	@Test
	public void testTenThousandElementsWorstCase() {
		Integer[] inputArr = new Integer[10000];
		
		for (int i=0,j = 10000; i < inputArr.length; i++,j--) {
			inputArr[i] = j;	
		}
		
		long start = System.nanoTime();
		Integer[] resultingArr = InsertionSort.sort(inputArr);
		System.out.println("testHundredElements: Time taken in nano:"+(System.nanoTime()-start) );
		assertEquals(resultingArr[0], new Integer(1) );
		assertEquals(resultingArr[50], new Integer(51) );
		assertEquals(resultingArr[99], new Integer(100) );
		assertEquals(resultingArr[5999], new Integer(6000) );
		assertEquals(resultingArr[7897], new Integer(7898) );
		assertEquals(resultingArr[9999], new Integer(10000) );
		
	}
	
	@Test()
	public void testLakhElementsWorstCase() {
		Integer[] inputArr = new Integer[100000];
		
		for (int i=0,j = 100000; i < inputArr.length; i++,j--) {
			inputArr[i] = j;	
		}
		
		long start = System.nanoTime();
		Integer[] resultingArr = InsertionSort.sort(inputArr);
		System.out.println("testHundredElements: Time taken in nano:"+(System.nanoTime()-start) );
		assertEquals(resultingArr[0], new Integer(1) );
		assertEquals(resultingArr[50], new Integer(51) );
		assertEquals(resultingArr[99], new Integer(100) );
		assertEquals(resultingArr[5999], new Integer(6000) );
		assertEquals(resultingArr[7897], new Integer(7898) );
		assertEquals(resultingArr[9999], new Integer(10000) );
		
	}
	
	@Test()
	public void testLakhElementsBestCase() {
		Integer[] inputArr = new Integer[100000];
		
		for (int i=0,j=1; i < inputArr.length; i++,j++) {
			inputArr[i] = j;	
		}
		
		long start = System.nanoTime();
		Integer[] resultingArr = InsertionSort.sort(inputArr);
		System.out.println("testHundredElements: Time taken in nano:"+(System.nanoTime()-start) );
		assertEquals(resultingArr[0], new Integer(1) );
		assertEquals(resultingArr[50], new Integer(51) );
		assertEquals(resultingArr[99], new Integer(100) );
		assertEquals(resultingArr[5999], new Integer(6000) );
		assertEquals(resultingArr[7897], new Integer(7898) );
		assertEquals(resultingArr[9999], new Integer(10000) );
		
	}
	
	@Ignore
	@Test
	public void testTenLakhElementsWorstCase() {
		Integer[] inputArr = new Integer[10000000];
		
		for (int i=0,j = 10000000; i < inputArr.length; i++,j--) {
			inputArr[i] = j;	
		}
		
		long start = System.nanoTime();
		Integer[] resultingArr = InsertionSort.sort(inputArr);
		System.out.println("testHundredElements: Time taken in nano:"+(System.nanoTime()-start) );
		assertEquals(resultingArr[0], new Integer(1) );
		assertEquals(resultingArr[50], new Integer(51) );
		assertEquals(resultingArr[99], new Integer(100) );
		assertEquals(resultingArr[5999], new Integer(6000) );
		assertEquals(resultingArr[7897], new Integer(7898) );
		assertEquals(resultingArr[9999], new Integer(10000) );
		
	}
}
