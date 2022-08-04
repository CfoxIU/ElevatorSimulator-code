/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.util.Random;
/**Elevator Simulator
 * Code by Cohl Fox and Connor Bylciw
 *
 * @author James N. Fox
 */
public class ElevatorSimulator {
    public static void main(String[] args){
        ElevatorSimulator e = new ElevatorSimulator();
        e.ask();
        
    }
    Scanner intel = new Scanner(System.in);
    int maxfloor = 20;
    int minfloor = 1;
    int currentfloor = 1;
    int desiredfloor = 0;
    
    void display(Object o){
        System.out.println(o);
    }
    void ask(Object o){
        System.out.println(o);
    }
    void delay (int ms){
        try {
            Thread.sleep(ms);
        } catch (Exception e){}
    }
    void up(){
        while(currentfloor++ < desiredfloor) {
        System.out.println("going up . . . current floor: " + currentfloor + " | destined floor: " + desiredfloor);
        delay(600);
        }
        currentfloor --;
    }
    void down(){
        while(currentfloor-- > desiredfloor) {
        display("going down . . . current floor: " + currentfloor + " | destined floor: " + desiredfloor);
        delay(600);
        }
        currentfloor ++;
    }
    void ask(){
        ask("Current floor: " + currentfloor + " Enter the desired floor.");
        desiredfloor = intel.nextInt();
        if(desiredfloor < minfloor || desiredfloor > maxfloor || desiredfloor == currentfloor){
            System.out.println("Error. The floor you entered is out of range or you selected the current floor.");
            ask();
        } else {
            System.out.println("door is now closing. . . ");
            delay(600);
        if(desiredfloor < currentfloor){
            down();
        }
        else if(desiredfloor > currentfloor){
            up();
        }
        System.out.println("door is now opening. . . ");
        ask();
        }
    
}
}
