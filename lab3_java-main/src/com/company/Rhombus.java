package com.company;

public class Rhombus extends Quadrangle {
    public Rhombus(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public static Rhombus generate(){
        int x1, x2, x3, x4, y1, y2, y3, y4;
        do {
            x1 = Point.generate().getX();
            y1 = Point.generate().getY();
            x2 = Point.generate().getX();
            y2 = Point.generate().getY();
            x3 = Point.generate().getX();
            y3 = Point.generate().getY();
            x4 = Point.generate().getX();
            y4 = Point.generate().getY();
        } while (Rhombus.Check(x1,y1,x2,y2,x3,y3,x4,y4) == false);
        return new Rhombus(new Point(x1,y1), new Point(x2, y2), new Point(x3, y3), new Point(x4,y4));
    }

    public static boolean Check(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        boolean check = false;
        if (Math.sqrt(Math.pow((x2- x1), 2)+Math.pow((y2 - y1), 2)) == Math.sqrt(Math.pow((x3- x2), 2)+Math.pow((y3- y2), 2))
                && Math.sqrt(Math.pow((x3- x2), 2)+Math.pow((y3- y2), 2)) == Math.sqrt(Math.pow((x4- x3), 2)+Math.pow((y4- y3), 2))
                && Math.sqrt(Math.pow((x4- x3), 2)+Math.pow((y4- y3), 2)) == Math.sqrt(Math.pow((x4- x1), 2)+Math.pow((y4- y1), 2)) &&
                Math.sqrt(Math.pow((x4- x2), 2)+Math.pow((y4- y2), 2)) != Math.sqrt(Math.pow((x3- x1), 2)+Math.pow((y3- y1), 2)) &&
                Math.sqrt(Math.pow((x4- x2), 2)+Math.pow((y4- y2), 2)) != 0 && Math.sqrt(Math.pow((x3- x1), 2)+Math.pow((y3- y1), 2)) != 0){
            check = true;
        }
        return check;
    }

    @Override
    public String toString() {
        return "\n\nРомб{\n" +
                "Точка 1: \nx: " + super.getP1().getX() + "\ty: " + super.getP1().getY() +
                "\nТочка 2: \nx: " + super.getP2().getX() + "\ty: " + super.getP2().getY() +
                "\nТочка 3: \nx: " + super.getP3().getX() + "\ty: " + super.getP3().getY() +
                "\nТочка 4: \nx: " + super.getP4().getX() + "\ty: " + super.getP4().getY() +

                "\n\nСторона 1: " + Side1() +
                "\nСторона 2: " + Side2() +
                "\nСторона 3: " + Side3() +
                "\nСторона 4: " + Side4() +

                "\nДиагональ 1: " + Diagonal1() +
                "\nДиагональ 2: " + Diagonal2() +
                "\nПериметр: " + Perimetr() +
                "\nПлощадь: " + (Diagonal2()*Diagonal1())/2 +
                "\n}";
    }
}
