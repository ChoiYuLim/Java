package com.yulim.day_0320.Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

}


class Tree {
    public Position position;

    public Tree(Position position) {
        this.position = position;
    }
}


class Gongsa {
    public Position position;
    public int radius;

    public Gongsa(Position position, int radius) {
        this.position = position;
        this.radius = radius;
    }
}


class Park {
    Gongsa gongsa;
    public List<Tree> trees = new ArrayList<>();

    public void addTree(Tree tree) {
        trees.add(tree);
    }
}


class Calculator {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int R = scanner.nextInt();

        Gongsa gongsa = new Gongsa(new Position(a, b), R);

        Park park = new Park();
        park.gongsa = gongsa;

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Tree tree = new Tree(new Position(x, y));
            park.addTree(tree);
        }

        for (Tree tree : park.trees) {
            double distance = Calculator.getDistance(tree.position.x, tree.position.y,
                    park.gongsa.position.x, park.gongsa.position.y);
            if (park.gongsa.radius < distance) {
                System.out.println("silent");
            } else {
                System.out.println("noisy");
            }
        }
    }

}

