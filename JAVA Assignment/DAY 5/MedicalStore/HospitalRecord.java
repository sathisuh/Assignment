/*Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
        --- recordId, patientName, dateOfVisit, and diagnosis.
        --- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.

Create a subclass InPatientRecord that extends MedicalRecord and adds:
        --- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.

Create another subclass OutPatientRecord that extends MedicalRecord and adds:
        --- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed.*/

package MedicalStore;
import java.util.Scanner;
public class HospitalRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. In-Patient Record");
        System.out.println("2. Out-Patient Record");
        System.out.print("Choose record type: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            PatientIn inPatient = new PatientIn();
            inPatient.inputInPatientDetails();
            System.out.println("\n--- In-Patient Record ---");
            inPatient.displayRecord();
        } else if (choice == 2) {
            PatientOut outPatient = new PatientOut();
            outPatient.inputOutPatientDetails();
            System.out.println("\n--- Out-Patient Record ---");
            outPatient.displayRecord();
        } else {
            System.out.println("Invalid choice!");
        }
    }
}