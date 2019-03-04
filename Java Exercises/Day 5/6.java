interface MyInterface1{
    default int add(int a, int b){
        return a + b;
    }

    static int sub(int a, int b){
        return a - b;
    }
}

class Exercise_5_6 implements MyInterface1{

    public static void main(String[] args) {

        Exercise_5_6 exercise_5_6 = new Exercise_5_6();
        System.out.println(exercise_5_6.add(3,2));
        System.out.println(MyInterface1.sub(3, 2));

    }
}
