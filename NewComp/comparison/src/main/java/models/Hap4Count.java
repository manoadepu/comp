package models;

public class Hap4Count {
    public int hap4DonorCount;
    public int hap4CordCount;

    public int getHap4DonorCount() {
        return hap4DonorCount;
    }

    public void setHap4DonorCount(int hap3DonorCount) {
        this.hap4DonorCount = hap3DonorCount;
    }

    public int getHap4CordCount() {
        return hap4CordCount;
    }

    public void setHap4CordCount(int hap4CordCount) {
        this.hap4CordCount = hap4CordCount;
    }

    @Override
    public String toString() {
        return "Hap4Count{" +
                "hap4DonorCount=" + hap4DonorCount +
                ", hap4CordCount=" + hap4CordCount +
                '}';
    }
}
