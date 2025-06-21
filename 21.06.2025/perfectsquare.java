public class PerfectSquare {
    public static void main(String[] args) {
        int num = 49;
        boolean isPerfectSquare = false;

        for (int i = 1; i <= num/2; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare)
            System.out.println("Perfect Square");
        else
            System.out.println("Not a Perfect Square");
    }
}
