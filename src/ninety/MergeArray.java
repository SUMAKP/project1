package ninety;

public class MergeArray {

	public static void main(String[] args) {
		int[]ar1= {1,2,3,4};
		int[]ar2= {5,6,7,8};
		int size=ar1.length+ar2.length;
		int[]res=new int[size];
		int pos=0;
		for(int ele:ar1)
		{
			res[pos]=ele;
			pos++;
		}
		for(int ele:ar2)
		{
			res[pos]=ele;
			pos++;
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}

	}

}
