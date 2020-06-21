import CreationPatterns.Builder.CorrectLunchOrderBuilder;
import CreationPatterns.Singleton.DBSingleton;

public class main {
    public static void main(String[] args) throws Exception {
//        Singleton();
        Builder();
    }
    public static void Singleton(){
//        DBSingleton.firstExample();
        DBSingleton.secondExample();
    }

    public static void Builder(){
        CorrectLunchOrderBuilder.Builder lunchBuilder = new CorrectLunchOrderBuilder.Builder();
        lunchBuilder.condiment("Mayo").bread("Wheat").meat("Beef").dressing("Salad");
        CorrectLunchOrderBuilder lunchOrder = lunchBuilder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiment());
        System.out.println(lunchOrder.getMeat());
        System.out.println(lunchOrder.getDressing());
    }
}
