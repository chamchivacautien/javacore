/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2.lambda;

import java.util.stream.IntStream;

/**
 *
 * @author Long Nguyen
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }
    private static boolean isPrime(int number) {        
    return number > 1
            && IntStream.range(2, number).noneMatch(
                    index -> number % index == 0);
}
}
