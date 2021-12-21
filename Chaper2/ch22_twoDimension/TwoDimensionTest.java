package ch22_twoDimension;

public class TwoDimensionTest {
	public static void main(String[] args) {
		// int[][] arr = new int[3](За)[4](ї­)
		int[][] arr = {{1,2,3},{1,2,3,4}};
		
		int i,j;
		
		for (i=0; i<arr.length;i++) {
			
			for(j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]+",");
			}
			System.out.println("\t"+arr[i].length);
		}
	}

}
