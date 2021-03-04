import java.util.ArrayList;

public class Speedway {
    int totalCompetitors;
    int id;
    double totalDistance;
    String name;
    ArrayList idList = new ArrayList<Integer>();

    public Speedway(int id,int totalCompetitors, double totalDistance, String name, ArrayList idList) {
        this.id = id;
        this.totalCompetitors = totalCompetitors;
        this.totalDistance = totalDistance;
        this.name = name;
        this.idList = idList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCompetitors() {
        return totalCompetitors;
    }

    public void setTotalCompetitors(int totalCompetitors) {
        this.totalCompetitors = totalCompetitors;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    public ArrayList<Integer> getIdList() {
        return idList;
    }

    public void setIdList(ArrayList<Integer> idList) {
        this.idList = idList;
    }

    @Override
    public String toString() {
        return "pista{\n" +
                " TotalCompetitors= " + totalCompetitors + "\n" +
                " TotalDistance= " + totalDistance + "\n" +
                " Name= " + name + "\n" +
                " Players= \n" + idList + "\n" +
                '}';
    }
}
