package lesson6;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// for (int i = 0; i < 3; i++) {
		// System.out.println("i = " + i);
		// for (int j = 0; j < 20; j++) {
		// if (j % 2 == 0) {
		// continue;
		// }
		// System.out.println("   j = " + j);
		// }
		// }

//		boolean t = true;
//
//		first: {
//			second: {
//				third: {
//					System.out.println("Before break");
//					if (t) {
//						break second;
//					}
//					System.out.println("We will never get to this code");
//				}
//				System.out.println("We will never get to this code");
//			}
//		}
//
//		outer: {
//			for (int i = 0; i < 3; i++) {
//				System.out.println("i = " + i);
//				inner: {
//					for (int j = 0; j < 100; j++) {
//						if (j == 4) {
//							break outer;
//						}
//						System.out.println("   j = " + j);
//					}
//				}
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter students mark(A, B, C, D, E available): ");
		String studentMark = sc.nextLine();
		
		double successReport = (double) checkStudentsMark(studentMark);
		finalVerdict(successReport);

	}

	private static void finalVerdict(double successReport) {
		switch(successReport){
		case 1:
			System.out.println("Final result: success");
			break;
		case 0:
			System.out.println("Final result: fail");
			break;
		default:
			System.out.println("Some error");
			break;
		}
	}

	private static int checkStudentsMark(String studentMark) {
		switch(studentMark){
			case "A":
				System.out.println("Great mark");
				return 1;
			case "B":
				System.out.println("Good mark");
				return 1;
			case "C":
				System.out.println("Normal mark");
				return 1;
			case "D":
			case "E":
				System.out.println("Very bad");
				return 0;
			default:
				System.out.println("Something is bad");
				return -1;
		}
	}

}
