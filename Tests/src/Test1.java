import java.util.Scanner;

public class Test1 {

	public static void main (String[]args) {
		
		String s = eingabe();
		int richtig = a(s);
			if (richtig == 1) {
				richtig = b(s);
				if(richtig == 1) {
					richtig = c(s);
					if (richtig == 1) {
						richtig = d(s);
						if (richtig == 1) {
							richtig = e(s);
							if(richtig == 1) {
								richtig = f(s);
							}
						}
					}
				}
			}
			ausgabe(richtig);
	}

	

	private static void ausgabe(int richtig) {
		if (richtig == 1) {
			System.out.println("Das Passwort ist Gültig");
		}else System.out.println("Das Passwort ist Ungültig");
		
	}



	private static int f(String s) {
		int richtig;
		char a = s.charAt(0);
		char b = s.charAt(1);
		char c = s.charAt(2);
		char d = s.charAt(3);
		char e = s.charAt(4);
		int f = a;
		int g = b;
		int h = c;
		int i = d;
		int j = e;
		if (f <= 90 && f >= 65 || f <= 122 && f >= 97) {
			richtig = 1;
			if(g <= 90 && g >= 65 || g <= 122 && g >= 97) {
				richtig = 1;
				if(h <= 90 && h >= 65 || h <= 122 && h >= 97) {
					richtig = 1;
					if(i <= 90 && i >= 65 || i <= 122 && i >= 97) {
						richtig = 1;
						if(j <= 90 && j >= 65 || j <= 122 && j >= 97) {
							richtig = 1;
						}else richtig = 2;
					}else richtig = 2;
				}else richtig = 2;
			}else richtig = 2;
		}else richtig = 2;
		return richtig;
	}



	private static int e(String s) {
		char a = s.charAt(4);
		int b = a;
		b = b+1;
		if (b == 90) {
			return 1;
		}else return 2;	
	}



	private static int d(String s) {
		String a = s.substring(s.length()-3);
		int f = Integer.parseInt(a);
		if (f < 599 && f > 100) {
			return 1;
		}else return 2;
		
	}



	private static int c(String s) {
//		int h = 0;
//		char d = ' ';
//		for (int i=0;i<s.length();i++) {
//			
//			if (s.charAt(i) == d) {
//				h = 2;
//			}else h = 1;
//			int a = d;
//		if(a == 32) {
//			h =2;
//		}else h = 1;
//		}
		
//		return h;
		
		if (s.contains(" ")) return 2;
		return 1;
	}



	private static int b(String s) {
		int richtig;
		char a = s.charAt(s.length()-3);
		char b = s.charAt(s.length()-2);
		char c = s.charAt(s.length()-1);
		int d = a;
		int e = b;
		int f = c;
		if (d >= 49 && d <= 57) {
			
			if (e >= 49 && e <= 57) {
				
				if (f >= 49 && f <= 57) {
					richtig = 1;
				}else richtig = 2;
			}else richtig = 2;
		}else richtig = 2;
		return richtig;
	}





	private static int a(String s) {
		if (s.length() >= 8) {
			return 1;
		}else return 2;
		
	}
	 private static String eingabe() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gebe ein passwort ein");
		String s = sc.next();
		return s;
	}
	
}
