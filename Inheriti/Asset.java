import java.util.Date;

public abstract class Asset {
    protected int propID;
    protected Date dateOfIns;

    public int getPropID() {
        return propID;
    }

    public void setPropID(int propID) {
        this.propID = propID;
    }

    public Date getDateOfIns() {
        return dateOfIns;
    }

    public void setDateOfIns(Date dateOfIns) {
        this.dateOfIns = dateOfIns;
    }

    public void operation() {
        // Implementation here
    }

    public void operation2() {
        // Implementation here
    }
}