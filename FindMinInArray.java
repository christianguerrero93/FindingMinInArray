
public class FindMinInArray {
	
	public static int findMinInArray(int [] arr, int first, int last){
		if(first == last){ //looking at the same index location
			return arr[first];//return either one... it is the same
		}
		else{
			int mid = (first + last)  / 2;
			return Math.min(findMinInArray(arr, first, mid), findMinInArray(arr, mid+1, last));
		}
	}

}
