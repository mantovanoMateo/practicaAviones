package Models;

import Interfaces.PersonalServices;

public class ComercialPlane extends Plane implements PersonalServices {
    private Integer stewardessQuantity;
    private String serviceList;

    public ComercialPlane() {
    }

    public ComercialPlane(String model, String brand, Integer combustibleCapacity, String motorType, Integer seatsQuantity, Integer stewardessQuantity, String serviceList) {
        super(model, brand, combustibleCapacity, motorType, seatsQuantity);
        this.stewardessQuantity = stewardessQuantity;
        this.serviceList = serviceList;
    }

    public Integer getStewardessQuantity() {
        return stewardessQuantity;
    }

    public String getServiceList() {
        return serviceList;
    }

    public void setStewardessQuantity(Integer stewardessQuantity) {
        this.stewardessQuantity = stewardessQuantity;
    }

    public void setServiceList(String serviceList) {
        this.serviceList = serviceList;
    }

    @Override
    public String toString() {
        return "ComercialPlane{" +
                "stewardessQuantity=" + stewardessQuantity +
                ", serviceList='" + serviceList + '\'' +
                "} " + super.toString();
    }

    @Override
    public String serveFood() {
        return "Serving food: Today's menu-> Pulled Pork sandwich";
    }

    @Override
    public String giveBlankets() {
        return "It's too cold so we are giving blankets";
    }
}
