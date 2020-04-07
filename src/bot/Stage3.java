package bot;
/*
* Description
At this stage, you will program the bot to count from 0 to any positive number you entered.

Here is an example of a dialogue with the new version of the bot. Input lines are started with ">" symbol.

Hello! My name is Aid.
I was created in 2018.
Please, remind me your name.
> Max​​​​​​​
What a great name you have, Max!
Let me guess your age.
Say me remainders of dividing your age by 3, 5 and 7.
> 1 2 1
Your age is 22; that's a good time to start programming!
Now I will prove to you that I can count to any number you want.
> 5
0!
1!
2!
3!
4!
5!
Completed, have a nice day!
Note, each number starts with a new line, and after a number, the bot should print the exclamation mark. Do not output any extra characters in these lines with numbers.*/

import java.util.Scanner;

public class Stage3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");
        // reading a name
        String name = scanner.nextLine();

        System.out.println("What a great name you have, "+name+"!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
// reading all remainders
        int rem3=scanner.nextInt();
        int rem5=scanner.nextInt();
        int rem7=scanner.nextInt();
        // calculate the age according to the formula given in description
        int age =(rem3*70+rem5*21+rem7*15)%105;
        System.out.println("Your age is "+age+"; that's a good time to start programming!");


    }
}
