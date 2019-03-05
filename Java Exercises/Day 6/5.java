interface Shape{
    String Shapeis();
}

class square implements Shape{
    @Override
    public String Shapeis() {
        System.out.println(" Square Shaped ");
        return "Square Shaped ";
    }
}

class circle implements Shape{
    @Override
    public String Shapeis() {
        System.out.println(" Cirle Shaped ");
        return " Circle Shaped ";
    }
}

class triangle implements Shape{
    @Override
    public String Shapeis() {
        System.out.println(" Triangle Shaped ");
        return " Triangle Shaped ";
    }
}

abstract class Color{
    Shape shape;
    String color;
    public Color(Shape shape, String color){
        this.shape = shape;
        this.color = color;
    }
}

class green extends Color{
    String specification;
    public green(Shape shape, String specification) {
        super(shape, "Green");
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "green{" +
                "shape=" + shape +
                ", color='" + color + '\'' +
                ", specification='" + specification + '\'' +
                '}';
    }
}

class red extends Color{
    String speciality;
    public red(Shape shape,String speciality){
        super(shape,"Red");
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "red{" +
                "shape=" + shape +
                ", color='" + color + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}

class Exercise_6_5 {
    public static void main(String[] args) {
        red r = new red(new triangle()," bright ");
        green g = new green(new square(),"represents freshness");
        System.out.println(r);
        System.out.println(g);
    }
}
