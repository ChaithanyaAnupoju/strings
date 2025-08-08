import java.util.Scanner;

public class thirdRanker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[4];
        int[] marks = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter marks of " + names[i] + ": ");
            marks[i] = scanner.nextInt();
            scanner.nextLine();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (marks[i] < marks[j]) {
                    int tempMark = marks[i];
                    marks[i] = marks[j];
                    marks[j] = tempMark;
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
        System.out.println("Third Ranker:");
        System.out.println("Name: " + names[2]);
        System.out.println("Marks: " + marks[2]);
    }
}
