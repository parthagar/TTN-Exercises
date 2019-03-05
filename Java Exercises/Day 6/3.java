enum carType{
    Micro,Mini,Luxury;
}
enum location{
    India,USA,China;
}

abstract class cars{

    carType typeOfCar;
    location locationOfCar;

    public cars(carType typeOfCar,location locationOfCar){
        this.locationOfCar = locationOfCar;
        this.typeOfCar = typeOfCar;
    };

    abstract void construct();

    @Override
    public String toString() {
        return "cars{" +
                "typeOfCar=" + typeOfCar +
                ", locationOfCar=" + locationOfCar +
                '}';
    }
}

class microCar extends cars{
   public microCar(location loc){
       super(carType.Micro,loc);
   }
    @Override
    void construct() {
        System.out.println(" connect to micro cars ");
    }
}

class miniCar extends cars{
    public miniCar(location loc){
        super(carType.Mini,loc);
    }

    @Override
    void construct() {
        System.out.println(" connect to mini cars ");
    }
}

class luxuryCar extends cars{
    public luxuryCar(location loc){
        super(carType.Luxury,loc);
    }

    @Override
    void construct() {
        System.out.println(" connect to micro cars ");
    }
}

class IndianCarFactory{
    static cars buildCar(carType typeOfCar){
        cars c = null;
        switch(typeOfCar){
            case Mini:
                c = new miniCar(location.India);
                break;
            case Micro:
                c = new microCar(location.India);
                break;
            case Luxury:
                c = new luxuryCar(location.India);
                break;
        }
        return c;
    }
}

class ChinaCarFactory{
    static cars buildCar(carType typeOfCar) {
        cars c = null;
        switch (typeOfCar){
            case Mini:
                c = new miniCar(location.China);
                break;
            case Micro:
                c = new microCar(location.China);
                break;
            case Luxury:
                c = new luxuryCar(location.China);
                break;
        }
        return c;
    }
}

class USACarFactory{
    static cars buildCar(carType typeOfCar) {
        cars c = null;
        switch (typeOfCar) {
            case Mini:
                c = new miniCar(location.USA);
                break;
            case Micro:
                c = new microCar(location.USA);
                break;
            case Luxury:
                c = new luxuryCar(location.USA);
                break;
        }
        return c;
    }
}

class carFactory{
    static cars buildCar(carType typeOfCar,location locationOfCar) {
        cars c = null;
        switch (locationOfCar) {
            case India:
                c = IndianCarFactory.buildCar(typeOfCar);
                break;
            case USA:
                c = USACarFactory.buildCar(typeOfCar);
                break;
            case China:
                c = ChinaCarFactory.buildCar(typeOfCar);
                break;
        }
        return c;
    }
}

class Exercise_6_3 {
    public static void main(String[] args) {
        System.out.println(carFactory.buildCar(carType.Micro,location.India));
        System.out.println(carFactory.buildCar(carType.Mini,location.USA));
        System.out.println(carFactory.buildCar(carType.Luxury,location.China));
    }
}
