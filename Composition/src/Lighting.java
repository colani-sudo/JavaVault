public class Lighting {
    private int headBoard;
    private int indoor;
    private int outdoor;

    public Lighting(int headBoard, int indoor, int outdoor) {
        this.headBoard = headBoard;
        this.indoor = indoor;
        this.outdoor = outdoor;
    }

    private int getHeadBoard() {
        return headBoard;
    }

    private int getIndoor() {
        return indoor;
    }

    private int getOutdoor() {
        return outdoor;
    }
    public void findAllLighting(){
        System.out.println("The room has " + getHeadBoard() + " headboard lamps");
        System.out.println("The room has " + getIndoor() + " indoor lamps");
        System.out.println("The room has " + getOutdoor() + " outdoor lamps");
    }
}
