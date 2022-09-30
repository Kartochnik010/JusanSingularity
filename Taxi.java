class Taxi {
    public Taxi(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int x;
    private int y;

    public void moveRight(){
        x++;
    }
    public void moveLeft(){
        x--;
    }
    public void moveUp(){
        y++;
    }
    public void moveDown(){
        y--;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public static void driveTaxi(Taxi driver, int toX, int toY) {
        int x = driver.getX();
        int y = driver.getY();
        if (toX >= x) {
            while (x != toX) {
                driver.moveRight();
                x++;
            }
        } else {
            while (x != toX) {
                driver.moveLeft();
                x--;
            }
        }
        if (toY >= y) {
            while (y != toY) {
                driver.moveUp();
                y++;
            }
        } else {
            while (y != toY) {
                driver.moveDown();
                y--;
            }
        }
    }
}