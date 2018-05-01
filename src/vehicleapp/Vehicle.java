/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapp;


public class Vehicle {
    private String type;
    private String transmission;
    private String powertrain;
    private Integer speed;
    
    public Vehicle() {
        this.type = type;
        this.transmission = transmission;
        this.powertrain = powertrain;
        this.speed = 60;
    }
    
    
    /*
    make changes
    */
    public Integer accelarate() {
        int nspeed;
        int speedincrement = 10;
        nspeed=speed + speedincrement;
        return nspeed;
    }
    
    public Integer brake() {
        int nspeed;
        int speedincrement = 5;
        nspeed=accelarate() - speedincrement;
        return nspeed;
        
    } 
    
    public String getType() {
        return type;
    }
    public void setType(String cartype) {
        type=cartype ;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String cartrans) {
        transmission=cartrans;
    }
    public String getPowertrain() {
        return powertrain;
    }
    public void setPowertrain(String power) {
       powertrain=power; 
    }
    public Integer getSpeed() {
        return speed;
    }
    public void setSpeed(Integer carspeed) {
        speed=carspeed;
    }
}
