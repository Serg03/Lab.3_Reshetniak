package com.company;

import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static Point generate(){
        Random r = new Random();
        return new Point(r.nextInt(20)-10, r.nextInt(20)-10);
    }
}
