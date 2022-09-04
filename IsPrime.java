package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int i,a=0,flag=0;      
		  int num=5;  
		  a =num/2;      
		  if(num==0||num==1){  
		   System.out.println(num+" is not prime number");      
		  }else{  
		   for(i=2;i<=a;i++){      
		    if(num%i==0){      
		     System.out.println(num+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(num+" is prime number"); }  
		  } 
		}    
	}


