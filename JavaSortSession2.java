import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class JavaSortSession2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(new Student(id, name, cgpa));
        }

        Collections.sort(students, (s1, s2) -> {
            if (Double.compare(s2.cgpa, s1.cgpa) != 0)
                return Double.compare(s2.cgpa, s1.cgpa); // CGPA descending
            else if (!s1.name.equals(s2.name))
                return s1.name.compareTo(s2.name);       // Name ascending
            else
                return Integer.compare(s1.id, s2.id);    // ID ascending
        });

        for (Student s : students) {
            System.out.println(s.name);
        }

        sc.close();
    }
}
