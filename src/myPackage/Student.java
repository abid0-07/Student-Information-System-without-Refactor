package myPackage;

public abstract class Student {
    private String name;
    private String department;
    protected String id;
    private String email;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }


    public void setDepartment(){
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public abstract void setId(String id);

    public String getEmail() {
        return email;
    }

   public  void setEmail(){}

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void display(){
        System.out.println("\t\t-------------------------------");
        System.out.println("\t\t\tStudent Information");
        System.out.println("\t\t-------------------------------");
        System.out.println("\t\tStudent Name: "+getName());
        System.out.println("\t\tDepartment: "+getDepartment());
        System.out.println("\t\tStudent ID: "+getId());
        System.out.println("\t\tEmail: "+getEmail());
        System.out.println("\t\tPhone Number: "+getPhoneNumber());
        System.out.println("\t\t-------------------------------");
        courseList();
        System.out.println("\t\t-------------------------------");
    }
    public abstract void courseList();



    //public abstract void setEmail();
}
