import java.util.Random;

class GradingKnightsChallenge {
    public static void main(String[] args) {
        Random random = new Random();
        int score = random.nextInt(100);
        System.out.println("Generated Score: " + score);

        String grade;
        String message;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        switch (grade) {
            case "A":
                message = "Excellent work!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good effort!";
                break;
            case "D":
                message = "Needs improvement.";
                break;
            case "F":
                message = "Failed. Better luck next time!";
                break;
            default:
                message = "Unknown grade.";
                break;
        }
        System.out.println("You've earned a " + grade + "! " + message);
    }
}
