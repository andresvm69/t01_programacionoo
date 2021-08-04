package ejercicios.vectores;

import java.util.Scanner;

public class DeberVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		int X[] = new int[8];

		// 2.
		char Y[] = new char[3];
		Y[2] = 'A';

		// 3.
		char A[] = new char[5];
		A[0] = 25;
		A[3] = 49;
		A[2] = A[0];

		// 4
		char B[] = new char[10];
		B[0] = A[3];

		// 5
		int Z[] = new int[12];
		Z[0]=1;
		Z[1]=2;
		Z[2]=3;
		Z[3]=4;
		Z[4]=5;
		Z[5]=6;
		Z[6]=7;
		Z[7]=8;
		Z[8]=9;
		Z[9]=10;
		Z[10]=11;
		Z[11]=12;
		
		
		// 6.
		
		int P[] = new int [10];
		P[0]=1;
		P[1]=3;
		P[2]=5;
		P[3]=7;
		P[4]=9;
		P[5]=11;
		P[6]=13;
		P[7]=15;
		P[8]=17;
		P[9]=19;
		
		//7.
		
		char H[] = new char[10];
		H[1]='A';
		H[3]='B';
		H[5]='C';
		H[7]='D';
		H[9]='E';
		
		//8.
		char F[]= new char[10];
		F[0]=H[3];
		F[3]=H[2];
		F[4]=H[6];
		F[7]=H[0];
		F[8]=H[1];
		F[9]=H[9];
		
		//9. 
		int L[] = new int [15];
		L[0]=((3+10+7)/3 );
		L[4]=(5+7+8+15);
		L[7]=(5*7*3);
		L[10]=(10/2);
		
		//10.
		
		char N[] = new char [12];
		N[0]=((3+10+9)/3 );
		N[4]=(7+8+9);
		N[12]=(5*7*3);
		N[20]=(7-3+8);
		N[12]=(20/4);
	}

}
