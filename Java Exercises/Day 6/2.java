interface typeOfPolygon{
    void typeis();
}

class Square implements typeOfPolygon{
    @Override
    public void typeis() {
        System.out.println("Square Shape");
    }
}

class Rectangle implements typeOfPolygon{
    @Override
    public void typeis() {
        System.out.println("Rectangle Shape");
    }
}

class Circle implements typeOfPolygon{
    @Override
    public void typeis() {
        System.out.println("Circle Shape");
    }
}

class polygon {
    typeOfPolygon Type ;

    public void setType(typeOfPolygon type) {
        Type = type;
    }

    public typeOfPolygon getType() {
        return Type;
    }
}

class polygonfactory{
    static polygon getpolygon(String name){
        polygon p = new polygon();
        switch(name){
            case "polygonSquare":
                p.setType(new Square());
                break;
            case "polygonRectangle":
                p.setType(new Rectangle());
                break;
            case "polygonCircle":
                p.setType(new Circle());
                break;
        }
        return p;
    }
}

class Exercise_6_2{
    public static void main(String[] args) {
        polygon square = polygonfactory.getpolygon("polygonSquare");
        square.getType().typeis();

        polygon rectangle = polygonfactory.getpolygon("polygonRectangle");
        rectangle.getType().typeis();

        polygon circle = polygonfactory.getpolygon("polygonCircle");
        circle.getType().typeis();
    }
}
