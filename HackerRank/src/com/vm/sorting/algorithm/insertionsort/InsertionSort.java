package com.vm.sorting.algorithm.insertionsort;

public class InsertionSort<T> {
	public static <T extends Comparable<T>> T[] sort(T[] array){
		for(int endIndex = 1; endIndex < array.length; endIndex++){
			T temp =  array[endIndex];
			int pointer = endIndex -1;
			while(pointer>=0 && array[pointer].compareTo(temp) > 0){
				array[pointer+1] = array[pointer];
				pointer --;
			}
			array[pointer+1] = temp;
			
		}		
		
		return  array;
	}

}
