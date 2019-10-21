package udemy.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // System.out.println(isEvenNumber(5));

        int number = 4;
        int finishNumber = 20;
        java.lang.String answer = "These are the first five even numbers found: " ;
        int count = 0;

        while (number <= finishNumber) {
             if (isEvenNumber(number)) {
                 answer += number + " ";
                 count++;
                 if (count >= 5) {
                     System.out.println(answer);
                     break;
                 }
             }
             number++;
        }

    }

    public static boolean isEvenNumber (int number) {
        return number % 2 == 0;

    }
}
