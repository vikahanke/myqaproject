import java.util.Scanner;

public class BurgerMenu  {

    public static void main(String[] args) {

        System.out.println("1. Burger - 50 $");
        System.out.println("2. Cheese - 20 $");
        System.out.println("3. Meat - 30 $");
        System.out.println("4. Extra Sauce - 10 $");
        System.out.println("5. No Extra ");


        Scanner input = new Scanner(System.in);
        System.out.println("Choose what you like for your Burger?");


        int choice;

        choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("You bought only Burger. Please pay 50 $");
                    break;

                case 2:
                    int extra;
                    System.out.println("You chose Cheese for your Burger");
                    System.out.println("Would you like something else?");
                    extra = input.nextInt();
                    if (extra == 3) {
                        System.out.println("You chose Meat. Please pay 100 $");
                    } else if (extra == 4){
                    System.out.println("You chose Sauce. Please pay 80 $");
                    } else {
                        System.out.println("You chose only Burger with cheese. Please pay 70 $");
                    }
                    break;


                case 3:
                    int extra1;
                    System.out.println("You chose Meat for your Burger");
                    System.out.println("Would you like something else?");
                    extra1 = input.nextInt();
                    if (extra1 == 2) {
                        System.out.println("You chose Cheese. Please pay 100 $");
                    } else if (extra1 == 4){
                        System.out.println("You chose Sauce. Please pay 90 $");
                    } else {
                        System.out.println("You chose only Burger with meat. Please pay 80 $");
                    }
                    break;


                case 4:
                    int extra2;
                    System.out.println("You chose Sauce for your Burger");
                    System.out.println("Would you like something else?");
                    extra2 = input.nextInt();
                    if (extra2 == 3) {
                        System.out.println("You chose Meat. Please pay 90 $");
                    } else if (extra2 == 2){
                        System.out.println("You chose Cheese. Please pay 80 $");
                    } else {
                        System.out.println("You chose only Burger with Sauce. Please pay 60 $");
                    }
                    break;









            }


    }
}
