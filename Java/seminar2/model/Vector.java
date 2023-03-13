package seminar2.model;

public class Vector {
    private double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return длинна вектора
     */
    public double lengthVector() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @param vector - второй вектор для произведения
     * @return скалярное произведение
     */
    public double scalarMulti(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    /**
     * @param vector - второй вектор для произведения
     * @return вектор с векторным произведением двух векторов
     */
    public Vector vectorMulti(Vector vector) {
        return new Vector(y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    /**
     * @param vector - второй вектор для вычисления угла
     * @return угол между векторами
     */
    public double cosVector(Vector vector) {
        return scalarMulti(vector) / (lengthVector() * vector.lengthVector());
    }

    /**
     * @param vector - второй вектор для вычисления суммы
     * @return вектор с суммой векторов
     */
    public Vector sumVector(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    /**
     * @param vector - второй вектор для вычисления разницы
     * @return вектор с разницей векторов
     */
    public Vector difVector(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }
}
