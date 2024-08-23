package funcyionalProgrammingL7;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

    }

    private static void beforeOptional(){
        var student = getStudent();
        if (student != null) {
            var name = student.getName();
            if (name != null) {
                System.out.println("Student name is: " + name);
            }
        }
    }

    private static void optionalIncorrect(){
        var student = Optional.ofNullable(getStudent());

        if (student.isPresent()) {
            var name = student.get().getName();
            if (name != null) {
                System.out.println("Student name is: " + name);
            }
        }
    }

    private static void optionalCorrect(){
        var student = Optional.ofNullable(getStudent());

        student
                .map(Student::getName)
                .map(String::toUpperCase)
                .ifPresentOrElse(
                        name -> System.out.println("Student name is: " + name),
                        () -> {
                            throw new RuntimeException("Student name is incorrect");
                        }
                );
    }

    private static Student getStudent(){
        return new Student("Ричард", 20, "Финансы и кредит", 4.5);
    }
}
