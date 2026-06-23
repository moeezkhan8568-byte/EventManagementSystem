public class Admin extends User {

    private String adminName;

    public Admin() {
        super();
        adminName = "Administrator";
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    // Method Overriding (Polymorphism)
    @Override
    public boolean login(String username, String password) {
        return super.login(username, password);
    }

    public void displayAdminInfo() {
        System.out.println("Admin Name: " + adminName);
    }
}