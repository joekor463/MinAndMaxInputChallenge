import java.util.Scanner;

public class MinAndMaxInputChallenge {
     public static void main(String arg[]) {
            Scanner scanner = new Scanner(System.in);
            //int nums[] = new int[10];
            //System.out.println ("Enter Number");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int count = 1;
                int min = 0;
                int max = 0;
                while(count < 5){
                    System.out.println ("Enter number #"+ count +":");
                    int digit = scanner.nextInt();

                    count = count++;
                    if (max < digit) {
                        max = digit;
                    }
                    else min = digit;
                    scanner.nextLine(); // handle next line character (enter key)
                }
                System.out.println ("Min = "+ min);
                System.out.println ("Max = "+ max);
            }
            else {
                System.out.println("Wrong digit");}
            scanner.close();
     }
}

