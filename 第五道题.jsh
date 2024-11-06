public void display(int n) {
        String numberStr = Integer.toString(n);
        int numDigits = numberStr.length();

        for (int line = 1; line <= 5; line++) {
            StringBuilder row = new StringBuilder();
            for (int i = 0; i < numDigits; i++) {
                int digit = numberStr.charAt(i) - '0'; // Convert char to int
                row.append(ssd(digit, line));
            }
            System.out.println(row.toString());
        }
    }
    public static void main(String[] args) {
        SevenSegmentDisplay ssd = new SevenSegmentDisplay();
        ssd.display(28); // Example usage
    }
}

public class AverageGrades {

    public static int[] average_grades(int grades[][], int weights[]) {
        int numStudents = grades.length;
        int numComponents = grades[0].length;

        int[] averageGrades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            int weightedTotal = 0;
            for (int j = 0; j < numComponents; j++) {
                weightedTotal += grades[i][j] * weights[j];
            }

            averageGrades[i] = weightedTotal / 100;
        }

        return averageGrades;
    }
    public static void main(String[] args) {
        int[][] grades = {
                {51, 83, 28},
                {0, 38, 95}
        };
        int[] weights = {30, 40, 30};

        int[] averages = average_grades(grades, weights);
        System.out.println("Alice's weighted average grade: " + averages[0]);
        System.out.println("Bob's weighted average grade: " + averages[1]);
    }
}

