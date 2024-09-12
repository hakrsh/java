package solid.freecodecamp;

class Shape {

}

class Sqaure1 extends Shape {

}
class Circle1 extends Shape {

}
class AreaCalculator {
    public void area(Shape shape) {
        if(shape instanceof Sqaure1) {

        } else if (shape instanceof Circle1) {

        }
    }
}

interface IAreaCalculator {
    void area();
}


class Sqaure extends Shape implements IAreaCalculator{
    public void area() {

    }
}
class Circle extends Shape implements IAreaCalculator{
    public void area() {

    }
}