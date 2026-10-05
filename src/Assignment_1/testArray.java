package Assignment_1;

public class testArray {

    private static final String[] students = new String[10];
    public static int numOfStudents = 0;

    public static void addStudent(String student_name){
        students[numOfStudents]=student_name;
        numOfStudents++;
        System.out.println(student_name+" Has been added!");
    }

    public static void drop(String student){
        for (int i = 0; i < numOfStudents; i++){

            if (students[i].equals(student)){

                for (int j = i; j < numOfStudents - 1; j++){
                    students[j] = students[j + 1];
                }
                students[numOfStudents - 1] = null;

                numOfStudents--;

                System.out.println("Student was removed");
                return;

            }else {
                System.out.println("Not Found");
            }
        }
    }

    public static void displayStudents(){
        System.out.println("============ Students ================");
        for (int i=0;i<numOfStudents;i++){
            System.out.println(students[i]);
        }
    }

    static void main(String[] args) {
        addStudent("Mohamett");
        addStudent("Xuseen");
        addStudent("Khadro");
        displayStudents();
        drop("Xuseen");
        displayStudents();
        drop("khadro");
        displayStudents();
    }
}
