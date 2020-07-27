
public class String6 {
	public static void main(String args[]){
		String s="shilpa",s1="sai",temp=" ";
		int n=s.length();
		int n1=s1.length();
		if(n==n1){
			System.out.println("strings will not be the same length");
		}
		else if(n1<n){
			temp=s.concat(s1);
			for(int i=0;i<=s.length();i++){
				temp=temp+s.charAt(i);
			}
			System.out.println(temp);
		}
			else if(n<n1){
				temp=s1.concat(s);
				for(int i=0;i<=s1.length();i++){
					temp=temp+s1.charAt(i);
			}
				System.out.println(temp);
		
	   	}
	}	

}
