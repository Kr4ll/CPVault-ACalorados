	import java.util.Scanner;
	
	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String num1, num2;
			int sol = 0, acc = 0, diff;
			char[] trimNum1, trimNum2;
			while (true){
				num1 = sc.next();
				num2 = sc.next();
				sc.nextLine();
				if (num1.equals("0") && num2.equals("0"))
					break;
				trimNum1 = num1.toCharArray();
				trimNum2 = num2.toCharArray();
				int length = Math.min(trimNum1.length, trimNum2.length);
				for(int i = length - 1; i >= 0; i--){
					if (((trimNum2[trimNum2.length > trimNum1.length ? i + 1 : i] - '0') +
							(trimNum1[trimNum1.length > trimNum2.length ? i + 1 : i] - '0') + acc) >= 10) {
						acc = 1;
						sol++;
					} else
						acc = 0;
				}
				// Checking remaining at the end
				diff = Math.abs(trimNum1.length - trimNum2.length);
				for(int i = diff - 1; i >= 0; i--){
					if (((trimNum1.length > trimNum2.length ? trimNum1[i] - '0' : trimNum2[i] - '0') + acc) >= 10) {
						acc = 1;
						sol++;
					} else
						break;
				}
				System.out.println(sol);
				sol = 0;
				acc = 0;
			}
			sc.close();
		}
	}
