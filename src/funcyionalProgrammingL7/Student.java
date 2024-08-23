package funcyionalProgrammingL7;

public class Student {
    private String name;
    private int age;
    private String course;
    private double avgMark;

    public Student(String name, int age, String course, double avgMark) {

        this.name = name;
        this.age = age;
        this.course = course;
        this.avgMark = avgMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    public double getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }
}
