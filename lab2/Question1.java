/**
*   name: Favour Musenga
*   SN: 19139116
*
*/

import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

public class Question1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String firstName, lastName; 
        int day, month, year;

        System.out.print("Enter your first Name: ");
        firstName = input.nextLine();
        
        System.out.print("Enter your last Name: ");
        lastName = input.nextLine();
        
        System.out.print("Enter day of the month of birthday: ");
        day = input.nextInt();
        
        System.out.print("Enter month of birthday: ");
        month = input.nextInt();
        
        System.out.print("Enter year of birthday: ");
        year = input.nextInt();

        HeartRates heartRates = new HeartRates(firstName, lastName, day, month, year);

        System.out.println();
        System.out.println("Your age is " + heartRates.getAge());
        System.out.println("Maximum heart rate is " + heartRates.getMaximumHeartRate());
        System.out.printf("target heart rate is %.2f ", heartRates.getTargetHeartRate());
    }
}

class HeartRates{
    private String firstName;
    private String lastName;
    private DayOfBirth dayOfBirth;
    
    HeartRates(String firstNameValue, String lastNameValue, int dayValue, int monthValue, int yearValue){
        firstName = firstNameValue;
        lastName = lastNameValue;
        dayOfBirth = new DayOfBirth(dayValue, monthValue, yearValue);
    }

     /*
    * This method calculates years of a person 
    */
    public int getAge(){
        
        LocalDate dateOfBirth = LocalDate.of(dayOfBirth.getYear(), dayOfBirth.getMonth(), dayOfBirth.getDay());
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstNameValue){
        firstName = firstNameValue;
    }


    public String getLastName(){
        return lastName;
    } 
    
    public void setLastName(String lastNameValue){
        lastName = lastNameValue;
    }

    public int getMaximumHeartRate(){
        int age = getAge();
        return 220 - age;
    }
    public double getTargetHeartRate(){
        int maximumHeartRate = getMaximumHeartRate();
        return 0.85 * maximumHeartRate;
    }
    
}
/**
*   The class is used to store the attributes of the date
*   of birth.
*/
class DayOfBirth{
    private int day;
    private int month;
    private int year;

    DayOfBirth(int dayValue, int monthValue,int yearValue){
        day = dayValue;
        month = monthValue;
        year = yearValue;
    }

    public int getDay(){
        return day;
    } 
    
    public void setDay(int dayValue){
        day = dayValue;
    }

   public int getYear(){
        return year;
    } 
    
    public void setYear(int yearValue){
        year = yearValue;
    }

    public int getMonth(){
        return month;
    } 
    
    public void setMonth(int monthValue){
        month = monthValue;
    }
   

}