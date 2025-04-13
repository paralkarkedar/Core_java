package MegaDriveInterviewProgram;

public class MultiNumber {
    public static void main(String[] args) {
        int sum = sum(3, 3);
        System.out.println(sum);
    }

    public static int sum(int a, int b) {
        if (b == 0) {
            return a;
        }
        return sum(a ^ b, (a & b) << 1); // Use pre-decrement and pre-increment
    }
}