public class Main {
    public static int getSecondLastDigit(int number) {
        number = Math.abs(number); // Convert negative number to positive
        
        if (number < 10) {
            // If the number has only one digit, return 0
            return 0;
        } else {
            // Remove the last digit
            number /= 10;
            
            // Return the last remaining digit
            return number % 10;
        }
    }

