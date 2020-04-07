package bot;

/*
* Description
At this stage, you will introduce yourself to the bot. He will greet you by your name and then try to guess your age using arithmetic operations.

Your program must print the following lines:

Hello! My name is Aid.
I was created in 2018.
Please, remind me your name.
What a great name you have, {yourName}!
Let me guess your age.
Enter remainders of dividing your age by 3, 5 and 7.
Your age is {yourAge}; that's a good time to start programming!
You may change the name and the creation year of your bot if you want.

Instead of {yourName}, the bot must print your name entered from the standard input. Instead of {yourAge}, the bot must determine your age according to the following formula:

age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
Where remainder3, remainder5 and remainder7 is three numbers you input to the program.

Here is an example of a dialogue with the bot. Input lines are started with ">" symbol. You do not need to read this symbol.

Hello! My name is Aid.
I was created in 2018.
Please, remind me your name.
> Max
What a great name you have, Max!
Let me guess your age.
Enter remainders of dividing your age by 3, 5 and 7.
> 1 2 1
Your age is 22; that's a good time to start programming!*/

import java.util.Scanner;

public class Stage2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");
        // reading a name
        String name = scanner.nextLine();
    }
}
