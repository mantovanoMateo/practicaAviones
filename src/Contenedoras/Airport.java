package Contenedoras;

import Models.Plane;

import java.util.ArrayList;
import java.util.Random;

public class Airport {
    private String name;
    private String internationalCode;
    private String adress;
    private Integer operationCapacity;
    private ArrayList<Hangar> hangars;

    public Airport() {
    }

    public Airport(String name, String internationalCode, String adress, Integer operationCapacity) {
        this.name = name;
        this.internationalCode = internationalCode;
        this.adress = adress;
        this.operationCapacity = operationCapacity;
        this.hangars=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getInternationalCode() {
        return internationalCode;
    }

    public String getAdress() {
        return adress;
    }

    public Integer getOperationCapacity() {
        return operationCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInternationalCode(String internationalCode) {
        this.internationalCode = internationalCode;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setOperationCapacity(Integer operationCapacity) {
        this.operationCapacity = operationCapacity;
    }

    public Boolean addHangar(Hangar newHangar){
        hangars.add(newHangar);
        return true;
    }
    public Boolean addPlane(Plane newPlane){
        Boolean added=false;
        Random random=new Random();
        if(countPlanes()<operationCapacity){
            hangars.get(random.nextInt(hangars.get(0).getTotal())).addPlane(newPlane);
            added=true;
        }

        return added;
    }

    public Boolean addPlaneInParticularHangar(Plane newPlane,int hangar){
        Boolean added=false;
        Random random=new Random();
        if(countPlanes()<operationCapacity){
            hangars.get(hangar).addPlane(newPlane);
            added=true;
        }
        return added;
    }

    public String ListTotalPlanes(){
        String planelist="There aren't any hangars at this airport";
        if(!hangars.isEmpty()){
            planelist="";
            for(Hangar hangar: hangars){
                planelist+="======================================\n"+hangar.listPlanes()+"\n";
            }
        }
        return planelist;
    }
    public int countPlanes(){
        int i=0;
        for(Hangar hangar: hangars){
            i+=hangar.countPlanesInHangar();
        }
        return i;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                ", internationalCode='" + internationalCode + '\'' +
                ", adress='" + adress + '\'' +
                ", operationCapacity=" + operationCapacity +
                '}';
    }
}
