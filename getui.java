package PROJECT;

import java.util.Scanner;

public class getui {

	static final String String = " !number! ";
	static Scanner input = new Scanner(System.in);
	
    public static double getUI() throws InterruptedException {
        double value = 0;
        boolean validInput = false;
        
        while (!validInput) {
            String inputs = input.nextLine();
            
            if (inputs.isEmpty()) {
            	menu.waguri();
                break;
            }
            
            try {
                value = Double.parseDouble(inputs);
                validInput = true;
            } catch (NumberFormatException e) {
            	menu.waguri();
            }
        }
        return value;
    }
    
    public static double getUI1() throws InterruptedException {
        int value = 0;
        boolean validInput = false;
        
        while (!validInput) {
        	
        	String inputs = input.nextLine();
            
            if (inputs.isEmpty()) {
            	menu.waguri();
                break;
            }
            
            try {
                value = Integer.parseInt(inputs);
                validInput = true;
            } catch (NumberFormatException e) {
                menu.waguri();
            }
        }
        return value;
    }
    
    public static double getUI2() throws InterruptedException {
        double value = 0;
        boolean validInput = false;
        
        while (!validInput) {
            String inputs = input.nextLine();
            
            if (inputs.isEmpty()) {
            	calculator.errors(String);
                break;
            }
            
            try {
                value = Double.parseDouble(inputs);
                validInput = true;
            } catch (NumberFormatException e) {
            	calculator.errors(String);
            }
        }
        return value;
    }
}
