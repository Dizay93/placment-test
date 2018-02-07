package basics;

import java.util.Scanner;

public class IntegerArray {

		    public static void main(String args[])
		    {
		        Scanner sc = new Scanner(System.in);
		        int listNumber[]=new int[5], display[]=new int[5];
		        int greater;
		        

		        
		        System.out.println("Enter 5 numbers  ");
		        for (int i=0;i<listNumber.length;i++)
		        {
		            System.out.print(i+1+"-- ");
		            listNumber[i] = sc.nextInt();
		        }
		        System.out.println();

		     
		        for(int j=0;j<listNumber.length;j++)
		        {
		            greater=0;
		            for(int k=0;k<listNumber.length;k++)
		            {
		                if(listNumber[j]>listNumber[k])
		                {
		                    greater++;
		                }
		            }
		            while (display[greater] == listNumber[j]) {
		                greater++;
		           }
		            display[greater] = listNumber[j];;
		        }

		     
		            for(greater=0;greater<display.length;greater++)
		            {
		                System.out.print(display[greater]+" ");
		            }
		        }
		        
		    }
		

	


