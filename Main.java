import java.util.Scanner;



public class Main {
    public static void main(String[] args) {


//1. Develop a program that takes the weight (in kilograms) and height (in meters) as input and calculates the BMI, then prints it.        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

float weight;
float height;


Scanner input = new Scanner(System.in);
System.out.print("Enter weight in kg: ");
weight = input.nextFloat();
System.out.print("Enter height in inches: ");
height = input.nextFloat();
        System.out.println("your BMI is :"+(weight/(height*height)));



   //2. Write a program that takes the obtained marks and total marks as input and calculates the percentage, then prints it.
/*
        float obtained_marks;
        float total_marks;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the obtained marks: ");
        obtained_marks = scanner.nextFloat();
        System.out.print("Enter the total marks: ");
        total_marks = scanner.nextFloat();
        System.out.println("the percentage is:"+(obtained_marks*100)/total_marks);

 */
        //3. Create a program that takes an amount in one currency and an exchange rate as input, then converts and prints the amount in another currency.

       /* float amount_usd;
        float exchange_rate;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in USD: ");
        amount_usd = input.nextFloat();
        System.out.print("Enter the exchange rate in EUR: ");
        exchange_rate = input.nextFloat();

        System.out.println("Amount in EUR: " + (amount_usd * exchange_rate));


        */

        //4. Create a program that takes a string as input, calculates its length, and then reverses the string using the StringBuilder class, finally printing both the length and reversed string.
/*
        String sentence ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        sentence = scanner.nextLine();
        StringBuilder StringBuilder= new StringBuilder(sentence);
        String reversedSentence = StringBuilder.reverse().toString();
        System.out.println("length of the sentence: " + sentence.length()+" "+"And Reversed string:"+reversedSentence);

 */

//5. Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring.
/*
        String Sentence;
        int start_index ;
        int end_index ;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        Sentence = scanner.nextLine();
        System.out.println("Enter start index: ");
        start_index = scanner.nextInt();
        System.out.println("Enter end index: ");
        end_index = scanner.nextInt();
        System.out.println("the output is:"+Sentence.substring(start_index,end_index));

*/
        //6. Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the sentence and prints the result.
       /* String sentence;
        String Keyword;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        sentence = scanner.nextLine();
        System.out.print("Enter the keyword: ");
        Keyword = scanner.nextLine();
        String result= sentence.contains( Keyword ) ? "Keyword"+" "+ Keyword+" is present in the sentence" : "Keyword"+" "+ Keyword+ " is not present in the sentence";
        System.out.println(result);

        */
        //7. Develop a program that takes a sentence and a word to replace as input, then replace all occurrences of the word with another word and prints the modified sentence.
/*
        String sentence;
        String replece_word;
        String replacement_word;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        sentence = scanner.nextLine();
        System.out.print("Enter the word: ");
        replece_word = scanner.nextLine();
        System.out.print("Enter the replacement word: ");
        replacement_word = scanner.nextLine();
        String new_sentence = sentence.replace(replece_word, replacement_word);
        System.out.println(new_sentence);


 */
        //8. Write a program that takes two strings as input and check if they are equal, ignoring the case, then prints whether they are equal or not.
       /* String word1;
        String word2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word1: ");
        word1 = scanner.nextLine();
        System.out.print("Enter word2: ");
        word2 = scanner.nextLine();
        String answer=word1.equalsIgnoreCase(word2)?"Strings are equal":"Strings are not equal";
        System.out.println(answer);

        */

    }
}