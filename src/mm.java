
import java.util.Random;

public class mm {
	public static void main(String[] args) {  
		
		Random rand = new Random();
		for(int i=0;i<20;i++) 
			if(20>rand.nextInt()) System.out.println(1+2);
		//System.out.close();
		int v=1;
		while(v+1<10){
			v=v+2;
			System.out.println(v+"<-->");
			if(v+3>100){
				break;
			}
			
		}
		
	}
}

