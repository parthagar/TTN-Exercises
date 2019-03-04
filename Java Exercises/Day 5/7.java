interface MyInterface2{
    default int add(int a, int b){
        return a + b;
    }

}

class Exercise_5_7 implements MyInterface2{

    public static void main(String[] args) {

        Exercise_5_6 exercise_5_6 = new Exercise_5_6(){
            @Override
            public int add(int a, int b){
                return a + b + 1;
            }
        };

        System.out.println(exercise_5_6.add(4, 5));
    }
}
