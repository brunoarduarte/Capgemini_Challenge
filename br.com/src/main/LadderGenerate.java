package main;

public class LadderGenerate {
    public static void create(int args) {
        for (int i = 0; i < args; i++) {

            for (int s = args - 1; s > i; s--) {
                System.out.print(" ");
            }
            for (int a = 0; a <= i; a++)
                System.out.print("*");
            System.out.println();
        }
    }
}
