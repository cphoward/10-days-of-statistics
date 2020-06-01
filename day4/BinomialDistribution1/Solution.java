package day4.BinomialDistribution1;

import java.io.*;
import java.util.*;

import java.math.BigDecimal;

public class Solution {

    public static void main(String[] args) {
        // Probability of a girl
        BigDecimal g = new BigDecimal("0.5215311004784688995215311004784688995215");
        BigDecimal b = new BigDecimal("0.4784688995215311004784688995215311004785");
        // Zero boys
        BigDecimal zero  = g.pow(6);
        BigDecimal one   = g.pow(5).multiply(b.pow(1)).multiply(new BigDecimal("6"));
        BigDecimal two   = g.pow(4).multiply(b.pow(2)).multiply(new BigDecimal("15"));
        BigDecimal three = g.pow(3).multiply(b.pow(3)).multiply(new BigDecimal("20"));
        // BigDecimal four  = g.pow(2).multiply(b.pow(4)).multiply(new BigDecimal("15"));
        // BigDecimal five  = g.pow(1).multiply(b.pow(5)).multiply(new BigDecimal("6"));
        // BigDecimal six   = b.pow(6);

        System.out.printf("%.3f", zero.add(one).add(two).add(three).doubleValue());
    }
}