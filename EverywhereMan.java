import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class EverywhereMan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            ArrayList<String> allCities = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                allCities.add(in.next());
            }
            ArrayList<String> cityArray = new ArrayList<>(allCities);
            HashSet hs = new HashSet();
            hs.addAll(cityArray);
            cityArray.clear();
            cityArray.addAll(hs);
            System.out.println(cityArray.size());
        }
    }
}
