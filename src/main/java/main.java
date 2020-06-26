import CreationPatterns.Builder.CorrectLunchOrderBuilder;
import CreationPatterns.Prototype.BookRegistry.Registry;
import CreationPatterns.Singleton.DBSingleton;
import CreationPatterns.Prototype.*;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {
//        Singleton();
//        Builder();
        Prototype();
    }

    public static void Prototype() {
//        Statement.firstExample();
        Registry.PrototypeDemo();
    }

    public static void Singleton() {
//        DBSingleton.firstExample();
        DBSingleton.secondExample();
    }

    public static void Builder() {
        CorrectLunchOrderBuilder.Builder lunchBuilder = new CorrectLunchOrderBuilder.Builder();
        lunchBuilder.condiment("Mayo").bread("Wheat").meat("Beef").dressing("Salad");
        CorrectLunchOrderBuilder lunchOrder = lunchBuilder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiment());
        System.out.println(lunchOrder.getMeat());
        System.out.println(lunchOrder.getDressing());
    }
}
