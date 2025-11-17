public class Student {
    private int StudentID;
    private String StudentName;
    private double StudentGPA;
    public Student(int StudentID, String StudentName, double StudentGPA) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.StudentGPA = StudentGPA;
    }
    public Student(){
        this.StudentID=0;
        this.StudentName="Alexandra";
        this.StudentGPA=2.0;
    }
    public String getStudentName() {
        return StudentName;
    }
    public double getStudentID(){
        return StudentID;
    }
    public double getStudentGPA(){
        return StudentGPA;
    }

    public static void main(String [] args){
        Student student=new Student();
        System.out.println(student.getStudentName());
        System.out.println(student.getStudentID());
        System.out.println(student.getStudentGPA());
        System.out.println("**************");
        Student student2=new Student(1001,"Alexandra",2.0);
        System.out.println(student2.getStudentName());
        System.out.println(student2.getStudentID());
        System.out.println(student2.getStudentGPA());
    }

}
