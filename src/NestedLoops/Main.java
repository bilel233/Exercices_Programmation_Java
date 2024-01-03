package NestedLoops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int colums;
        String symbol = "";

        System.out.println("Enter a rows : ");
        rows = scanner.nextInt();
        System.out.println("Enter a columns : ");
        colums = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Symbol to use : ");
        symbol = scanner.nextLine();

        for(int i=1;i<=rows;i++)
        {
            System.out.println();
            for(int j = 1;j <=colums;j++)
            {
                System.out.println(symbol);
            }
        }

    }
}
