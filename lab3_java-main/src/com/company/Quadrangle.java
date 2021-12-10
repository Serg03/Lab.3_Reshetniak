package com.company;

public class Quadrangle {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    public static Quadrangle generate(){
        return new Quadrangle(Point.generate(), Point.generate(), Point.generate(), Point.generate());
    }

    public int Side1(){
        double side1 = Math.sqrt(Math.pow((p2.getX()- p1.getX()), 2)+Math.pow((p2.getY()- p1.getY()), 2));
        return (int) Math.round(side1);
    }

    public int Side2(){
        double side2 = Math.sqrt(Math.pow((p3.getX()- p2.getX()), 2)+Math.pow((p3.getY()- p2.getY()), 2));
        return (int)Math.round(side2);
    }

    public int Side3(){
        double side3 = Math.sqrt(Math.pow((p4.getX()- p3.getX()), 2)+Math.pow((p4.getY()- p3.getY()), 2));
        return (int)Math.round(side3);
    }

    public int Side4(){
        double side4 = Math.sqrt(Math.pow((p4.getX()- p1.getX()), 2)+Math.pow((p4.getY()- p1.getY()), 2));
        return (int)Math.round(side4);
    }

    public int Diagonal1(){
        double diagonal1 = Math.sqrt(Math.pow((p3.getX()- p1.getX()), 2)+Math.pow((p3.getY()- p1.getY()), 2));
        return (int)Math.round(diagonal1);
    }

    public int Diagonal2(){
        double diagonal2 = Math.sqrt(Math.pow((p4.getX()- p2.getX()), 2)+Math.pow((p4.getY()- p2.getY()), 2));
        return (int)Math.round(diagonal2);
    }

    public int Perimetr(){
        int perimetr = Side4()+Side3()+Side2()+Side1();
        return perimetr;
    }

    public int Area(){
        int p = Perimetr()/2;
        double area = Math.sqrt((p-Side1())*(p-Side2())*(p-Side3())*(p-Side4()));
        return (int)Math.round(area);
    }

    @Override
    public String toString() {
        return "\n\nЧетырехугольник{\n" +
                "Точка 1: \nx: " + p1.getX() + "\ty: " + p1.getY() +
                "\nТочка 2: \nx: " + p2.getX() + "\ty: " + p2.getY() +
                "\nТочка 3: \nx: " + p3.getX() + "\ty: " + p3.getY() +
                "\nТочка 4: \nx: " + p4.getX() + "\ty: " + p4.getY() +

                "\n\nСторона 1: " + Side1() +
                "\nСторона 2: " + Side2() +
                "\nСторона 3: " + Side3() +
                "\nСторона 4: " + Side4() +

                "\nДиагональ 1: " + Diagonal1() +
                "\nДиагональ 2: " + Diagonal2() +
                "\nПериметр: " + Perimetr() +
                "\nПлощадь: " + Area() +
                "\n}";
    }
}
