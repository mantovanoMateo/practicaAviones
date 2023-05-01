import Contenedoras.Airport;
import Contenedoras.Hangar;
import Models.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Airport AstorPiazola=new Airport("AstorPiazola","APZ101","IDK",6);
        Hangar hangarOne=new Hangar();
        Hangar hangarTwo=new Hangar();
        Hangar hangarThree=new Hangar();
        ComercialPlane comercialPlaneOne=new ComercialPlane("afj1","mercedez",300,"highOctane",500,10,"Food, movies, A/C,drinks,bathroom");
        CargoPlane cargoPlaneOne=new CargoPlane("Im the one of the random method","cargoPlanesBrand",800,"motor2",5,78000,"Food, cars, medicine supply");
        PrivatePlane privatePlaneOne=new PrivatePlane("xxx3","privateBrand",300,"superJEt",20,true,"IamRich");
        MilitarPlane militarPlaneOne=new MilitarPlane("caza","militia",80,"extraPropulsion",2,"machine gun and rockets",5000);
        MilitarPlane militarPlaneTwo=new MilitarPlane("hydra","militia",80,"extraPropulsion",2,"machine gun and rockets",5000);
        ComercialPlane comercialPlaneTwo=new ComercialPlane("afj2","mercedez",300,"highOctane",500,10,"Food,bathroom");
        ComercialPlane comercialPlaneThree=new ComercialPlane("afj3","mercedez",300,"highOctane",500,10,"Food,bathroom");

        System.out.println(AstorPiazola.ListTotalPlanes());
        System.out.println("now we add some hangars");
        AstorPiazola.addHangar(hangarOne);
        AstorPiazola.addHangar(hangarTwo);
        AstorPiazola.addHangar(hangarThree);
        System.out.println(AstorPiazola.ListTotalPlanes());
        System.out.println("now we add some planes");
        AstorPiazola.addPlaneInParticularHangar(comercialPlaneOne,0);
        AstorPiazola.addPlaneInParticularHangar(comercialPlaneTwo,0);
        AstorPiazola.addPlane(cargoPlaneOne);
        AstorPiazola.addPlaneInParticularHangar(militarPlaneOne,1);
        AstorPiazola.addPlaneInParticularHangar(militarPlaneTwo,1);
        AstorPiazola.addPlaneInParticularHangar(privatePlaneOne,2);
        AstorPiazola.addPlane(comercialPlaneThree);
        System.out.println(AstorPiazola.ListTotalPlanes());

        System.out.println(comercialPlaneOne.giveBlankets());
        System.out.println(privatePlaneOne.serveFood());

        System.out.println(comercialPlaneTwo.takeOff());
        System.out.println(comercialPlaneTwo.fly());
        System.out.println(comercialPlaneTwo.Land());
    }
}