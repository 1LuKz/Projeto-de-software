public class Circle {
    private double ray;

    public Circle(double ray){
        this.ray = ray;
    }

    public double getRay() {
        return ray;
    }

    public double length(){
        return 2.0 * Math.PI * ray;
    }

    public double area(){
        return Math.PI * (ray * ray);
    }

    public double volume(){
        return (4.0/3.0) * Math.PI * Math.pow(ray, 3.0);
    }
}
