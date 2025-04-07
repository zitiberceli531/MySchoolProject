public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int index) {
        if (index >= 0 && index < students.size()) {
            students.remove(index);
        }
    }

    public int countStudents() {
        return students.size();
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }
}
