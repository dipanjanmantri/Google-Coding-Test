package google_coding_sample;

public class Google_coding_test {

	public static void main(String[] args)
	{
		int n=623315;
		max_adjacent(n);
		//System.out.println("Max="+max);
	}

	private static void max_adjacent(int n) {
		// TODO Auto-generated method stub
		int l=0;
		int n1=n;
		while(n1!=0){
			n1/=10;
			l++;
		}
		int k=0;
		int[] arr=new int[l];
		int i=0;
		while(n!=0)
		{
			k=n%10;
			arr[i]=k;
			n=n/10;
			i++;
		}
		int[] arr1=new int[l-1];
		int i1=0;
		
		int k1=0;
		//System.out.println(arr[5]+""+arr[4]+""+arr[3]+""+arr[2]+""+arr[1]+""+arr[0]);
		for(int j=0;j<arr.length-1;j++)
		{
			k1=(arr[j]+arr[j+1])/2;
			arr1[i1]=k1;
			i1++;
			
		}
		
		//System.out.println(arr1[4]+""+arr1[3]+""+arr1[2]+""+arr1[1]+""+arr1[0]);
		String s1="";
		for(int j=arr.length-1;j>=2;j--)
		{
			
			s1=s1+arr[j];
		}
		s1+=arr1[0];
		//System.out.println(s1+arr1[0]);
		
		String s2="";
		for(int j=arr.length-1;j>=3;j--){
			s2+=arr[j];
		}
		s2+=arr1[1]+""+arr[0];
		String s3="";
		for(int j=arr.length-1;j>=4;j--)
		{
		   s3+=arr[j];	
		}
		s3+=arr1[2]+""+arr[1]+""+arr[0];
		String s4="";
		for(int j=arr.length-1;j>=5;j--)
		{
		   s4+=arr[j];	
		}
		s4+=arr1[3]+""+arr[2]+""+arr[1]+""+arr[0];
		String s5="";
		s5+=arr1[4]+""+arr[3]+""+arr[2]+""+arr[1]+""+arr[0];
		int[] num=new int[5];
		int k2=0;
		num[k2]=Integer.parseInt(s1);
		num[++k2]=Integer.parseInt(s2);
		num[++k2]=Integer.parseInt(s3);
		num[++k2]=Integer.parseInt(s4);
		num[++k2]=Integer.parseInt(s5);
		int max=0;
		System.out.println("The following numbers are");
		for(int x=0;x<num.length;x++)
		{
			System.out.print(num[x]+" ");
			
			if(num[x]>max){
				max=num[x];
			}
		}
		
		//System.out.println("The following numbers are "+num.toString());
		System.out.println();
		System.out.println("The max number is "+max);
	}
}
