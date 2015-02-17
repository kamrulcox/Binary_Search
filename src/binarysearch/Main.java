package binarysearch;

import java.util.Scanner;

public class BinarySearch {
	static Scanner sc = new Scanner(System.in);
	public static void BinarySearch(String[] args) {
		int data[] = {11, 21, 23, 34, 55 ,66, 77, 78, 88,99};
		int n = data.length;
		int search;
		System.out.print("Enter the Search item : ");
		search = sc.nextInt();

		BinarySearch obj = new BinarySearch();
		int location = obj.BinSearch(data, n, search);

		System.out.println("Location is : " +location);

	}

	public int BinSearch(int a[], int n, int x){
        int low = 0, high = n, mid;
        do{
            mid = (int) Math.floor((low+high)/2);
            if(x < a[mid]){
                high = mid - 1;
            } else if(x > a[mid]){
                low = mid + 1;
            }
            else
                return mid+1;
        } while(low <= high);
        return 0 ;
    }
}