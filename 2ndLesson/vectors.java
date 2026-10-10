public class vectors {
    private double x;
    private double y;
    private double z;

    public vectors(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public vectors() {
        this(0.0, 0.0, 0.0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public vectors add(vectors other) {
        this.x += other.x;
        this.y += other.y;
        this.z += other.z;
        return this;
    }

    public vectors subtract(vectors other) {
        this.x -= other.x;
        this.y -= other.y;
        this.z -= other.z;
        return this;
    }

    public double dot(vectors other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public vectors multiply(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
        this.z *= scalar;
        return this;
    }

}