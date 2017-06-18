package one;

import java.util.Scanner;

public class Add {
	static int add(int a,int b){
		return a+b;
	}
	public static void main(String[] args){
		while(true){
			Scanner a=new Scanner(System.in);
			int numa=a.nextInt();
			Scanner b=new Scanner(System.in);
			int numb=a.nextInt();
			int sum=add(numa,numb);
			System.out.println(sum);
		}
		
	}

}

/*
C++°æ
#include<iostream>
using namspace std;
int add(int a,int b)
{
	return a+b;
}
void main()
{
	int a,b,sum;
	while(cin>>a>>b)
	{
		cout<<add(a,b)<<endl;
	}
}
*/