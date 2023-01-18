public class Main {
    public static void main(String[] args) {
        // Create an object named 's1' and complete the code to print the desired output.
        Student s1 = new Student("karan", 1056, 8.8);
        s1.displayProfile();
        System.out.println("Percentage of s1 is " + s1.findPercentage());
    }
}

class Student {

    public int rollno;
    public String name;
    public double cgpa;

    // Declare constructor of 'Student' class here
    public Student(String name, int rollno, double cgpa) {
        this.name = name;
        this.rollno = rollno;
        this.cgpa = cgpa;
    }

    public void displayProfile() {
        System.out.println(rollno + " " + name + " " + cgpa);
    }

    public double findPercentage() {
        double percent = cgpa * 10;
        return percent;
    }
}