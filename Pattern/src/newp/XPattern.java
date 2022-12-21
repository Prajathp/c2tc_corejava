package newp;

import java.util.Scanner;

public class XPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=2*n;i++) {
			for(int j=1;j<2*n;j++) {
				if(i==j || i+j==2*n){
					System.out.print(j);
				}
				else {
					System.out.print(" ");	
					}
					
				}
			System.out.println("");
		}

	}

}
