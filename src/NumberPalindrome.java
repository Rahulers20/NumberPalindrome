public class NumberPalindrome {




    public static boolean isPalindrome(int number) {

        int reverse = 0;

        if(number < 0) {
            number *= (-1);
        }

        int originalNumber = number;


        while(number > 0) {

            int lastDigit = 0;

            lastDigit = number % 10;

            reverse = (reverse * 10) + lastDigit;

            number /= 10;
        }


        if(reverse == originalNumber) {
            return true;
        } else return false;
    }
}
