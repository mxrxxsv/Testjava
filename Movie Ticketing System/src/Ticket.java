import java.util.InputMismatchException;
import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] seats = {
                { 0, 1, 1, 0, 1, 0 },
                { 1, 0, 1, 0, 1, 1 },
                { 0, 1, 1, 1, 1, 0 },
                { 1, 0, 1, 0, 0, 1 },
        };

        System.out.println("  MOVIE THEATRE");
        show(seats);

        System.out.print("How many Ticket(s) do you want to avail: ");
        try{
            int HowManyAvail = input.nextInt();
        
        

        int[] Avail = new int[HowManyAvail];

        for (int i = 0; i < HowManyAvail; i++) {
            new Ticket();

            for(int x = 0; x<HowManyAvail; x++) {
                Avail[x] +=1;
            }

            System.out.println("Ticket: "+Avail[i]);
        }
     }catch(InputMismatchException ex) {
        System.out.print("try again. input a number");
     }
    }

    public Ticket () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter row (1-4): ");
        int row;
        try{
            row = in.nextInt();

            if(row == 1) {
            System.out.print("Enter seats (1-6): ");
            int seaT = in.nextInt();
            switch (seaT) {
                case 1:
                System.out.println("Free Ticket");
                break;
                case 2:
                System.out.println("Sold");
                break;
                case 3:
                System.out.println("Sold");
                break;
                case 4:
                System.out.println("Free Ticket");
                break;
                case 5:
                System.out.println("Sold");
                break;
                case 6:
                System.out.println("Free Ticket");
                break;
                default:
                System.out.println("Invalid Input! Choose (1-6)");
                new Ticket();
            }
        }else if(row == 2) {
            System.out.print("Enter seats (1-6): ");
            int seaT = in.nextInt();
            switch (seaT) {
                case 1:
                System.out.println("Sold");
                break;
                case 2:
                System.out.println("Free Ticket");
                break;
                case 3:
                System.out.println("Sold");
                break;
                case 4:
                System.out.println("Free Ticket");
                break;
                case 5:
                System.out.println("Sold");
                break;
                case 6:
                System.out.println("Sold");
                break;
                default:
                System.out.println("Invalid Input! Choose (1-6)");
                new Ticket();
            }
        }else if (row == 3) {
            System.out.print("Enter seats (1-6): ");
            int seaT = in.nextInt();
            switch (seaT) {
                case 1:
                System.out.println("Free Ticket");
                break;
                case 2:
                System.out.println("Sold");
                break;
                case 3:
                System.out.println("Sold");
                break;
                case 4:
                System.out.println("Sold");
                break;
                case 5:
                System.out.println("Sold");
                break;
                case 6:
                System.out.println("Free Ticket");
                break;
                default:
                System.out.println("Invalid Input! Choose (1-6)");
                new Ticket();
            }
        }else if (row == 4) {
            System.out.print("Enter seats (1-6): ");
            int seaT = in.nextInt();
            switch (seaT) {
                case 1:
                System.out.println("Sold");
                break;
                case 2:
                System.out.println("Free Ticket");
                break;
                case 3:
                System.out.println("Sold");
                break;
                case 4:
                System.out.println("Free Ticket");
                break;
                case 5:
                System.out.println("Free Ticket");
                break;
                case 6:
                System.out.println("Sold");
                break;
                default:
                System.out.println("Invalid");
                new Ticket();
            }
        } else {
            System.out.println("Invalid Input! Choose (1-6)");
            new Ticket();
        }


        } catch (InputMismatchException ex){
            System.out.println("Invalid Input! Choose (1-4)");
            new Ticket();
        }
    

    }

    public static void show(int[][] seats) {
        for (int[] row : seats) {
            for (int i : row) {
                System.out.print(i == 0 ? " O " : " X ");
            }

            System.out.println();
        }
    }



}
