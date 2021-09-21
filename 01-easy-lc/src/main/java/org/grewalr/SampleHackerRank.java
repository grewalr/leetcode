package org.grewalr;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class SampleHackerRank {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        HashSet<Integer> colourSet = new HashSet<>();

        int numPairs = 0;

        for (int sock : ar) {
            if (!colourSet.add(sock)) {
                numPairs++;
                colourSet.remove(sock);
            }
        }

        return numPairs;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(1);
        array.add(3);
        array.add(1);
        array.add(2);
        array.add(1);
        array.add(3);
        array.add(3);
        array.add(3);
        array.add(3);

        int result = sockMerchant(array.size(), array);

        System.out.println(result);

    }
}

