public class Main {

    public static void main(String[] args) {

        Student std1 = new Student("Ehsan","Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");

        //std1.print();
        std1.setGrade(15);
        //std1.print();

        //std2.print();
        std2.setGrade(11);
       // std2.print();

        //std3.print();
        std3.setFirstName("HamidReza");
        //std3.print();

        Lab lab = new Lab(15, "Saturday");
        lab.enrollStudent(std1);
        lab.enrollStudent(std2);
        lab.print();

//        for (Student s : lab.getStudents()){
//            if (s != null) {
//                if (s.getClass().equals(Student.class)) {
//                    System.out.println(1);
//                }
//            }
//        }



        Student[] students = new Student[3];
        Student std4 = new Student("Mobina" , "Hadavifar", "9831069");
        std4.setGrade(20); //:)
        Student std5 = new Student("a", "b", "9898098");
        std5.setGrade(6);
        Student std6 = new Student("c", "d", "9898031");
        std6.setGrade(13);
        students[0] = std4;
        students[1] = std5;
        students[2] = std6;

        lab.setStudents(students);
        lab.calculateAvg();
        lab.print();





    }

}
