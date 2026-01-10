class RoyalFamilyMember extends Person {
    protected String title;

    public RoyalFamilyMember(String name, int age, String title) {
        super(name, age);
        this.title = title;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Title: " + title);
    }
}
