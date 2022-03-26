package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;


public class IceCreamApp {
    public static void main(String[] args) {

        PriceList priceList = new PriceList(2, 2.5, 1.5);
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);

        Cone cone = new Cone(new Cone.Flavor[]{Cone.Flavor.STRACIATELLA,
                Cone.Flavor.BANANA});

        Eatable[] eatables = {new IceRocket(), new Magnum(Magnum.MagnumType.WHITECHOCOLATE),
                new Magnum(Magnum.MagnumType.WHITECHOCOLATE), cone};

        Eatable[] iceCreamArray = new Eatable[]{
                iceCreamSalon.orderMagnum(Magnum.MagnumType.WHITECHOCOLATE),

                iceCreamSalon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES),
                iceCreamSalon.orderIceRocket(),
        iceCreamSalon.orderCone(new Cone.Flavor[]{Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.STRACIATELLA,
                Cone.Flavor.STRAWBERRY, Cone.Flavor.MINT, Cone.Flavor.VANILAA})};

        for (Eatable eatable : iceCreamArray) {
            eatable.eat();
            System.out.println("array is " + eatable);

        }

        System.out.println("TotalProfit is: " + iceCreamSalon.getTotalProfit());

    }
}

