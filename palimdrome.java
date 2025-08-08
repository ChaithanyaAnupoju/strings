import java.util.Scanner;
public class palimdrome{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int original = sc.nextInt(), reversed = 0, temp = original;
while (temp != 0) {
int digit = temp % 10;
reversed = reversed * 10 + digit;
temp /= 10;
}
if (original == reversed) System.out.println(original + " is a palindrome.");
else System.out.println(original + " is not a palindrome.");
}
}
