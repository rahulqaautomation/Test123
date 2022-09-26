import org.testng.annotations.Test;

public class teststts {

	
	public static void main(String [] args) {
		
		String[] x={"abcdeabcgh"};
		int c=x.length;
		int pos=0;
		int c1=0;
		String v="";
		for(int i=0;i<c;i++) {
			String m=x[i];
			for(int j=0;j<m.length();j++) {
				
				v=String.valueOf(m.charAt(j));
				for(int t=0;i<m.length();t++) {
					pos=m.indexOf(pos+1);				
					if(pos!=-1) {					
						
						c1++;
					}
				}
				System.out.println(v+"--"+c1);
				c1=0;
	
			}
			
			
		}
		
	}
}
