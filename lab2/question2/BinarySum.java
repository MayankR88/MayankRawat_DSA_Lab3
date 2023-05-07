//Answer to Question No.2

package com.gl.dsa.lab2.question2;


public class BinarySum {

	public static void main(String[] args) {

		// Sorted array with distinct elements
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = 8;

		int low = 0;
		int high = arr.length - 1;

		while (low < high) {

			
			if ((arr[low] + arr[high]) > sum) {
				high--;

			} else if ((arr[low] + arr[high]) < sum) {
				low++;

			} else if ((arr[low] + arr[high]) == sum) {
				System.out.println("Sum : "+sum + "\nPair: (" + arr[low] + " , " + arr[high] + " )");
				low++;
				high--;
				
			} else if ((arr[low] + arr[high]) != sum) {
				System.out.println("Nodes are not found");
			}
		}				
	}
}
	