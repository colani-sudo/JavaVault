public class Point {
    private int x;
    private int y;

    public Point(){
        this(0,0);
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(Math.pow((double)this.x, 2) + Math.pow((double)this.y, 2));
    }
    //√[(x₂ - x₁)² + (y₂ - y₁)²]
    public double distance(Point p){

        int diffX = p.getX() - this.x;
        int diffY = p.getY() - this.y;
        int squareX = diffX * diffX;
        int squareY = diffY * diffY;
        double dist = Math.sqrt((double) squareX + (double) squareY);
        return dist;
    }
    public double distance(int x, int y){
         Point p =  new Point(x,y);
         return distance(p);
    }
}
