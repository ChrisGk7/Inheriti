// 1. Owner adds assets and heirs
RealEstate house = new RealEstate();
house.setPropID(1);
house.setAddress("123 Main St");

Heir heir1 = new Heir();
heir1.setFullName("John Doe");

Heir heir2 = new Heir();
heir2.setFullName("Jane Doe");

// 2. Assign assets with percentages
Assignment a1 = new Assignment();
a1.setAsset(house);
a1.setHeir(heir1);
a1.setPercentage(60.0);

Assignment a2 = new Assignment();
a2.setAsset(house);
a2.setHeir(heir2);
a2.setPercentage(40.0);

// 3. Create will and add assignments
Will will = new Will();
will.setDistribution(List.of(a1, a2));
will.setHeirList(List.of(heir1, heir2));

// 4. Validate and activate will
if (will.validateAssignments()) {
    will.setActive(true);
    // Notify heirs, e.g.:
    for (Heir h : will.getHeirList()) {
        // sendNotification(h);
    }
}

// 5. Heir accepts inheritance
heir1.acceptInheritance(); // You can add logic to transfer asset herepublic class RealEstate extends Asset {
    private int atak;
    private String address;
    private int kaek;
    private String description;

    public int getatak() {
        return atak;
    }

    public void setatak(int atak) {
        this.atak = atak;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getKaek() {
        return kaek;
    }

    public void setKaek(int kaek) {
        this.kaek = kaek;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}