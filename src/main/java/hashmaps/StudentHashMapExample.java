package hashmaps;
import java.util.HashMap;
//public class Map8Students {
    class Student {
        private String firstName;
        private String lastName;
        private double gpa;

        public Student(String firstName, String lastName, double gpa) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gpa = gpa;
        }

        // Getters and setters for attributes (firstName, lastName, gpa)

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", gpa=" + gpa +
                    '}';
        }
    }

    public class StudentHashMapExample {
        public static void main(String[] args) {
            // Create a HashMap of students
            HashMap<String, Student> studentHashMap = new HashMap<>();
            studentHashMap.put("John", new Student("John", "Doe", 3.8));
            studentHashMap.put("Alice", new Student("Alice", "Smith", 3.5));
            // Add more students as needed

            // Test the getStudentByName method
            String studentName = "John";
            Student foundStudent = getStudentByName(studentName, studentHashMap);

            if (foundStudent != null) {
                System.out.println("Student found: " + foundStudent);
            } else {
                System.out.println("Student not found with name: " + studentName);
            }
        }

        private static Student getStudentByName(String name, HashMap<String, Student> studentHashMap) {
            return studentHashMap.get(name);
        }
    }
