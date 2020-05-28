package day1.Quartiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

  public static int median(final ArrayList<Integer> al) {
    final int n = al.size();
    if (n % 2 == 1) {
        return al.get(n/2);
    } else {
        final int left = n/2-1;
        final int right = n/2;
        return ((al.get(left))+al.get(right))/2;
    }
  }

  public static void main(final String[] args) {
    final Scanner scan = new Scanner(System.in);
    final int n = scan.nextInt();
    final ArrayList<Integer> al = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      al.add(scan.nextInt());
    }
    scan.close();
    Collections.sort(al);
    if (al.size() % 2 == 0) {
      System.out.println(median(new ArrayList<>((al.subList(0, n/2)))));
      System.out.println(median(al));
      System.out.println(median(new ArrayList<>(al.subList(n/2, n))));
    } else {
      System.out.println(median(new ArrayList<>((al.subList(0, n/2)))));
      System.out.println(median(al));
      System.out.println(median(new ArrayList<>(al.subList(n/2+1, n))));
    } // end if
  }
}