import java.util.Date;
import java.util.List;

public class Will {
    private int willID;
    private Date dateOfIssue;
    private Date dateOfExecution;
    private int inhAFM;
    private List<Heir> heirList;
    private List<Assignment> distribution;
    private boolean isActive;

    public int getWillID() {
        return willID;
    }

    public void setWillID(int willID) {
        this.willID = willID;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Date getDateOfExecution() {
        return dateOfExecution;
    }

    public void setDateOfExecution(Date dateOfExecution) {
        this.dateOfExecution = dateOfExecution;
    }

    public int getInhAFM() {
        return inhAFM;
    }

    public void setInhAFM(int inhAFM) {
        this.inhAFM = inhAFM;
    }

    public List<Heir> getHeirList() {
        return heirList;
    }

    public void setHeirList(List<Heir> heirList) {
        this.heirList = heirList;
    }

    public List<Assignment> getDistribution() {
        return distribution;
    }

    public void setDistribution(List<Assignment> distribution) {
        this.distribution = distribution;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void operation() {
        // Implementation here
    }

    public void operation2() {
        // Implementation here
    }
}