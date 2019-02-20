class Exercise_7 {

    static String blockFirstName;
    static String blockLastName;
    static int blockAge;

    static String varFirstName = "Sunil";
    static String varLastName = "Pal";
    static int varAge = 49;

    static{
        blockFirstName= "Rajeev";
        blockLastName = "Nigam";
        blockAge = 50;
    }

    static void printinfo(){
        System.out.println("\nStatic Method");
        System.out.println("First Name: " + "Raju" + "\nLast Name: " + "Srivastava" + "\nAge: " + 48);
    }

    public static void main(String[] args) {

        System.out.println("Static Block");
        System.out.println("First Name: " + blockFirstName + "\nLast Name: " + blockLastName + "\nAge: " + blockAge);

        printinfo();

        System.out.println("\nStatic Variables");
        System.out.println("First Name: " + varFirstName + "\nLast Name: " + varLastName + "\nAge: " + varAge);
    }
}
