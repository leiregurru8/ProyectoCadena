package clases;

import java.util.ArrayList;


public class Mergesort {								//MERGESORT
	public static <T extends IComparable> ArrayList<T> mergesort(ArrayList<T> array) {
		if(array.size() == 1) {
			return array;
		}
		ArrayList<T> leftArray = new ArrayList<T>(array.subList(0, array.size()/2));
		ArrayList<T> rightArray = new ArrayList<T>(array.subList(array.size()/2, array.size()));
		
		leftArray = mergesort(leftArray);
		rightArray = mergesort(rightArray);
		
		return merge(leftArray, rightArray);
	}


	
	private static <T extends IComparable> ArrayList<T> merge(ArrayList<T> leftArray, ArrayList<T> rightArray) {
		ArrayList<T> array = new ArrayList<>();
		while (leftArray.size() != 0 && rightArray.size() != 0) {
			if(leftArray.get(0).value() > rightArray.get(0).value()) {
				array.add(rightArray.get(0));
				rightArray.remove(0);
			} else {
				array.add(leftArray.get(0));
				leftArray.remove(0);
			}
		}	
		
		while(leftArray.size() != 0) {
			array.add(leftArray.get(0));
			leftArray.remove(0);
		}
		
		while(rightArray.size() != 0) {
			array.add(rightArray.get(0));
			rightArray.remove(0);
		}
		
		return array;
	}
}
