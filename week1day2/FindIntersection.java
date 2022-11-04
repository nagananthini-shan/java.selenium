package week1day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1= {3,2,11,20,5};
		int[] num2= {5,10,2,6,3};
		for(int i=0;i<num1.length;i++)
		{
			for(int j=0;j<num2.length;j++)
			{
				if(num1[i]==num2[j])
				{
					System.out.println(num1[i]);
				
				}
			}
		}

	}

}
