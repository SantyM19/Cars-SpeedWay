public class Driver {
    String namePilot;
    int driverID;
    int age;
    double totalDistance;
    int championsWon;
    public Car vehicle;

    public Driver(int pilotoID, Car vehicle) {
        this.namePilot = "Predeterminado";
        this.driverID = pilotoID;
        this.age = 20;
        this.totalDistance = 0;
        this.championsWon = 0;
        this.vehicle = vehicle;
    }

    public Driver(String namePilot, int driverID, int age, Car vehicle) {
        this.namePilot = namePilot;
        this.driverID = driverID;
        this.age = age;
        this.totalDistance = 0;
        this.championsWon = 0;
        this.vehicle = vehicle;
    }

    public Driver(String namePilot, int driverID, int age, double totalDistance, int championsWon, Car vehicle) {
        this.namePilot = namePilot;
        this.driverID = driverID;
        this.age = age;
        this.totalDistance = totalDistance;
        this.championsWon = championsWon;
        this.vehicle = vehicle;
    }

    public String getNamePilot() {
        return namePilot;
    }

    public void setNamePilot(String namePilot) {
        this.namePilot = namePilot;
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    public int getChampionsWon() {
        return championsWon;
    }

    public void setChampionsWon(int championsWon) {
        this.championsWon = championsWon;
    }

    public Car getVehicle() {
        return vehicle;
    }

    public void setVehicle(Car vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "  Piloto{\n" +
                "   NamePilot= " + namePilot + '\n' +
                "   PilotID= " + driverID + '\n' +
                "   Age= " + age + '\n' +
                "   TotalDistance= " + totalDistance + '\n' +
                "   ChampionsWon= " + championsWon + '\n' +
                "   Auto= \n" + vehicle + '\n' +
                " }";
    }
}
