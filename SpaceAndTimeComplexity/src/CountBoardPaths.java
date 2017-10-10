
public class CountBoardPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int re[]=new int[11];
		int rv=countboardpaths(0,10,re);
		System.out.println(rv);
	}

	
	public static int countboardpaths(int curr,int end,int arr[])
	{   int rv=0;
		
		if(curr==end)
	{ return 1;}
	if(curr>end)
	{ return 0;}
	if(arr[curr]!=0)
	{  return arr[curr];}
	for(int dice=1;dice<=6;dice++)
	{  rv=countboardpaths(curr+dice,end,arr)+rv;
	}
	arr[curr]=rv;
	return rv;
}
}