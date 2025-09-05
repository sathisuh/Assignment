package Three3D;

class TwoD {
    protected int x, y;

    public TwoD() {
        System.out.println("TwoD default constructor");
        x = 0; y = 0;
    }

    public TwoD(int x, int y) {
        System.out.println("TwoD constructor with two arguments");
        this.x = x;
        this.y = y;
    }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
}

