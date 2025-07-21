public class StudentMarks {
    public static void main(String[] args) {
        int[][] marks = {
                {75, 80, 70}, {60, 65, 70}, {90, 88, 85},
                {50, 45, 55}, {80, 85, 90}, {78, 74, 76},
                {67, 72, 69}, {88, 91, 85}, {70, 68, 66}, {55, 60, 58}
        };
        int[] roll = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};

        System.out.println("Roll\tTotal\tAverage");
        for (int i = 0; i < 10; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            float avg = total / 3.0f;
            System.out.println(roll[i] + "\t" + total + "\t" + avg);
        }
    }
}
