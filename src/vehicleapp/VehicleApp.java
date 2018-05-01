/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapp;

/**
 *
 * @author User
 */
public class VehicleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Vehicle car=new Vehicle();
       car.setType("Car");
       car.accelarate();
       System.out.println("Accelerate: Current speed = " +car.accelarate());
       car.brake();
       System.out.println("Brake: Current speed = " +car.brake());
       car.setTransmission("Manual");
       car.setPowertrain("Electric");
       System.out.println(car.getPowertrain()+" "+car.getType()+" "+"with "+car.getTransmission()+" transmission");
       
    }
}
