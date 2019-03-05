class nodefclass{}

class Exercise_2_3 {

    public static void main(String[] args) {

        try {
            String str = "utils";
            Class noclassfound = Class.forName(str);
        }
        catch(Exception errorobj1) {

            errorobj1.printStackTrace();

            nodefclass obj2 = new nodefclass();
        }
    }
}
