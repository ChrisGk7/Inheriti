import java.util.ArrayList;
import java.util.List;

public class Inherited {
    private List<Will> wills = new ArrayList<>();
    private List<Asset> assets = new ArrayList<>(); // Add this line

    public List<Will> getWills() {
        return wills;
    }

    public void setWills(List<Will> wills) {
        this.wills = wills;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public void createWill() {
        // Implementation here
    }

    public void updateWill() {
        // Implementation here
    }

    public void deleteWill() {
        // Implementation here
    }
}