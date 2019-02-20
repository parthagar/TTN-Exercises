class Bank {

    String name;
    double roi;

    Bank(String name, double roi){
        this.name = name;
        this.roi = roi;
    }

    void getDetails(){
        System.out.println("Name of the bank: " + name);
        System.out.println("ROI of the bank: " + roi);
    }
}

class SBI extends Bank{

    SBI(){
        super("SBI", 6.0);
    }
}

class BOI extends Bank{

    BOI(){
        super("BOI", 5.5);
    }
}

class ICICI extends Bank{

    ICICI(){
        super("ICICI", 7.0);
    }
}

class Exercise_11{

    public static void main(String[] args) {
        SBI sbi = new SBI();
        BOI boi = new BOI();
        ICICI icici = new ICICI();

        System.out.println("Calling getDetails() of SBI class object...");
        sbi.getDetails();

        System.out.println("Calling getDetails() of BOI class object...");
        boi.getDetails();

        System.out.println("Calling getDetails() of ICICI class object...");
        icici.getDetails();
    }
}
