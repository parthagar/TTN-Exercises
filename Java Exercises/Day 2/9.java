class Furniture{

    String material;
    String furnitureType;
    int stressTestValue, fireTestValue;

    Furniture(String material, String furnitureType, int stressTestValue, int fireTestValue) {
        this.material = material;
        this.furnitureType = furnitureType;
        this.stressTestValue = stressTestValue;
        this.fireTestValue = fireTestValue;
    }

    void stressTest(){
        System.out.println(material + " " + furnitureType + " stress test value is " + stressTestValue);
    }

    void fireTest(){
        System.out.println(material + " " + furnitureType + " fire test value is " + fireTestValue);
    }
}

class Chair extends Furniture {

    static int stressTestValue;
    static int fireTestValue;
    static String furnitureType = "Chair";

    private static int setStressTestValue(String material) {
        if (material.equals("wood"))
            stressTestValue = 2000;
        else if(material.equals("metal"))
            stressTestValue = 5000;
        return stressTestValue;
    }

    private static int setFireTestValue(String material) {
        if (material.equals("wood"))
            fireTestValue = 250;
        else if(material.equals("metal"))
            fireTestValue = 600;
        return fireTestValue;
    }

    Chair(String material) {
        super(material, furnitureType, setStressTestValue(material), setFireTestValue(material));
    }

}

class Table extends Furniture {

    static int stressTestValue;
    static int fireTestValue;
    static String furnitureType = "Table";

    private static int setStressTestValue(String material) {
        if (material.equals("wood"))
            stressTestValue = 3000;
        else if(material.equals("metal"))
            stressTestValue = 6000;
        return stressTestValue;
    }

    private static int setFireTestValue(String material) {
        if (material.equals("wood"))
            fireTestValue = 350;
        else if(material.equals("metal"))
            fireTestValue = 650;
        return fireTestValue;
    }

    Table(String material) {
        super(material, furnitureType, setStressTestValue(material), setFireTestValue(material));
    }

}