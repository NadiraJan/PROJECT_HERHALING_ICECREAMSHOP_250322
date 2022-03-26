package be.intecbrussel.eatables;

public class IceRocket implements Eatable {

    @Override
    public String toString() {
        return "IceRocket{}";
    }

    @Override
    public void eat() {
        System.out.println("Eating an iceRocket");
    }
}


