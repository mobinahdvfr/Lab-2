/**
 * the Lab class represents a laboratory class with some students in a specific day and capacity
 * it has a list of students
 *
 * @author Mobina Hadavifar
 * @version 1.0
 */

public class Lab {

    //the lab's list of students
    private Student[] students;
    //the average of the students grades
    private int avg;
    //the lab's day
    private String day;
    //the lab's capacity
    private int capacity;
    //the current number of students
    private int currentSize;

    /**
     * creates an empty lab
     * @param cap the capacity of the laboratory
     * @param d the day of the laboratory
     */
    public Lab(int cap, String d) {
        capacity = cap;
        students = new Student[cap];
        day = d;
        currentSize =0;
        avg =0;
    }

    /**
     * adds a student to lab (if it's not full)
     * @param std the student we want to add to lab
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
            calculateAvg();
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * prints the students of the lab and the average of their grades
     */
    public void print() {
        for (int i = 0; i < currentSize ; i++) {
            System.out.println("std fname: " + students[i].getFirstName()
                    + " std id:" + students[i].getId()
                    + " std grade:"+ students[i].getGrade());
        }
        System.out.println("Lab AVG:" + avg);

    }

    /**
     * it returns the list of students
     * @return the array of students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * it returns the average of students grades
     * @return the average
     */
    public int getAvg() {
        return avg;
    }

    /**
     * returns the lab's day
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * returns the capacity of the lab
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * replace a new list of students with the current list
     * @param students new list of students
     */
    public void setStudents(Student[] students) {
        this.students = students;
        int i=0;
        for (Student s : students){
            if (s != null) {
                if (s.getClass().equals(Student.class)) {
                    i++;
                }
            }
        }
        currentSize = i;
    }

    /**
     * sets the lab's day
     * @param day lab's day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * sets the lab's capacity
     * @param capacity lab's capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * calculates the average of the students grades
     */
    public void calculateAvg() {
        int sum = 0;
        for (int i =0 ; i<currentSize ; i++){
            sum = students[i].getGrade() + sum;
        }
        avg = sum / currentSize;
    }
}

