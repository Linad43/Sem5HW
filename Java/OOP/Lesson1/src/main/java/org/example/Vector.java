package org.example;

public class Vector
{
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
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

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double length()
    {
        return Math.sqrt(x*x+y*y+z*z);
    }
    public double scalProd(Vector vector2)
    {
        return this.x*vector2.x+this.y*vector2.y+this.z*vector2.z;
    }
    public Vector vecProd(Vector vector2)
    {
        return new Vector(
                this.y*vector2.z-this.z*vector2.y,
                this.z*vector2.x-this.x*vector2.z,
                this.x*vector2.y-this.y*vector2.x);
    }
    public double cos(Vector vector)
    {
        return this.scalProd(vector)/(this.length()*vector.length());
    }
    public Vector sum(Vector vector)
    {
        return new Vector(
                this.x+vector.x,
                this.y+vector.y,
                this.z+vector.z);
    }
    public Vector razn(Vector vector)
    {
        return new Vector(
                this.x-vector.x,
                this.y-vector.y,
                this.z-vector.z);
    }
}
