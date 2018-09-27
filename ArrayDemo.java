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
	public static void fill2D(int[][] vals){
		for (int i = 0; i < vals.length; i++){
			for (int j = 0; j< vals[i].length; j++){
				if (i == j){
					vals[i][j] = 3;
				}
				else{
					vals[i][j] = 1;
				}
			}
		}
	}
	public static int[][] fill2DCopy(int[][] vals){
		int[][] newVals = new int[vals.length][vals[].length];
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
	}
	public static void main(String [] args){
	}
}
