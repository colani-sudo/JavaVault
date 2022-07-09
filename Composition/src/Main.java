public class Main {
    public static void main(String[] args)
    {
        //===========Vehicle Car=====inheritance====

        //===========PC,Case,Motherboard,Monitor,Dimensions,Resolution=======
        /*
        Dimensions dimensions = new Dimensions(20, 20, 5);   //1st method of initializing with an object

        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2560, 1440));//2nd method of initializing with an object

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4,6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, motherboard);

        thePC.powerUp();
        */
        //================================Composition Challenge====================
        Aircon aircon = new Aircon(30, 16);

        Lighting lighting = new Lighting(2, 2, 4);

        Bathroom bathroom = new Bathroom(true, true, true);
        Furniture furniture = new Furniture(1,1,1, lighting);
        Cooling cooling = new Cooling(3,2, aircon);

        Room room = new Room(bathroom, furniture, cooling);

        room.listFurniture();
        furniture.getLighting().findAllLighting();
        room.coolingAid();
        room.getCoolingRange(aircon);
        room.bathroomAccessories();
    }
}