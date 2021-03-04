public class Car {
    private int driverId;
    private String color;
    double distancia;
    String brand;

    public Car(int driverId) {
        this.brand = "Porsche";
        this.driverId = driverId;
        this.color = "Negro";
        this.distancia = 0;
    }

    public Car(int driverId, String brand, String color) {
        this.brand = brand;
        this.driverId = driverId;
        this.color = color;
        this.distancia = 0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int DriverId() {
        return driverId;
    }

    public void driverId(int driverId) {
        this.driverId = driverId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void velocidad(int velocidad){
        double distance = velocidad * 100 + getDistancia();
        setDistancia(distance);
    }

    @Override
    public String toString() {
        return "    Auto{\n" +
                "     Piloto= " + driverId + '\n' +
                "     Marca= " + brand + '\n' +
                "     Color= " + color + '\n' +
                "     Distancia= " + distancia + '\n' +
                "    }";
    }
}
