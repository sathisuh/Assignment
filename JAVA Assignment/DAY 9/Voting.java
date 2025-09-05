/*Write a Java program to manage a voting system where a person must be at least 18 years old
 to be eligible to vote. Use a custom exception to handle the scenario when an ineligible person
 tries to register for voting. Display appropriate messages for eligible and ineligible voters.
 */
class IneligibleVoterException extends Exception {
    public IneligibleVoterException(String message) {
        super(message);
    }
}

public class Voting {
    public static void checkEligibility(int age) throws IneligibleVoterException {
        if (age < 18) {
            throw new IneligibleVoterException("You must be at least 18 years old to vote.");
        }
        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) {
        try {
            checkEligibility(16);
        } catch (IneligibleVoterException e) {
            System.out.println("Voting Error: " + e.getMessage());
        }
    }
}