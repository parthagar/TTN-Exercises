@FunctionalInterface
interface MyInterface {
    int useless(int a, int b);
}

class Exercise_5_2 {

    static int CreateInstance(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {

        MyInterface myInterface = Exercise_5_2::CreateInstance;
        System.out.println(myInterface.useless(4, 5));
    }
}
