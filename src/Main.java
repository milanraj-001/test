public class Main {

    public static void main(String[] args) {


                Student studentone = new Student("maxx",19,'A');
                Student studenttwo = new Student("john",19,'B');
                Student studentthree = new Student("david",19,'C');

                Student[] students= {studentone,studenttwo,studentthree};

                for (Student student: students){
                    student.display();

                }

    }

}