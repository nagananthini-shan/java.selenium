package week1day2;

public class Palindrome {

	public static void main(String[] args) {
		int num=34343;
		int rem,sum=0,temp;
		temp=num;
		while(num>0)
			{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			}
		if(temp==sum)
		{
				System.out.println("The given number is palindrome");
			}
			else
			{
				System.out.println("The given number is not palindrome");
			}
		}
		

	}


