package pl.sda.figury;

public class Rectangle implements Figure {
    int sideA;
    int sideB;

    @Override
    public double getPerimeter(int sideA, int sideB) {
        return sideA*2 + sideB*2;
    }

    @Override
    public double getArea(int sideA, int sideB) {
        return sideA * sideB;
    }
}
