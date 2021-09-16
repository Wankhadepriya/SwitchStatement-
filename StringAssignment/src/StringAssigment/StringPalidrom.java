package StringAssigment;

public class StringPalidrom 
{
	
		public static boolean isPalindrome(String str) {
			StringBuilder st = new StringBuilder(str);
			st.reverse();
			String sb = st.toString();
			if(str.equals(sb)) {
				return true;
			}
			else {
				return false;
			}
			
			
			
		}
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			StringPalidrom sp=new StringPalidrom();
		System.out.println(sp.isPalindrome("saas"));
		System.out.println(sp.isPalindrome("css"));
		}

	
}
