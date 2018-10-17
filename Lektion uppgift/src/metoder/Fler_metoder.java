package metoder;

import java.util.Scanner;

public class Fler_metoder {
	
	public static void main(String[] args) {
		//System.out.println(volume());
		//System.out.println(reverse());
		//System.out.println(count());
		//System.out.println(Sjorovare());
		
	}
	
	public static double volume() {
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		double volume = (4 * 3.14159265359) * (radius * radius * radius) / 3;
		return volume;
	}
	
	public static String reverse() {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int length = str.length();
		for (int i = length - 1; 0 <= i; i--) {
			System.out.println(str.charAt(i));
		}
		return str;
	
	}
	public static int count() {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		char c = input.next().charAt(0);
		int cs = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == c) {
				cs++;
			}
		}
		return cs;
		
	
		
	}
	public static String Sjorovare() {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String sjo = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			if(c == 'x') {
				c = 's';
				sjo += "k" + "o" + "k"; 
			}
			if(c == 'b' || c == 'c' || c == 'd' || c == 'f' || c == 'g' || c == 'h' || c =='l' || c == 'm' || c == 'n' || c == 'p' || c =='q' || c == 'w' || c == 'r' || c == 's' || c == 't' || c == 'j' || c == 'k' || c == 'z' || c == 'v') {
				sjo += c + "o" + c;
			}
			else {
				sjo += c;
			}
			
			
			
		}
		return sjo;
		   
		
	}
	}


