package myPackage;

public class CSE extends Student{
    private int numberOfPrimaryCourses;
    private int numberOfPreparatoryCourses;
    private int credit;


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
        numberOfPrimaryCourses = 2;
        numberOfPreparatoryCourses = 3;
        credit = 3;
    }
    @Override
    public void semesterFee(){
        float preparatoryCourseFee = 3000.0f;
        float primaryCourseFee = 4000.0f;
        System.out.println("\t\tPreparatory Course FEE: " + preparatoryCourseFee);
        System.out.println("\t\tPrimary Course FEE: " + primaryCourseFee);
        float totalFee = (numberOfPrimaryCourses * credit * primaryCourseFee) +
                (numberOfPreparatoryCourses * credit * preparatoryCourseFee);
        System.out.println("\t\tSemester fee: " +totalFee);
    }


}
