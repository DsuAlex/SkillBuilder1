import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        String name = "";


        Scanner input = new Scanner(System.in);
        //TODO : Replace this comment with your code

        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        name = input.next();


        double spicey = 0.0;
        System.out.println("Enter a floating point number:");
        spicey = input.nextDouble();
        double spice = (4.0/3.0) * Math.pow(2,Math.sqrt(5)/ Math.pow(spicey,3));
        double hundredthSpice1 = (spice * 100);
        double hundredthSpice2 = (int) hundredthSpice1;
        double hundredthSpice = hundredthSpice2/100.0;
        System.out.println("Well " + name + " the spice value resulted in " + spice);
        System.out.println("And the converted value is " + hundredthSpice);



    }


    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;


        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();



        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area
        double Area =  wallWidth * wallHeight;
        int Area1= (int) Area;
        System.out.println("Wall area: " + Area1 + " square feet");


        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        double gallons = Area/squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons\n", gallons );
        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        double gallonsPer = (Math.ceil(gallons)/gallonsPerCan);
        double gp1 = (gallonsPer * 100);
        int gp2 = (int) gp1;
        int finalGP = gp2/100;
        System.out.println("Cans needed: " + finalGP + " can(s)");

    }

}
