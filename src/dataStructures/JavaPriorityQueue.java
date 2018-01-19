package dataStructures;

import java.util.*;

public class JavaPriorityQueue {
    /**
     * https://www.hackerrank.com/challenges/java-priority-queue/submissions
     */
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student2> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student2 st : students) {
                System.out.println(st.getName());
            }
        }
    }
}

class Student2 implements Comparable {
    private int id;
    private String name;
    private double cgpa;

    public Student2(int id, String fname, double cgpa) {
        this.id = id;
        this.name = fname;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + cgpa;
    }

    @Override
    public int compareTo(Object obj) {
        Student2 o1 = this;
        Student2 o2 = (Student2) obj;
        if (o1.getCGPA() != o2.getCGPA()) return o1.getCGPA() < o2.getCGPA() ? 1 : -1;
        if (!o2.getName().equals(o1.getName())) return o1.getName().compareTo(o2.getName());
        return o1.getID() - o2.getID();
    }
}

class Priorities {

    List<Student2> getStudents(List<String> events) {

        PriorityQueue<Student2> prQ = new PriorityQueue<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                if (o1.getCGPA() != o2.getCGPA()) return o1.getCGPA() < o2.getCGPA() ? 1 : -1;
                if (!o2.getName().equals(o1.getName())) return o1.getName().compareTo(o2.getName());
                return o1.getID() - o2.getID();
            }
        });

        for (String event : events) {

            String[] eventLine = event.split(" ");
            String eventType = eventLine[0];

            if (eventType.equals("ENTER")) {
                String studentName = eventLine[1];
                double studentCGPA = Double.parseDouble(eventLine[2]);
                int studentId = Integer.parseInt(eventLine[3]);

                prQ.add(new Student2(studentId, studentName, studentCGPA));

            } else {
                prQ.poll();
            }
        }

        List<Student2> result = new ArrayList<>(prQ);
        Collections.sort(result);
        return result;
    }
}
