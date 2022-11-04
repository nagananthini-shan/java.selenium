package week1day2;

import java.util.Arrays;

public class MissingElementIInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,3,4,7,8,5};
		Arrays.sort(num);
		for(int i=0;i<num.length;i++)
		{
			if(i+1!=num[i])
			{
				System.out.println(i+1);
				break;
			}
		}

	}

}
