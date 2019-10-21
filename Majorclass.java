import java.util.Scanner;

public class MajorStatus {
	public static void main(String[] args) {
	String majorSta;
	char major, status;

	System.out.printf(“Enter two characters: “);
	Scanner scan = new Scanner(System.in);

	majorSta = scan.nextLine();

	major = majorSta.charAt(0);
	status = majorSta.charAt(1);

	if((major == ‘M’ || major == ‘C’ || major == ‘I’)) && (status >= ‘1’ && status <== ‘4’))
		switch(major) {
			case ‘M’:
				majorStr = “Mathematics”;
				break;
			case ‘C’:
				majorStr = “Computer Science”;
				break;
			case ‘I’:
				majorStr = “Information Technology”;
				break;
		}
		switch(status) {
			case ‘1’:
				statusStr = “Freshman”;
				break;
			case ‘2’:
				statusStr = “Sophomore”;
				break;
			case ‘3’:
				statusStr = “Junior”;
				break;
			case ‘4’:
				statusStr = “Senior”;
				break;
		}
	System.out.printf(“%s %s\n”, majorStr, statusStr);
	}
	else {
		System.out.println(“Invalid input!”);
}

