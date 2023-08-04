import java.util.Scanner;

public class ArrayTaskList {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num;

        do {
            System.out.print("How many List of task do u want: ");
            while (!in.hasNextInt()) {
                String input = in.next();
                 System.out.printf("(%s) is not a valid number.  ",input);
            }
            num = in.nextInt();
        } while (num<0);

        String [] task = new String[num];
 
        for (int i = 0; i<num; ++i) {
            System.out.print("TASK "+(i+1)+": ");
            task [i] = in.next();
        }

        for (int i = 0; i<num; i++) {
            System.out.println();
            System.out.println("TASK "+(i+1));
            System.out.println("*"+task[i]);
        }
        in.close();
    }
}
