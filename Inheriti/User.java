public class User {
    protected String fullName;
    protected int afm;
    protected String email;
    protected boolean termsAndServices;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAfm() {
        return afm;
    }

    public void setAfm(int afm) {
        this.afm = afm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isTermsAndServices() {
        return termsAndServices;
    }

    public void setTermsAndServices(boolean termsAndServices) {
        this.termsAndServices = termsAndServices;
    }

    public void operation() {
        // Implementation here
    }
}