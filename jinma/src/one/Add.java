package one;

import java.util.Scanner;

public class Add {
	static int add(int a,int b){
		return a+b;
	}
	public static void main(String[] args){
		System.out.println("Number A£º");
		Scanner a=new Scanner(System.in);
		int numa=a.nextInt();
		System.out.println("Number B£º");
		Scanner b=new Scanner(System.in);
		int numb=a.nextInt();
		int sum=add(numa,numb);
		System.out.println("The result is:"+sum+"¡£");
	}

}
