

package MedicalStore;
import java.util.Scanner;

class MedicalRecord {
    protected String recordId;
    protected String patientName;
    protected String dateOfVisit;
    protected String diagnosis;

    public void inputRecordDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Record ID: ");
        recordId = sc.nextLine();
        System.out.print("Enter Patient Name: ");
        patientName = sc.nextLine();
        System.out.print("Enter Date of Visit (dd-mm-yyyy): ");
        dateOfVisit = sc.nextLine();
        System.out.print("Enter Diagnosis: ");
        diagnosis = sc.nextLine();
    }

    public void displayRecord() {
        System.out.println("Record ID: " + recordId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Date of Visit: " + dateOfVisit);
        System.out.println("Diagnosis: " + diagnosis);
    }
}