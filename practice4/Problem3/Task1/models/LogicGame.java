package practice4.Problem3.Task1.models;

import practice4.Problem3.Task1.contracts.IGame;

public class LogicGame implements IGame {

    @Override
    public void a() {
        System.out.println("A: interface for Logic Game");
    }

    @Override
    public void b() {
        System.out.println("B: interface for Logic Game");
    }

    @Override
    public void c() {
        System.out.println("C: interface for Logic Game");
    }

    @Override
    public void d() {
        System.out.println("D: interface for Logic Game");
    }
}
