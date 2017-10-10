import java.util.ArrayList;

public class Splittingofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]={1,2,3,4,5};
     System.out.println(targets(arr,0,5));
	}

	
	public static ArrayList<ArrayList<Integer>> targets(int[]arr,int si,int target)
	{  
	       if(si==arr.length)
	       {  ArrayList<ArrayList<Integer>> baseResult = new ArrayList<>();
                  if(target==0)
			      {baseResult.add(new ArrayList<>());}

			return baseResult;}
	
		ArrayList<ArrayList<Integer>> recrr1=targets(arr,si+1,target);
		ArrayList<ArrayList<Integer>> recrr2=targets(arr,si+1,target-arr[si]);
		
		ArrayList<ArrayList<Integer>> myResult = new ArrayList<>();
		for(int i=0;i<recrr1.size();i++)
		{ myResult.add(recrr1.get(i));}
		
		for(int i=0;i<recrr2.size();i++)
		{  recrr2.get(i).add(arr[si]);
		   myResult.add(recrr2.get(i));
		}
	return myResult;
}
}