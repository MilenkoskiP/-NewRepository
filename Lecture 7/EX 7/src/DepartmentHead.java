public class DepartmentHead extends Professor implements Administrator {
    private  String departmentName;


    public DepartmentHead(String id, String name, String departmentName) {
        super(id, name);
        this.departmentName = departmentName;
    }

    @Override
    public void manageDepartment(String departmentName){
        this.departmentName = departmentName;
        System.out.println(getName() + "is now managing the " + departmentName + " department.");
    }

    @Override
    public String getRole(){
        return super.getRole() + ", Department Head";
    }

    public void displayDepartment() {
        System.out.println(getName() + " manages the" + departmentName + " department.");
    }
}