/**
*   name: Favour Musenga
*   SN: 19139116
*   decription: This program get an encryted digit has it input and decrypt it to the original
                value.
*/

import java.util.Scanner;

public class Decrypt{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[] encrypted = new int[4];
        int counter = 0;

        while(counter < encrypted.length){
            int temp;
            System.out.print("Enter a number between 0 and 9: ");
            temp = input.nextInt();

            if(temp > 9 || temp < 0){
                System.out.println("number must be between 0 and 9.");
                continue;
            }
            encrypted[counter] = temp;
            counter++;
        }

        int temp;
        temp = encrypted[0];
        encrypted[0] = encrypted[2];
        encrypted[2] = temp;

        temp = encrypted[1];
        encrypted[1] = encrypted[3];
        encrypted[3] = temp;

        for(counter = 0; counter < encrypted.length; counter++){
            int result = encrypted[counter] > 6 ? encrypted[counter] : encrypted[counter] + 10;
            encrypted[counter] = result - 7;
        } 

        System.out.print("\nDecrypted digit is ");
        for(int x : encrypted){
            System.out.print(x);
        }
    }
}