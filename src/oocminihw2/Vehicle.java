/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */
public abstract class Vehicle implements Drivable, Flyable, Sailable {
    private float speed;
    private float direction = 0;
    String make;
    String type;
    int numWheels = 0;
    protected int numWings = 0;
    protected int numSails = 0;
    int numPassengers;

    public int getNumWheels() {
        return numWheels;
        
    }
}
