class trycopying implements Cloneable {

    String str;

    trycopying(String str) {
        this.str = str;
    }

    trycopying(trycopying obj) {
        this.str = obj.str;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

class Exercise_2_5{
    public static void main(String[] args) {

        trycopying obj1 = new trycopying("This is what you came for");

        trycopying obj2 = new trycopying(obj1);

        try{
            trycopying obj3 = (trycopying) obj1.clone();
            System.out.println(obj1.str + "\n" + obj2.str + "\n" + obj3.str);
        }
        catch (CloneNotSupportedException errorobj) {
            errorobj.printStackTrace();
        }

    }
}
