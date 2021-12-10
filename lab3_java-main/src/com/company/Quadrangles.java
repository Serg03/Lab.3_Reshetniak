package com.company;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quadrangles {
    private final List<Quadrangle> quadrangles;

    public Quadrangles(){
        quadrangles = new ArrayList<>();
    }

    public List<Quadrangle> getQuadrangles() {
        return quadrangles;
    }

    public void add(Quadrangle quadrangle) {
        this.quadrangles.add(quadrangle);
    }

    public void remove(Quadrangle quadrangle) {
        this.quadrangles.remove(quadrangle);
    }

    public void fillRandom(int n){
        for (int i = 0; i < n; i++) {
            quadrangles.add(Quadrangle.generate());
        }
    }

    public void MinPerimetr(){
        int min = 1000;
        for (Quadrangle quadrangle : this.quadrangles){
            if (quadrangle.Perimetr() < min){
                min = quadrangle.Perimetr();
            }
        }
        System.out.println("\nЧетырехугольник с минимальным периметром: ");
        for (Quadrangle quadrangle : this.quadrangles){
            if (min == quadrangle.Perimetr()){
                System.out.println(quadrangle);
            }
        }
    }

    public boolean save(String filename){
        FileWriter outStream = null;
        try {
            outStream = new FileWriter(filename);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        BufferedWriter bw = new BufferedWriter(outStream);
        for (Quadrangle quadrangle : this.quadrangles) {
            try {
                bw.write(String.valueOf(quadrangle.getP1().getX()) + System.lineSeparator());
                bw.write(String.valueOf(quadrangle.getP1().getY()) + System.lineSeparator());
                bw.write(String.valueOf(quadrangle.getP2().getX()) + System.lineSeparator());
                bw.write(String.valueOf(quadrangle.getP2().getY()) + System.lineSeparator());
                bw.write(String.valueOf(quadrangle.getP3().getX()) + System.lineSeparator());
                bw.write(String.valueOf(quadrangle.getP3().getY()) + System.lineSeparator());
                bw.write(String.valueOf(quadrangle.getP4().getX()) + System.lineSeparator());
                bw.write(String.valueOf(quadrangle.getP4().getY()) + System.lineSeparator());
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        try {
            bw.close();
            outStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean load(String filename){
        this.clear();
        try {
            Scanner scanner = new Scanner(new FileReader(filename));
            do {
                if (scanner.hasNextInt()) {
                    quadrangles.add(new Quadrangle(new Point(scanner.nextInt(), scanner.nextInt()),
                            new Point(scanner.nextInt(), scanner.nextInt()),
                            new Point(scanner.nextInt(), scanner.nextInt()),
                            new Point(scanner.nextInt(), scanner.nextInt())));
                } else
                    break;
            } while (scanner.hasNextLine());
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void clear() {
        quadrangles.clear();
    }

    @Override
        public String toString() {
            return "\n\n\nЧетырехугольники" + quadrangles + "; ";
        }
}
