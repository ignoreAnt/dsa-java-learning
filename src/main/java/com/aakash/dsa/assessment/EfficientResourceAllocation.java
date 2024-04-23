package com.aakash.dsa.assessment;

import java.util.ArrayList;
import java.util.List;

public class EfficientResourceAllocation {

    public static void main(String[] args) {
        // Sample Inputs
        int[] buyers = {60, 36, 48};
        int[] sellers = {20, 40, 90};

        // Process the resource matching and allocation
        processResourceAllocation(buyers, sellers);
    }
    private static void processResourceAllocation(int[] buyers, int[] sellers) {
        // Match buyers and sellers and calculate GCD
        List<Transaction> transactions = new ArrayList<>();
        for (int buyer : buyers) {
            for (int seller : sellers) {
                int gcd = findGCD(buyer, seller);
                if (gcd > 1) {  // Only consider transactions where resources are divisible
                    transactions.add(new Transaction(buyer, seller, gcd));
                }
            }
        }

        // Calculate and print the transaction details
        for (Transaction t : transactions) {
            System.out.println("Buyer demands: " + t.buyerDemand + ", Seller supplies: " + t.sellerSupply
                    + ", GCD: " + t.gcd);
        }

        // Compute statistical summary
        int totalTransactions = transactions.size();
        double averageGCD = transactions.stream().mapToInt(t -> t.gcd).average().orElse(0.0);
        int trailingZeros = countTrailingZeros(factorial(totalTransactions));

        System.out.println("Total transactions: " + totalTransactions);
        System.out.println("Average GCD: " + averageGCD);
        System.out.println("Trailing zeros in factorial of transactions: " + trailingZeros);
    }

    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int countTrailingZeros(long n) {
        int count = 0;
        while (n % 10 == 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static class Transaction {
        int buyerDemand;
        int sellerSupply;
        int gcd;

        Transaction(int buyerDemand, int sellerSupply, int gcd) {
            this.buyerDemand = buyerDemand;
            this.sellerSupply = sellerSupply;
            this.gcd = gcd;
        }
    }
}
