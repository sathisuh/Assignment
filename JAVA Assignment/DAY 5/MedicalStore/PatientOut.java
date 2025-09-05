package MedicalStore;
import java.util.Scanner;

class PatientOut extends MedicalRecord {
    private String doctorName;
    private double consultationFee;

    public void inputOutPatientDetails() {
        inputRecordDetails();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Doctor Name: ");
        doctorName = sc.nextLine();
        System.out.print("Enter Consultation Fee: ");
        consultationFee = sc.nextDouble();
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Consultation Fee: " + consultationFee);
    }
}