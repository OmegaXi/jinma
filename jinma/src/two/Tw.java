package two;

import java.util.Scanner;  
import java.math.*;  
   
public class Tw  
{  
    static final int N=2010;  
    static Scanner cin=new Scanner(System.in);  
    static BigInteger one=BigInteger.ONE,zero=BigInteger.valueOf(0);;  
    
    public static void main(String[] args)  
    {  
        // TODO Auto-generated method stub  
        BigInteger []d=new BigInteger[N];  
        BigInteger []f=new BigInteger[N];  
        int []c=new int[11];  
        c[1]=2;  
        c[7]=3;  
        c[4]=4;  
        c[2]=c[3]=c[5]=5;  
        c[0]=c[6]=c[9]=6;  
        c[8]=7;  
           
        for(int i=1;i<N;i++)  
            d[i]=zero;  
        d[0]=one;  
           
        for(int i=0;i<N;i++)  
            for(int j=0;j<10;j++)  
                if(!(i==0&&j==0)&&(i+c[j])<=2000)  
                {  
                    d[i+c[j]]=d[i+c[j]].add(d[i]);  
                }  
        f[0]=zero;  
        for(int i=1;i<=2000;i++)  
            f[i]=f[i-1].add(d[i]);  
        while(cin.hasNext())  
        {  
            int n=cin.nextInt();  
            if(n<6)  
                System.out.println(f[n]);  
            else 
                System.out.println(f[n].add(one));//n大于6时，包括0，所以要加一  
        }  
    }  
   
}