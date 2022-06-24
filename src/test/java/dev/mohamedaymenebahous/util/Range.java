package dev.mohamedaymenebahous.util;

public class Range {

    //produces sequence of n
    public static int[] sequence(int n) {
        int[] returnResult = new int[n];
        for(int i = 0; i < n; i++) {
            returnResult[i] = i;
        }
        return returnResult;
    }

    //produces sequence 'from' start to 'end'
    public static int[] sequence(int start, int end) {
        int size = end - start;
        int[] returnResult = new int[size];
        for(int i = 0; i < size; i++) {
            returnResult[i] = start++;
        }
        return returnResult;
    }

    //produces sequence 'from' start to 'end' incrementing by a step
    public static int[] sequence(int start, int end, int step) {
        int size = end - start;
        int[] returnResult = new int[size];
        for(int i = 0; i < size; i++) {
            returnResult[i] = start + (i * step);
        }
        return returnResult;
    }

}
