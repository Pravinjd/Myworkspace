package Array_Equal_or_not;

import java.util.Arrays;

public class logic2 {

	public static void main(String[] args) {
		
		// using equals method
		
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		
		//first check if the lenght of both arrays are same or not
		
		boolean status=true;
		if(a.length == b.length)
		{
			//compare rest of the elements
			for(int i=0; i<a.length; i++)  //less than symbol
			{
				if (a[i] != b[i])
				{
					status=false;
				}
			}
			
		}
		else
		{
			status=false;
		}
		
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays NOT equal");
		}
		
	}

}
