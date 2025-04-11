import java.util.Scanner;
 class EmployeePaySlip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Basic Pay of the Employee: ");
        double basicPay = scanner.nextDouble();
        double da = basicPay * 0.50;
        double hra = basicPay * 0.14;
        System.out.print("Enter the Provident Fund (PF) deduction: ");
        double pf = scanner.nextDouble();
        double grossPay = basicPay + da + hra - pf;
        System.out.println("\nEmployee Pay Slip:");
        System.out.println("-------------------");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA (50% of Basic Pay): " + da);
        System.out.println("HRA (14% of Basic Pay): " + hra);
        System.out.println("Provident Fund (PF): " + pf);
        System.out.println("Gross Pay: " + grossPay);
        scanner.close();
    }
}
