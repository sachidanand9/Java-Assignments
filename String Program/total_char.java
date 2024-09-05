// Java Program to count the total number of characters in a string

import java.util.Scanner;

public class total_char{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write something and read number of character present");
        String str = sc.nextLine();
        int count = 0;// yo count the number of charater present in string

        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)!=' ')
            count++;
        }

        System.out.println("Total Number of character in a string :"+count);
    }
}