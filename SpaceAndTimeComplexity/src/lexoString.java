
public class lexoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="bcad";
				printlexo(str,str,0);
			}

			public static void printlexo(String str,String limit,int si)
			{  
				  if(si==str.length()){
			      for(int j=0;j<limit.length();j++)
				        { if((limit.charAt(j))<=(str.charAt(j))) 
				          {  return;}
				        else
					  
				        { System.out.println(str);  
					   return;}
				   }}
				  
				   for(int i=si;i<str.length();i++)
				 {  
					 str=swap(str,si,i);
					 printlexo(str,limit,si+1);
				 
				 }
			
			}

			public static String swap(String str,int a,int b)
			{ char chararray[]=str.toCharArray();
			   char temp=chararray[a];
			   chararray[a]=chararray[b];
			   chararray[b]=temp;
			   return String.valueOf(chararray);
			}
			
			
			
		}
