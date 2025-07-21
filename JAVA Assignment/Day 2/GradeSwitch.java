public class GradeSwitch {
    public static void main(String[] args) {
        int percent = 78;
        switch (percent / 10) {

            case 7:
                System.out.println("Grade A");
                break;
            case 6:
                System.out.println("Grade B");
                break;
            case 5:
            case 4:
                System.out.println("Grade C");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
