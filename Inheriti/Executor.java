public class Executor extends User {
    private boolean isPerformer;

    public boolean isPerformer() {
        return isPerformer;
    }

    public void setPerformer(boolean isPerformer) {
        this.isPerformer = isPerformer;
    }

    // The executor sets the date of execution for the will
    public void setWillExecutionDate(Will will, java.util.Date executionDate) {
        if (will.isActive()) {
            will.setDateOfExecution(executionDate);
            System.out.println("Will execution date set to: " + executionDate);
        } else {
            System.out.println("Cannot set execution date. Will is not active.");
        }
    }

    public void updateWill(Will will) {
        // Implementation here
    }

    public void operation2() {
        // Additional behavior
    }
}