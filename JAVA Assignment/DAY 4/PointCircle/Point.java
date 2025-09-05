package PointCircle;

class Point {
    private int x, y;

    public Point() {
        x = 0;
        y = 0;
    }

    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void printPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}


