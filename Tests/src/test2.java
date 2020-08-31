import java.util.Random;

public class test2 {

	public static void main(String[] args) {
		int [] zahlen2 = new int [7];
		Random rd = new Random();
		for (int i = 0; i < zahlen2.length; i++) {
			zahlen2[i] = rd.nextInt(6)+1 ;
			for (int j = 0; j < zahlen2.length; j++) {
				if (zahlen2[j] == zahlen2[i]) {
					zahlen2[i] = rd.nextInt(6)+1;
					
				}
			}
		}
		
		int tmp;
		for (int i = 1; i < zahlen2.length; i++) {
			for (int j = 0; j < zahlen2.length - i; j++) {
				if(zahlen2[j] > zahlen2[j +1]) {
				tmp = zahlen2[j];
				zahlen2[j] = zahlen2[j+1];
				zahlen2[j+1] = tmp;
				}
			}
	
		}
		for (int k = 0; k < zahlen2.length; k++) {
			System.out.print(zahlen2[k] + "   ");
		}
		System.out.println(" ");
		}
	}