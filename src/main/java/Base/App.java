/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Peachey
 */

package Base;

/*
Calculate gallons of paint needed to paint the ceiling of a room. Prompt
for the length and width, and assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling as a whole number.

Example Output:
You will need to purchase 2 gallons of paint to cover 360 square feet.

Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints:
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.

Challenges:
*Revise the program to ensure that inputs are entered as numeric values.
Don’t allow the user to proceed if the value entered is not numeric.
*Implement support for a round room.
*Implement support for an L-shaped room.
*Implement a mobile version of this app so it can be used at the hardware
store.
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        final int fpg = 350;

        System.out.println("What is the length of the room in feet?");
        double length = in.nextDouble();
        System.out.println("What is the width of the room in feet?");
        double width = in.nextDouble();

        double area = length * width;
        int gals = (int) area/fpg;

        if(area%350 > 0) gals = gals+1;

        System.out.println("You will need to purchase "+gals+" gallon(s) of paint to cover "+area+" square feet.");
    }
}
