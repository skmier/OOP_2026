package practice4.Problem3.Task1.app;

import practice4.Problem3.Task1.contracts.Game;
import practice4.Problem3.Task1.models.LogicGame;
import practice4.Problem3.Task1.models.MemoryGame;

public class App {
    public static void getStatistics(Game g){

        if(g instanceof LogicGame){
            System.out.println("Logic Game statistics: ");
        } else if (g instanceof MemoryGame) {
            System.out.println("Memory Game statistics: ");
        }
        g.a();
        g.b();
        g.c();
        System.out.println();
    }

    public static void main(String[] args) {
        LogicGame lg1 = new LogicGame();
        MemoryGame mg1 = new MemoryGame();

        getStatistics(lg1);
        getStatistics(mg1);
    }

}
