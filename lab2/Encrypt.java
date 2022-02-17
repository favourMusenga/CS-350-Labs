/**
*   name: Favour Musenga
*   SN: 19139116
*   decription: This program encrypt a four digit input.
*/

import java.util.Scanner;

public class Encrypt{
    public static void main(String[] args){
        int[] digit = new int[4];
        int counter = 0;
        Scanner input = new Scanner(System.in);

        while(counter < digit.length){
            int temp; // This is used to temporary the input
            System.out.print("Enter a number between 0 and 9: ");
            temp = input.nextInt();

            if(temp > 9 || temp < 0){
                System.out.println("number must be between 0 and 9.");
                continue;
            }
            digit[counter] = temp;
            counter++;
        }
        for(counter = 0; counter < digit.length; counter++){
            digit[counter] = (digit[counter] + 7) % 10;
        }

                
        int temp;
        
        // The next section is used to swap values of the index
        
        temp = digit[0];
        digit[0] = digit[2];
        digit[2] = temp;

        temp = digit[1];
        digit[1] = digit[3];
        digit[3] = temp;

        System.out.print("\nEncrypted digit is ");
        for(int x : digit){
            System.out.print(x);
        }   
    }
}