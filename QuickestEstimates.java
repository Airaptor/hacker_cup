import java.util.Scanner;

public class QuickEstimate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, num;
        while (in.hasNextInt()){
            N = in.nextInt();
            if (N == 0){
                break;
            }else {
                for (int i = 0; i < N; i++) {
                    num = in.nextInt();
                    System.out.println(length(num));
                }
            }
        }
    }
    public static int length(int num) {
        int length = (int)(Math.log10(num)+1);
        return length;
   }
}
