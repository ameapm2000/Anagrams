
public class Anagrams {

	public static void main(String[] args) 
	{
		System.out.println(isAnagram("aab","aba"));
	}
	
	public static boolean isAnagram(String a,String b)
	{
		if(a.length() != b.length())
			return false;
		
		int asciiArray[] = new int[256];
		int c;
		for(int i=0;i<a.length();i++)
		{
			c = a.charAt(i);
			asciiArray[c]++;
		}
		
		for(int i=0;i<b.length();i++)
		{
			c = b.charAt(i);
			if(--asciiArray[c] < 0)
				return false;
		}
		
		return true;
	}
}
