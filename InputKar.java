import java.util.Scanner;

public class InputKar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] payroll = new String[5][4];
        int jml = 0;


        System.out.println("==============WELCOME TO PAYROLL================");

        System.out.print("Masukan jumlah karyawan: ");
        jml = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < jml; i++) {
            System.out.print("Masukan nama: ");
            String name = sc.nextLine();
            System.out.print("Nomor ID: ");
            String id = sc.nextLine();
            System.out.print("Gaji:  ");
            String salary = sc.nextLine();
            System.out.print("Jabatan:  ");
            String department = sc.nextLine();

            payroll[i][0] = name;
            payroll[i][1] = id;
            payroll[i][2] = salary;
            payroll[i][3] = department;
        }

        System.out.println("");
        System.out.println("Payroll Data:");
        for (int i = 0; i < jml; i++) {
            System.out.println("Employee Name: " + payroll[i][0]);
            System.out.println("Employee ID: " + payroll[i][1]);
            System.out.println("Employee Salary: " + payroll[i][2]);
            System.out.println("Employee Department: " + payroll[i][3]);
            System.out.println("");
        }
    }
}