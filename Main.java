package com.company;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            double accuracy = 0.1;
            double currentX;
            boolean isCorrect;
            Scanner input = new Scanner(System.in);
            System.out.println("Данная программа вычисляет корни уравнения 9.33sin(6.977x) - 7.25x = 0 с точностью E методом простой итерации.");
            do {
                isCorrect = true;
                System.out.print("Введите точность Е: ");
                try {
                    accuracy = Double.parseDouble(input.nextLine());
                } catch (Exception except) {
                    System.out.println("Ошибка ввода. Введите число.");
                    isCorrect = false;
                }
                if (isCorrect && ((accuracy < 0.00000002) || (!(accuracy < 1)))) {
                    System.out.println("Ошибка ввода. Введите число не менее 0.00000002 и не более 1.");
                    isCorrect = false;
                }
            } while (!isCorrect);
            double x0 = 0.34;
            double nextX = x0;
            do {
                currentX = nextX;
                nextX = (9.33 / 7.25) * Math.sin(6.977 * currentX);
                if (Math.abs(nextX) < 0.1)
                    nextX += 0.05;
            } while (!(Math.abs(currentX - nextX) < accuracy) || (Math.abs(nextX) < 0.1));
            double x1 = nextX;
            System.out.println("Корень: " + x1);
            System.out.println("Корень: " + (-x1));
            x0 = 1.034;
            nextX = x0;
            do {
                currentX = nextX;
                nextX = (9.33 / 7.25) * Math.sin(6.977 * currentX);
                if ((Math.abs(Math.abs(nextX) - Math.abs(x1)) < 0.13) || (Math.abs(nextX) < 0.1))
                    nextX -= 0.05;
            } while (!(Math.abs(currentX - nextX) < accuracy) || (Math.abs(Math.abs(nextX) - Math.abs(x1)) < 0.13) || (Math.abs(nextX) < 0.1));
            double x2 = nextX;
            System.out.println("Корень: " + x2);
            System.out.println("Корень: " + (-x2));
            x0 = 1.183;
            nextX = x0;
            do {
                currentX = nextX;
                nextX = (9.33 / 7.25) * Math.sin(6.977 * currentX);
                if ((Math.abs(Math.abs(nextX) - Math.abs(x1)) < 0.13) || (Math.abs(Math.abs(nextX) - Math.abs(x2)) < 0.13) || (Math.abs(nextX) < 0.1))
                    nextX -= 0.02;
            } while (!(Math.abs(currentX - nextX) < accuracy) || (Math.abs(Math.abs(nextX) - Math.abs(x1)) < 0.13) || (Math.abs(Math.abs(nextX) - Math.abs(x2)) < 0.13) || (Math.abs(nextX) < 0.1));
            System.out.println("Корень: " + nextX);
            System.out.println("Корень: " + (-nextX));
            System.out.println("Корень: 0");
        }
    }
