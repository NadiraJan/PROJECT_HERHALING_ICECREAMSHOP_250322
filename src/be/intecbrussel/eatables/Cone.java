package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable {

    private Flavor [] balls;

    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "balls=" + Arrays.toString(balls) +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Eating a cone with flavours:");
        for(Flavor flava: balls){
            System.out.println(flava);
        }


    }


    public enum Flavor{
        STRAWBERRY, BANANA, MINT, CHOCOLATE, VANILAA, STRACIATELLA;
    }
}