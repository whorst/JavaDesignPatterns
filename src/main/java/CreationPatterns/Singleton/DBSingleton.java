package CreationPatterns.Singleton;

public class DBSingleton {
    private static volatile DBSingleton instance = null; //volatile is threadsafe

    private DBSingleton() {
                            //constructor always private so people cant create new instances on their own
        if(instance!=null){
            throw new RuntimeException();   //Threadsafe
        }

    }
    public static DBSingleton getInstance(){
        if(instance == null){             //This is for lazy loading
            synchronized (DBSingleton.class){   //protection from insanciating on reflection. synchronized makes sure only one thread can get access to that resource at a time
                if(instance == null)
                    instance = new DBSingleton();
            }
        }
        return instance;
    }
    public static void firstExample(){
        //Shows a singleton
        DBSingleton mySingleton = new DBSingleton();
        System.out.println(mySingleton.getInstance());
        DBSingleton mySingletonTwo = new DBSingleton();
        System.out.println(mySingletonTwo.getInstance());
    }

    public static void secondExample(){
        //Having something be lazily loaded is good for runtime
        //Run the debugger to show that instance is null
        DBSingleton mySingleton = new DBSingleton();
        System.out.println(mySingleton);
    }
}
