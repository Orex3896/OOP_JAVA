package BlackList;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();//страниц
        int t = scanner.nextInt();//страниц в день
         // int k = scanner.nextInt();
//        int n = scanner.nextInt();
        int kids = t/x;
        int eva = t%x;
        System.out.println(kids+ " " +eva);



}}
