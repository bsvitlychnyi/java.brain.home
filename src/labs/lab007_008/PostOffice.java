package labs.lab007_008;

import java.util.Arrays;

public class PostOffice {
    private int workerCount;
    private String address;
    static final String mainOfficeAddress = "Vokzalnyi 27b";

    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PostOffice { " +
                "workerCount=" + workerCount +
                ", address='" + address + '\'' +
                " }";
    }

    public void send(int[] parcels){
        System.out.println("Посылки " + Arrays.toString(parcels) + " отправлены");
    }

    static double calculateVolumeWeight(double dl, double width, double height){
        return dl * width * height / 5000;
    }
}
