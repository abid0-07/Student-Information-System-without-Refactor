package myPackage;

public class SWE extends Student {
    @Override
    public String getDepartment(){
        return ("Software Engineering");
    }

    @Override
    public void setId(String id){
        this.id = ("SWE" +id);
    }
    @Override
    public String getEmail(){
        String email = (getName()+"-"+getId()+"@xyz.edu.bd");
        return email.toLowerCase();
    }
    @Override
    public void courseList(){
        System.out.println("Registered Courses are: ");
        System.out.println("Course 1: Introduction to Software Engineering");
        System.out.println("Course 2: Computer Fundamentals");
        System.out.println("Course 3: English Language");
        System.out.println("Course 4: Mathematics-I");
        System.out.println("Course 5: Physics");
        System.out.println("Total registered course 5");
    }

   // @Override
   /* public void setEmail(){
        String name = getName();
        String id = getId();
        String email = (name.concat(id));
        this.email = (email.concat("@xyz.edu.bd"));
    }*/
}
