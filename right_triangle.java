//Write a program to Reverse Right Half Pyramid
//* * * *
//* * *
//* *
//*
public class right_HalfPyramid {
	public static void main(String args[]) {
		int n = 4;
		printPattern(n);
	}
	public static void printPattern(int n)
	{
		int i;
		int j;
		for (i = n; i >= 1; i--) {
		for (j = 1; j <= i; j++) {
			System.out.print("*" + " ");
		}
			System.out.println();
		}
	}
}



//Write a program to print below pattern
//* * * * *
//*
//*
