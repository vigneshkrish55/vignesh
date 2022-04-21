package vignesh;

public class Arrayv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[][] ar = new int[3][3];
 int val = 1;
 int row = 0;
 while (row < 3)
 {
	 int col = 0;
	 while (col < 3)
	 {
		 ar[row][col] = val;
		 val += 1;
		 col++;
		 
	 }
	 row++;
	 
 }
 for(int i=0;i<3;i++)
 {
	 for(int j=0;j<3;j++)
	 {
		 System.out.print(ar[i][j]+ " ");
		 
	 }
	 System.out.println();
	 
	 
 }
	}

}
