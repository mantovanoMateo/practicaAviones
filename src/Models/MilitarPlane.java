package Models;

import Interfaces.AirportAdmission;

public class MilitarPlane extends Plane implements AirportAdmission {
    private String gunSystem;
    private Integer bulletsQuantity;

    public MilitarPlane() {
    }

    public MilitarPlane(String model, String brand, Integer combustibleCapacity, String motorType, Integer seatsQuantity, String gunSystem, Integer bulletsQuantity) {
        super(model, brand, combustibleCapacity, motorType, seatsQuantity);
        this.gunSystem = gunSystem;
        this.bulletsQuantity = bulletsQuantity;
    }

    public String getGunSystem() {
        return gunSystem;
    }

    public Integer getBulletsQuantity() {
        return bulletsQuantity;
    }

    public void setGunSystem(String gunSystem) {
        this.gunSystem = gunSystem;
    }

    public void setBulletsQuantity(Integer bulletsQuantity) {
        this.bulletsQuantity = bulletsQuantity;
    }

    @Override
    public String toString() {
        return "MilitarPlane{" +
                "gunSystem='" + gunSystem + '\'' +
                ", bulletsQuantity=" + bulletsQuantity +
                "} " + super.toString();
    }

    @Override
    public Boolean admissionRequest() {
        return true;
    }
}
