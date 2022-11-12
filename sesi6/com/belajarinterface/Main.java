package sesi6.com.belajarinterface;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Gunakan Laptop");
        Laptop thinkpad = new Lenovo();
        LaptopUser andri = new LaptopUser(thinkpad);
        
        while(true){
            System.out.print("Masukan input ON/OFF/UP/DOWN/OUT? ");
            String input = in.next();
            gunakanlaptop(andri, input);
            if(input.equals("OUT")){
                System.out.println("Keluar");
                break;
            }
        }
    }

    public static void gunakanlaptop(LaptopUser user, String input) {
        if(input.equals("ON")){
            user.turnOnLaptop();
        }
        
        else if(input.equals("OFF")){
            user.turnOffLaptop();
        }
        
        else if(input.equals("UP")){
            user.makeLaptopLouder();
        }
        
        else if(input.equals("DOWN")){
            user.makeLaptopSilence();
        }
    }
}
