package MedicalStore;
import java.util.Scanner;
class PatientIn extends MedicalRecord {
    private int roomNumber;
    private int numberOfDaysAdmitted;
    private double roomCharges;

    public void inputInPatientDetails() {
        inputRecordDetails();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Room Number: ");
        roomNumber = sc.nextInt();
        System.out.print("Enter Number of Days Admitted: ");
        numberOfDaysAdmitted = sc.nextInt();
        System.out.print("Enter Room Charges per Day: ");
        roomCharges = sc.nextDouble();
    }

    public double calculateTotalCharges() {
        return numberOfDaysAdmitted * roomCharges;
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Number of Days Admitted: " + numberOfDaysAdmitted);
        System.out.println("Room Charges per Day: " + roomCharges);
        System.out.println("Total Charges: " + calculateTotalCharges());
    }
}