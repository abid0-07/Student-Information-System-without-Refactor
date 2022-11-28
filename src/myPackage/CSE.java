package myPackage;

public class CSE extends Student{
//    @Override
//    public void setDepartment(){
//        this.setDepartment("Computer Science and Engineering");
//    }
    @Override
    public String getDepartment(){
        return "Computer Science and Engineering";
    }

    @Override
    public void setId(String id){
        this.id = ("CSE" + id);
    }
    @Override
    public String getEmail(){
        String email = (getName()+"-"+getId()+"@xyz.edu.bd");
        return email.toLowerCase();
    }

    @Override
    public void courseList() {
        System.out.println("\t\t\tRegistered Courses");
        System.out.println("\t\t-------------------------------");
        System.out.println("\t\tCourse 1: Introduction to Computer Programming");
        System.out.println("\t\tCourse 2: Computer Fundamentals");
        System.out.println("\t\tCourse 3: English Language");
        System.out.println("\t\tCourse 4: Mathematics and Geometry");
        System.out.println("\t\tCourse 5: Basic Physics");
        System.out.println("\t\tTotal registered course 5");
    }


//    @Override
//    public void setEmail(){
//        String name = getName();
//        String id = getId();
//        String nameID = (name.concat(id));
//        String email = nameID.concat("@xyz.edu.bd");
//        this.setEmail(email);
//    }
//    public void courseSelection(){
//
//        System.out.println("Prerequisite courses are selected Automatically");
//
//    }

}
