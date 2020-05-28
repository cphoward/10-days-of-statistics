package day1.StandardDeviation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
  public static BigDecimal mean(final ArrayList<BigDecimal> elms) {
    BigDecimal sum = BigDecimal.valueOf(0);
    for (final BigDecimal elm : elms) {
      sum = sum.add(elm);
    }
    return sum.divide(BigDecimal.valueOf(elms.size()), 10, RoundingMode.CEILING);
  }

  public static void main(final String[] args) {
    final Scanner scan = new Scanner(System.in);
    final Integer n = Integer.valueOf(scan.nextInt());
    final ArrayList<BigDecimal> al = new ArrayList<>();
    for (Integer i = 0; i < n; i++) {
      al.add(BigDecimal.valueOf(scan.nextInt()));
    }
    scan.close();

    final BigDecimal mean = mean(al);
    BigDecimal sum = BigDecimal.valueOf(0);
    for (final BigDecimal elm : al) {
      final BigDecimal diff = elm.subtract(mean);
      sum = sum.add(diff.multiply(diff));
    }
    System.out.printf("%.1f", Math.sqrt(sum.doubleValue()/al.size()));
  }
}