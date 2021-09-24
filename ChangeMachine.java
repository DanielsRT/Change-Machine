import java.util.*;
public class ChangeMachine {
    
    static Scanner keyb = new Scanner(System.in);
    
    static final int Cents_Per_Quarter = 25 * 1;
    static final int Cents_Per_Dime = 10 * 1;
    static final int Cents_Per_Nickel = 5 * 1;
    
    public static void main(String[] args){
        System.out.println("Welcome to the Change Machine\n");
        
        // input section
        System.out.print("Enter an amount from 1 to 99 to make change for: ");
        int total_change = keyb.nextInt();
        
        // calculation section
        int quarters = total_change / Cents_Per_Quarter;
        int change_left_1 = total_change % Cents_Per_Quarter;
        
        int dimes = change_left_1 / Cents_Per_Dime;
        int change_left_2 = change_left_1 % Cents_Per_Dime;
        
        int nickels = change_left_2 / Cents_Per_Nickel;
        int just_pennies = change_left_2 % Cents_Per_Nickel;
        
        // output section
        if (total_change > 1){
            System.out.printf("Coins for %,d cents:", total_change);
        } else {
            System.out.printf("Coins for %,d cent:", total_change);
        }
        
        if (quarters > 0) {
            if (dimes < 1 && nickels < 1 && just_pennies < 1) {
                if (quarters > 1) {
                System.out.printf(" %,d quarters", quarters);
                } else {
                System.out.printf(" %,d quarter", quarters);
                }
            } else {
                if (quarters > 1) {
                System.out.printf(" %,d quarters,", quarters);
                } else {
                System.out.printf(" %,d quarter,", quarters);
                }
            }
        }
        
        if (dimes > 0) {
            if (nickels < 1 && just_pennies < 1) {
                if (dimes > 1) {
                System.out.printf(" %,d dimes", dimes);
                } else {
                System.out.printf(" %,d dime", dimes);
                }
            } else {
                if (dimes > 1) {
                System.out.printf(" %,d dimes,", dimes);
                } else {
                System.out.printf(" %,d dime,", dimes);
                }
            }
        }
        
        if (nickels > 0) {
            if (just_pennies < 1) {
                if (nickels > 1) {
                System.out.printf(" %,d nickels", nickels);
                } else {
                System.out.printf(" %,d nickel", nickels);
                }
            } else {
                if (nickels > 1) {
                System.out.printf(" %,d nickels,", nickels);
                } else {
                System.out.printf(" %,d nickel,", nickels);
                }
            }
        }
        
        if (just_pennies > 0) {
            if (just_pennies > 1) {
                System.out.printf(" %,d pennies", just_pennies);
            } else {
                System.out.printf(" %,d penny", just_pennies);
            }
        }
        
        System.out.println("\n\nThanks for using the Change Machine");

    }
}