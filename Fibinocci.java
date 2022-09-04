package week1.day1;

public class Fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int firstNum=0;
        int  secNum=1;
        int sum=0;
        int count=11;
   	 System.out.println(firstNum);

         for(int i=1; i<count ;i++)
         {
        	 sum= firstNum + secNum;
           	 System.out.println(sum);
           	firstNum = secNum;
           	secNum = sum;
         }
	}

}
