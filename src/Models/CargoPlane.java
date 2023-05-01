package Models;

import Interfaces.AirportAdmission;

public class CargoPlane extends Plane implements AirportAdmission {
    private Integer loadCapacity;
    private String posibleProductslist;

    public CargoPlane() {
    }

    public CargoPlane(String model, String brand, Integer combustibleCapacity, String motorType, Integer seatsQuantity, Integer loadCapacity, String posibleProductslist) {
        super(model, brand, combustibleCapacity, motorType, seatsQuantity);
        this.loadCapacity = loadCapacity;
        this.posibleProductslist = posibleProductslist;
    }

    public Integer getLoadCapacity() {
        return loadCapacity;
    }

    public String getPosibleProductslist() {
        return posibleProductslist;
    }

    public void setLoadCapacity(Integer loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setPosibleProductslist(String posibleProductslist) {
        this.posibleProductslist = posibleProductslist;
    }

    public String deload(){
        return "Deloading cargo plane";
    }


    @Override
    public String toString() {
        return "CargoPlane{" +
                "loadCapacity=" + loadCapacity +
                ", posibleProductslist='" + posibleProductslist + '\'' +
                "} " + super.toString();
    }

    @Override
    public Boolean admissionRequest() {
        return true;
    }
}
