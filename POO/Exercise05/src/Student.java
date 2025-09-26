public class Student {
    private String name;
    private int registration;
    private String course;

    public Student(String name, int registration, String course){
        this.name = name;
        this.registration = registration;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString(){
        return "Aluno: " + name + "\nMatrícula: " + registration + "\nCurso: " + course;
    }
}
