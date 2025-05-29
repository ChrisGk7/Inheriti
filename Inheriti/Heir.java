import java.util.Date;

public class Heir extends User {
    private String fathersName;
    private Date birthday;
    private String relationship;
    private String comments;
    private boolean inheritanceAccepted; // Optional: track acceptance

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public boolean isInheritanceAccepted() {
        return inheritanceAccepted;
    }

    public void acceptInheritance() {
        this.inheritanceAccepted = true;
        System.out.println(getFullName() + " has accepted the inheritance.");
    }

    public void rejectInheritance() {
        this.inheritanceAccepted = false;
        System.out.println(getFullName() + " has rejected the inheritance.");
    }
}