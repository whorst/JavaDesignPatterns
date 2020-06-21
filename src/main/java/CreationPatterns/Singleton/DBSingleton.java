package CreationPatterns.Singleton;

import javax.management.InstanceAlreadyExistsException;

public class DBSingleton {
    private static volatile DBSingleton instance = null; //volatile is threadsafe

    private DBSingleton() {
        //constructor always private so people cant create new instances on their own
        if (instance != null) {
            throw new RuntimeException();   //Threadsafe
        }

    }

    public static DBSingleton getInstance() throws InstanceAlreadyExistsException {
        if (instance == null) {             //This is for lazy loading
            synchronized (DBSingleton.class) {   //protection from insanciating on reflection. synchronized makes sure only one thread can get access to that resource at a time
                if (instance == null)
                    instance = new DBSingleton();
            }
        } else {
            throw new InstanceAlreadyExistsException();
        }
        return instance;
    }

    public static void firstExample() {
        //Shows a singleton
        try {
            DBSingleton mySingleton = new DBSingleton();
            System.out.println(mySingleton.getInstance());
            DBSingleton mySingletonTwo = new DBSingleton();
            System.out.println(mySingletonTwo.getInstance());
        } catch (InstanceAlreadyExistsException e) {
            e.printStackTrace();
        }
    }

    public static void secondExample() {
        //Having something be lazily loaded is good for runtime
        //Run the debugger to show that instance is null
        try {

            DBSingleton mySingleton = new DBSingleton();
            System.out.println(mySingleton);
            mySingleton.getInstance();
        } catch (InstanceAlreadyExistsException e) {
            e.printStackTrace();
        }
    }
}
