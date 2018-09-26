public class ArrayDemo{
	public static void printArray(int[]ary){
		System.out.println(ary);
	}
	public static void printArray(int[][] ary){
		System.out.println(ary);
	}
	public static int countZeros2D(int[][] nums){
		int count = 0;
		for (int i =0; i < nums.length;i++){
			if (nums[i].equals(0)){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String [] args){
	}
}
