package Contenedoras;

import Models.Plane;

import java.util.ArrayList;

public class Hangar {
    private static int ID=0;
    private int hangarId;
    private ArrayList<Plane> planes;

    public Hangar() {
        this.hangarId=ID;
        ID++;
        planes=new ArrayList<>();
    }

    public int countPlanesInHangar(){
        int i=0;
        for (Plane plane: planes){
            i++;
        }
        return i;
    }

    public void addPlane(Plane newPlane){
        planes.add(newPlane);
    }

    public int getTotal(){
        return ID;
    }

    public String listPlanes(){
        String planeList="There aren't any planes in this hangar \n";
        if(!planes.isEmpty()){
            planeList="";
            for(Plane plane: planes){
                planeList+=plane.toString()+"\n";
            }
        }
        return planeList;
    }

    @Override
    public String toString() {
        return "Hangar{" +
                "hangarId=" + hangarId +
                ", planes=" + planes +
                '}';
    }
}
