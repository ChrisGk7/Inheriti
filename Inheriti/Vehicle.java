public class Vehicle extends Asset {
    private int vin;
    private int rego;
    private String description;

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getRego() {
        return rego;
    }

    public void setRego(int rego) {
        this.rego = rego;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}