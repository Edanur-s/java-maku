
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edaza
 */
public class Ornek_7_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Diziler ksç elemanlı olmalı?");
        n = input.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        System.out.println("A dizisinin elemanlarını girin");
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
            System.out.println("A(" + i + ")=" + A[i]);
        }
        System.out.println(Arrays.toString(A));
        System.out.println("-----------------");

        System.out.println("B dizisinin elemanlarını girin");
        for (int i = 0; i < B.length; i++) {
            B[i] = input.nextInt();
            System.out.println("B(" + i + ")=" + B[i]);
        }
        System.out.println(Arrays.toString(B));
        int skalercarpim = 0;
        for (int i = 0; i < n; i++) {
            skalercarpim += A[i] * B[i];
        }
        System.out.println("Skaller çarpım= " + skalercarpim);
    }
    
}
