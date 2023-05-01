package Models;

import Interfaces.PersonalServices;

public class PrivatePlane extends Plane implements PersonalServices {
    private Boolean jacuzzi;
    private String wifiPassword;

    public PrivatePlane() {
    }

    public PrivatePlane(String model, String brand, Integer combustibleCapacity, String motorType, Integer seatsQuantity, Boolean jacuzzi, String wifiPassword) {
        super(model, brand, combustibleCapacity, motorType, seatsQuantity);
        this.jacuzzi = jacuzzi;
        this.wifiPassword = wifiPassword;
    }

    public Boolean getJacuzzi() {
        return jacuzzi;
    }

    public String getWifiPassword() {
        return wifiPassword;
    }

    public void setJacuzzi(Boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public void setWifiPassword(String wifiPassword) {
        this.wifiPassword = wifiPassword;
    }

    public Boolean verMundial(String accion){
        Boolean viendo=true;
        if(accion.equalsIgnoreCase("apagar")){
            viendo=false;
        }

        return viendo;
    }

    @Override
    public String toString() {
        return "PrivatePlane{" +
                "jacuzzi=" + jacuzzi +
                ", wifiPassword='" + wifiPassword + '\'' +
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
