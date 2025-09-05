package Three3D;

class ThreeD extends TwoD {
    private int z;

    public ThreeD() {
        super();
        z = 0;
    }

    public ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(int z) { this.z = z; }
    public int getZ() { return z; }

    public double distance(ThreeD other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) +
                Math.pow(other.y - this.y, 2) +
                Math.pow(other.z - this.z, 2));
    }
}







