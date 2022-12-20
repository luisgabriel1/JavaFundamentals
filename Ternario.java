package Udemy;

public class Ternario {
    public static void main(String[] args) {

        double  StudentGrade= 4.9;
        double SchoolAverage = 7.5;

        String ResultPartialOfStudent= StudentGrade >= 5.0 ? "The student are of recuperation" : "Student are disapproved ";

        String ResultFinalOfStudent = StudentGrade >= SchoolAverage ? "Okay" : ResultPartialOfStudent;
        System.out.println("The student are : " + ResultFinalOfStudent);
    }
}
