public class Student {

        public String name ;
        public  int age ;
        public char  grade;

        public Student (String name , int age , char grade ){
            this.name=name;
            this.age=age;
            this.grade=grade;

        }
        public void display(){
            System.out.println("name :  "+name);
            System.out.println("age:  "+age);
            System.out.println("grade: "+grade);
        }
    }

