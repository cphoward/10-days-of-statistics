import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Double> elements = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            elements.add(scan.nextDouble());
        } // end for
        double denominator = 0;
        double numerator = 0;
        for (int i = 0; i < N; i++) {
            double weight = scan.nextDouble();
            denominator += weight;
            numerator += weight * elements.get(i);
        } // end for
        System.out.printf("%.1f", numerator/denominator);
    }
}
