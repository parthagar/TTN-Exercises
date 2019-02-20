enum houses{
    OneBHK(25),
    TwoBHK(35),
    ThreeBHK(45);

    int price;

    houses(int price){
        this.price = price;
    }

    int getPrice(){
        return price;
    }
}

class Exercise_9 {

    public static void main(String[] args) {

        System.out.println("Name and prices of enum 'houses':");
        houses arr[] = houses.values();

        for (houses house: arr)
            System.out.println(house.name() + ": " + house.getPrice());
    }
}
