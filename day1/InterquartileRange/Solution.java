package day1.InterquartileRange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
  public static float median(final ArrayList<Integer> al) {
    final int n = al.size();
    if (n % 2 == 1) {
        return al.get(n/2);
    } else {
        final int left = n/2-1;
        final int right = n/2;
        return (((float)al.get(left))+al.get(right))/2.0f;
    }
  }
  public static void main(final String[] args) {
    final Scanner scan = new Scanner(System.in);
    final ArrayList<Integer> elms = new ArrayList<>(50 * 1000);
    final Integer n = scan.nextInt();
    final Integer[] firsts = new Integer[50];
    final Integer[] seconds = new Integer[50];

    for (Integer i = 0; i < n; i++) {
      firsts[i] = scan.nextInt();
    }
    for (Integer i = 0; i < n; i++) {
      seconds[i] = scan.nextInt();
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < seconds[i]; j++) {
        elms.add(firsts[i]);
      }
    }

    Collections.sort(elms);

    final Integer arraySize = elms.size();
    if (elms.size() % 2 == 0) {
      float q1 = median(new ArrayList<>(elms.subList(0, arraySize/2)));
      float q3 = median(new ArrayList<>(elms.subList(arraySize/2, arraySize)));
      System.out.printf("%.1f", q3 - q1);
    } else {
      float q1 = median(new ArrayList<>(elms.subList(0, arraySize/2)));
      float q3 = median(new ArrayList<>(elms.subList(arraySize/2+1, arraySize)));
      System.out.printf("%.1f", q3 - q1);
    } // end if
    scan.close();
  }
}