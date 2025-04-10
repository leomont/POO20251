package Modulo5;

public class gradeBook {

    String courseName = "";

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void displayMessage(String courseName){
        System.out.println("Welcome to the gradebook class");
    }

    public gradeBook() {
    }

}
