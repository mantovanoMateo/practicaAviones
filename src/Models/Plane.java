package Models;

import java.util.Objects;
import java.util.Random;

public class Plane {
    private String model;
    private String brand;
    private Integer combustibleCapacity;
    private String motorType;
    private Integer seatsQuantity;
    private String status;

    public Plane() {
    }

    public Plane(String model, String brand, Integer combustibleCapacity, String motorType, Integer seatsQuantity) {
        this.model = model;
        this.brand = brand;
        this.combustibleCapacity = combustibleCapacity;
        this.motorType = motorType;
        this.seatsQuantity = seatsQuantity;
        this.status="landed";
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getCombustibleCapacity() {
        return combustibleCapacity;
    }

    public String getMotorType() {
        return motorType;
    }

    public Integer getSeatsQuantity() {
        return seatsQuantity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCombustibleCapacity(Integer combustibleCapacity) {
        this.combustibleCapacity = combustibleCapacity;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public void setSeatsQuantity(Integer seatsQuantity) {
        this.seatsQuantity = seatsQuantity;
    }

    public String takeOff(){
        String action="Take off has started";
        if(!status.equalsIgnoreCase("landed")){
            action="Plane allready taking off or flying";
        }else {
            status="takingoff";
        }
        return action;
    }

    public String fly(){
        String action="Plane has started Flying";
        if(!status.equalsIgnoreCase("takingoff")){
            action="Plane allready flying or landed if its landed please start taking off after flying";
        }else {
            status="flying";
        }
        return action;
    }

    public String Land(){
        String action="Plane has landed succesfully";
        Random random=new Random();
        if(status.equalsIgnoreCase("landed")){
            action="Plane allready landed";
        }else if (random.nextBoolean()==true){
            action="Fatal landing mistake, plane has crashed :/ (gigachad song intensifies) ";
            status="landed";
        }else{
            status="landed";
        }
        return action;
    }


    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", combustibleCapacity=" + combustibleCapacity +
                ", motorType='" + motorType + '\'' +
                ", seatsQuantity=" + seatsQuantity +
                '}';
    }


}
