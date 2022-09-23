package array;
import java.util.Scanner;

public class MatrixOperation {

	public static void main(String[] args) {
		int[][] arr = new int [3][3];
		int i,j;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the numbers");
		
		for (i=0; i<3; i++) {
			for(j = 0; j<3;j++) {
			 arr[i][j] = scanner.nextInt();
			}
		}
		for (i = 0;i<3 ;i++) {
			for (j=0; j<3 ;j++) {
				
				System.out.print(arr[i][j] + 10+" ");
			}
			System.out.print("\n");
		}
		
		

	}

}
