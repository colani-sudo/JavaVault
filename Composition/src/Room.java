import java.awt.*;

public class Room
{
    private Bathroom bathroom;
    private Furniture furniture;
    private Cooling cooling;

    public Room(Bathroom bathroom, Furniture furniture, Cooling cooling) {
        this.bathroom = bathroom;
        this.furniture = furniture;
        this.cooling = cooling;
    }

    public void bathroomAccessories(){
        bathroom.bathroomFeatures();
    }
    public void listFurniture(){
        System.out.println("No. of beds : " + furniture.getBed());
        System.out.println("No. of stoves : " + furniture.getStove());
        System.out.println("No. of tables : " + furniture.getTable());

    }
    public void coolingAid(){
        System.out.println("No. of Windows : " + cooling.getWindows());
        System.out.println("No. of Doors : " + cooling.getDoors());
    }
    public void getCoolingRange(Aircon aircon){
        System.out.println("Air-conditioner cooling");
                System.out.println("The lowest temperature is : " + aircon.getLowTemp());
        System.out.println("The highest temperature is : " + aircon.getHighTemp());
    }
}
