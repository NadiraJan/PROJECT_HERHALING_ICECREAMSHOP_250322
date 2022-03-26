package be.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;


public class AppV2 {
    public static void main(String[] args) throws NoMoreIceCreamException {


        Stock stock = new Stock(50, 15, 25, 40);
        PriceList priceList = new PriceList(1.5, 2.0, 3.0);

        IceCreamCar iceCreamCar = new IceCreamCar(priceList, stock);

       /* Cone cone = new Cone(new Cone.Flavor[]{Cone.Flavor.STRACIATELLA,
                Cone.Flavor.BANANA});
        iceCreamCar.orderIceRocket();
        iceCreamCar.orderMagnum(Magnum.MagnumType.WHITECHOCOLATE);*/

        Eatable[] iceCreamArray = new Eatable[]{
                iceCreamCar.orderMagnum(Magnum.MagnumType.WHITECHOCOLATE),

                iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES),
                iceCreamCar.orderIceRocket(), iceCreamCar.orderIceRocket(), iceCreamCar.orderIceRocket(),
                iceCreamCar.orderCone(new Cone.Flavor[]{Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE,
                Cone.Flavor.STRACIATELLA, Cone.Flavor.STRAWBERRY, Cone.Flavor.MINT, Cone.Flavor.VANILAA})};

        for (Eatable eatable : iceCreamArray) {
            eatable.eat();
            System.out.println("array is " + eatable);

        }
        System.out.println("TotalProfit is: " + iceCreamCar.getProfit());

    }}