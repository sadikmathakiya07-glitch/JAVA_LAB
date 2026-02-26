public class Cube {
    double height;
    double width;
    double depth;
    public void setter(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    public double volume() {
        return height * width * depth;
    }


    public static void main(String[] args) {
      
        Cube c1 = new Cube();
        Cube c2 = new Cube();

        c1.setter(3.0, 4.0, 5.0);
        c2.setter(6.0, 7.0, 8.0);

        System.out.println("Volume of Cube 1: " + c1.volume());
        System.out.println("Volume of Cube 2: " + c2.volume());

    }
    
}

