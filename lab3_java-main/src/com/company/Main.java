package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(5)+1;
        Quadrangles quadrangles = new Quadrangles();
        String filename = "quadrangle.txt";

        // Загрузка из файла
        System.out.println("\n" + (quadrangles.load(filename) ? "Данные успешно загружены" : "Ошибка загрузки") + " из файла " + filename);
        System.out.println(quadrangles);

        quadrangles.clear();
        quadrangles.fillRandom(n);
        System.out.println(quadrangles);
        quadrangles.MinPerimetr();

        // Сохранение в файл
        System.out.println("\n" + (quadrangles.save(filename) ? "Данные успешно сохранены" : "Ошибка сохранения") + " в файл " + filename);

        /*n = r.nextInt(5)+1;
        Rhombuses rhombuses = new Rhombuses();
        rhombuses.fillRandom(n);
        System.out.println(rhombuses);
        rhombuses.MediumArea();*/
    }
}
