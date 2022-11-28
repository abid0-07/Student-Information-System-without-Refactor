package myPackage;



public class ITM extends Student {
    @Override
    public String getDepartment(){
        return "Information Technology and Management";
    }

    @Override
    public void setId(String id){
        this.id = ("ITM" +id);
    }
    @Override
    public String getEmail(){
        String email = (getName()+"-"+getId()+"@xyz.edu.bd");
        return email.toLowerCase();
    }
    @Override
    public void courseList(){
        System.out.println("Registered Courses are: ");
        System.out.println("Course 1: Structure Programming");
        System.out.println("Course 2: Computer Fundamentals");
        System.out.println("Course 3: Functional English");
        System.out.println("Course 4: Introduction to Statistics");
        System.out.println("Course 5: Business Mathematics");
        System.out.println("Total registered course 5");
    }

    /*@Override
    public void setEmail(){
        String name = getName();
        String id = getId();
        String email = (name.concat(id));
        this.email = (email.concat("@xyz.edu.bd"));
    }*/
}
