package day4.BinomialDistribution2;

public class Solution {

    public static void main(String[] args) {
        final double bad  = 0.12f;
        final double good = 1f - bad;

        final double zeroRejects = Math.pow(good, 10);
        final double oneReject = /* 10C1 = 10 */ 10d*Math.pow(good, 9)*Math.pow(bad, 1);
        final double twoRejects = /* 10C2 = 45 */ 45d*Math.pow(good, 8)*Math.pow(bad, 2);
        
        System.out.printf("%.3f\n", zeroRejects+oneReject+twoRejects);
        System.out.printf("%.3f\n", 1-(zeroRejects+oneReject));
    }
}