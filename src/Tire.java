public class Tire {

    private String brand;
    private int integrity;
    private int tearRate;

    public Tire(String brand, int integrity, int tearRate) {
        this.brand = brand;
        this.integrity = integrity;
        this.tearRate = tearRate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTearRate() {
        return tearRate;
    }

    public void setTearRate(int tearRate) {
        this.tearRate = tearRate;
    }

    public int getIntegrity() {
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }


}
