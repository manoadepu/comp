package models;

public class Hap3Count {
    public int hap3DonorCount;
    public int hap3CordCount;

    public int getHap3DonorCount() {
        return hap3DonorCount;
    }

    public void setHap3DonorCount(int hap3DonorCount) {
        this.hap3DonorCount = hap3DonorCount;
    }

    public int getHap3CordCount() {
        return hap3CordCount;
    }

    public void setHap3CordCount(int hap3CordCount) {
        this.hap3CordCount = hap3CordCount;
    }

    @Override
    public String toString() {
        return "Hap3Count{" +
                "hap3DonorCount=" + hap3DonorCount +
                ", hap3CordCount=" + hap3CordCount +
                '}';
    }
}
