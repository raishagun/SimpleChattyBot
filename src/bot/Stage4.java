package bot;
/*
* Description
At this stage, you will improve your simple bot so that it can give you a test and check your answers. The test should be about programming. Your bot has to continue to ask the test until you answer correctly.

Your bot can ask anything you want, but there are two rules for your output:

the line with the test should end with the question mark character;
an option starts with a digit followed by the dot (1., 2., 3., 4.)
If a user enters an incorrect answer, the bot may print a message:

Please, try again.
Here is an example of a dialogue with the new version of the bot. Input lines are started with ">" symbol.

Hello! My name is Aid.
I was created in 2018.
Please, remind me your name.
> Max
What a great name you have, Max!
Let me guess your age.
Say me remainders of dividing your age by 3, 5 and 7.
> 1 2 1
Your age is 22: that's a good time to start programming!
Now I will prove to you that I can count to any number you want.
> 3
0!
1!
2!
3!
Let's test your programming knowledge.
Why do we use methods?
1. To repeat a statement multiple times.
2. To decompose a program into several small subroutines.
3. To determine the execution time of a program.
4. To interrupt the execution of a program.
> 4
Please, try again.
> 2
Congratulations, have a nice day!
The program must end with the Congratulations, have a nice day! message.*/


import java.util.Scanner;

public class Stage4 {
    final static Scanner scanner = new Scanner(System.in);

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }
    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }
    static void test() {
        System.out.println("Let's test your programming knowledge.");
        // write your code here
        System.out.println("Why do we use methods?");
        System.out.println(1+". To repeat a statement multiple times.");
        System.out.println(2 +". To decompose a program into several small subroutines.");
        System.out.println(3 +". To determine the execution of a program.");
        System.out.println(4 +". To determine the execution of a program.");
        int result=scanner.nextInt();
        int answer = 4;
        while (result != answer){
            System.out.println("Please, try again.");
            result = scanner.nextInt();
        }

    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }

    public static void main(String[] args) {
//calling the methods
        greet("Shagun", "2000"); // we can  change it as needed
        remindName();
        guessAge();
        count();

        test();
        end();
    }

}
