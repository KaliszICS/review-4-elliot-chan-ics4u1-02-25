import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String sNum = scan.nextLine();
		sNum = "5" + sNum;
		int num = Integer.parseInt(sNum);
		num+=5;
		System.out.println(num);
		
	}

	public static void q2() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a number: ");
		String sNum = scan.nextLine();
		sNum = "4" + sNum + "3";
		double num = Double.parseDouble(sNum);
		num+=3.4;
		System.out.println(num);
		
	}

	public static void q3() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String sbool = scan.nextLine();
		boolean bool = Boolean.parseBoolean(sbool);
		bool = !bool;
		System.out.println(bool);
		
	}

	public static void q4() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String sNum = scan.nextLine();
		sNum+= "3";
		int num = Integer.parseInt(sNum);
		num+=2;
		char c = (char) num;
		System.out.println(c);
		
	}

	public static void q5() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String sNum = scan.nextLine();
		sNum = sNum +"1";
		int num = Integer.parseInt(sNum);
		num = num / 2;
		double d = (double) num;
		System.out.println(d);
		
	}

	public static void q6() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a number: ");
		String sNum = scan.nextLine();
		sNum =  "1" + sNum;
		double num = Double.parseDouble(sNum);
		System.out.println((int) num);
		
	}

}
