class Singleton
{
    private static Singleton single_instance = null;

    private Singleton() {}

    static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}

class Exercise_2_4{
    public static void main(String[] args) {
        Singleton temp = Singleton.getInstance();
    }
}