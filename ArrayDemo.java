public class ArrayDemo{
	public static String stringArr(int[] arr){
		String array = "[";
    for(int i = 0; i < arr.length-1; i++){
      array = array + arr[i] + ", ";
    }
    array += arr[arr.length - 1] + "]";
    return array;
	}
	public static String stringArr2(int[][] arr){
	  String array = "[";
	  for(int i = 0; i < arr.length; i++){
	    array += stringArr(arr[i]);
	  }
	  return array + "]";
	}
	public static void printArray(int[]ary){
		System.out.println(stringArr(ary));
	}
	public static void printArray(int[][] ary){
		System.out.println(stringArr2(ary));
	}
	public static int countZeros2D(int[][] nums){
		int count = 0;
		for (int i =0; i < nums.length;i++){
			for (int j = 0; j < nums[i].length; j++){
				if (nums[i][j] == 0){
					count++;
				}
			}
		}
		return count;
	}
	public static void fill2D(int[][] vals){
		for (int i = 0; i < vals.length; i++){
			for (int j = 0; j< vals[i].length; j++){
				if (i == j){
					vals[i][j] = 3;
				}
				else{
					vals[i][j] = 1;
				}
				System.out.println(vals[i][j]);
			}
		}
	}
	public static int[][] fill2DCopy(int[][] vals){
		int[][] newVals = new int[vals.length][vals[0].length];
		for (int i = 0; i < newVals.length; i++){
			for (int j = 0; j< newVals[i].length; j++){
				if (newVals[i][j] < 0){
					newVals[i][j] = 3;
				}
				else{
					newVals[i][j] = 1;
				}
			}
		}
		return newVals;
	}
	public static void main(String [] args){
		int[] arr1 = new int[] {0,1,2,3};
		int[][] arr2 = new int[][] {{0,1,2},{0,0,0}};
	  int[][] arr3 = new int[][] {{0,1,2},{0,4,5},{9,7,6}};
		printArray(arr1);
		printArray(arr2);
    System.out.println(countZeros2D(arr2));
		fill2D(arr3);
    System.out.println(fill2DCopy(arr3));
	}
}
