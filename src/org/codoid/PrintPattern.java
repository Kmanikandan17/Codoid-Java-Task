package org.codoid;

public class PrintPattern {

	public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print(" * ");
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
