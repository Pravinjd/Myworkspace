package Array_Duplicate_Elements;

public class Array_Duplicate_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String arr [] =  {"java","c","c++","python","Java","java","c++"};
		
		//compare java with rest of the elements
		
		boolean flag=false;
		
		for(int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++ )
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate element found : " +arr[i]);
					flag=true;
				}
			}
		}
		
		if (flag==false)
		{
			System.out.println("Duplicate element not found");
		}
	}

}