package com.aakash.dsa.aoa;

public class AnalysisOfBasicLoop {
    public static void main(String[] args) {

        // Ceiling
        // Floor
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.floor(3.99));

//        constantLoop(11);
//        constantIncrement(11);
//        constantDecrement(10);
//        constantProduct(20);
        constantPower(1_000_000);
//        multipleLoops(10);
//        nestedLoops(100);
//        mixedLoops(10);

    }

    public static void constantLoop(int n){ // O(1) ==> constant
        int constant = 5;
        for (int i = 0; i < constant; i++) {
            System.out.println("constantLoop"); // constant work/computation: not dependent on input n
        }

        /**
         *  n : User input
         */
    }

    public static void constantIncrement(int n){ // O(n)
        int constant = 2;
        int k = 0;
        for (int i = 0; i < n; i = i + constant) { // i = i + constant
            System.out.println("constantIncrement : " + k++); // constant work/computation: not dependent on input n
        }

        /**
         *  n : User input
         *  c : constant
         *   n
         *  loop runs ceil(n/c) times ==> O(n)
         */
    }

    public static void constantDecrement(int n){ // O(n)
        int constant = 3;
        for (int i = n; i >= 0; i -= constant) {
            System.out.println("constantDecrement");  //constant work/computation:  not dependent on input n
        }

        /**
         *  n : User input
         *  c : constant
         *
         *  loop runs ceil(n/c) times ==> O(n)
         */
    }


    public static void constantProduct(int n){
        int constant = 2;
        int k = 0;
        for (int i = 1; i <= n; i = i * constant) {
            System.out.println("constantProduct : " + ++k); //constant work/computation:  not dependent on input n
        }

        /**
         *  n : user input
         *  c : constant
         *  loop runs ceil(log(n)) times ==> O(log(n))
         *
         *  c^0, c^1, c^2, ....c^k-1
         *  If the loop run k times, then it will run from c^0 to c^k-1
         *  What the loop to k time :
         *  c^k-1 < n
         *  ==> k < log[c](n) + 1 (Taking log on both sides)
         *  ==> time complexity : O(log(n))
         */
    }

    public static void constantDivison(int n){
        int constant = 2;
        for (int i = n; i >= 1; i = i / constant) {
            System.out.println("constantProduct"); //constant work/computation:  not dependent on input n
        }

        /**
         *  n : user input
         *  c : constant
         *  loop runs floor(log[c](n)) times ==> O(log[c](n))
         *
         *  n/c^0, n/c^1, n/c^2, ....n/c^k-1
         *  If the loop run k times, then it will run from c^0 to c^k-1
         *  What the loop to k time :
         *  n/c^k-1 > 1
         *  ==> c^k-1 < n
         *  ==> k < log[c](n) + 1 (Taking log on both sides)
         *  ==> time complexity : O(log[c](n))
         */
    }

    public static void constantPower(int n){
        int constant = 2;
        int k = 0;
        for (int i = 2; i < n ; i = (int) Math.pow(i, constant)) {
            System.out.println("constantPower : " + ++k); //constant work/computation:  not dependent on input n
        }

        /**
         * n : user input
         * c : constant
         *
         * 2^1, 2^c, (2^c)^c ..... ((2^c)^c)^c...
         * If this loop runs k times
         * 2^c^0, 2^c^1, 2^c^2 .... 2^c^(k-1)
         * ==> 2^c^(k-1) < n
         * ==> c^(k - 1) < log[2](n)
         * ==> k - 1 < log[c]log[2](n)
         * ==> k < log[c]log[2](n) + 1
         * ==> O(log[c]log[2](n))
         * ==> O(loglog(n))// In Asymptotic complexity analysis base of the log doesn't matter, and we can drop the base
         */
    }

    public static void multipleLoops(int n){
        // search in array log(n) < n < n * log(n)
        // sort first ==> O(nlogn)
        // binary search ==> O(logn)
        // O(n*log(n)) + O(log(n)) ==> O(n * log(n))
        for (int i = 0; i < n; i++) { // O(n)
            System.out.println("constant1"); //constant work/computation:  not dependent on input n
        }

        for (int i = 1; i < n; i = i * 2) {  // O(log(n))
            System.out.println("constant1"); //constant work/computation:  not dependent on input n
        }

        for (int i = 0; i < 100; i++) { // O(1)
            System.out.println("constant3");  //constant work/computation:  not dependent on input n
        }

        // When we have loops one after the other we add them, so for above
        // ==> O(n) + O(log(n)) + O(1)
        // Ignore the lower order terms will give us the time complexity as
        // ==> O(n)
    }


    public static void nestedLoops(int n){
        for (int i = 0; i < n; i++) {               // O(n)
            for (int j = 1; j < n; j = j * 2) {     // O(log(n))
                System.out.println("nestedLoops");
            }
        }

        // When we have nested loops one inside the other we multiply them, so for above
        // ==> O(n) * O(log(n))
        // Ignore the lower order if any terms will give us the time complexity as
        // ==> O(n* log(n))
    }

    public static void mixedLoops(int n){
        // Overall complexity : O(n*log(n))
        for (int i = 0; i < n; i++) {                    // O(n)
            for (int j = 1; j < n; j = j * 2) {          // O(log(n))
                System.out.println("constant1");
            }
        }

        // Overall complexity : O(n^2)
        for (int i = 0; i < n; i++) {                    // O(n)
            for (int j = 0; j < n; j++) {                // O(n)
                System.out.println("constant");
            }
        }

        // Using addition for above two
        // O(n2) + O(n*log(n))
        // ==> O(n2)
    }

    public static void differentInputs(int n, int m){
        // Overall time complexity : O(n*log(m))
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j = j * 2) {
                System.out.println("constant1");
            }
        }

        // Overall time complexity : O(m^2)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("constant2");
            }
        }

        // We can calculate the overall time complexity as
        // We can take the expression inside big-oh or Theta notation
        // O(n*log(m) + m^2)

        // Real world examples are :
        // Graph algorithms : O(e + v), where e is edges and v is vertices
        // Merging of arrays of two different size : O(m + n)
    }




}
