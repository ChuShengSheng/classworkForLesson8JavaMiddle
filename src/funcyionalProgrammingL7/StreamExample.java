package funcyionalProgrammingL7;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class StreamExample {
    public static void main(String[] args) {
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);

        var single = Stream.of("one");
        single.forEach(System.out::println);

        var array = Stream.of("one", "two", "three");
        array.forEach(System.out::println);

        var range = IntStream.range(1, 5);
        range.forEach(System.out::println);
    }

    private static void creating(){

    }

    private static void stringJoiner(){
        String[] strings = {"one", "two", "three"};
        var result = Arrays.stream(strings).collect(Collectors.joining(","));
        System.out.println(result);

        String result2 = String.join(",", strings);
        System.out.println(result2);
    }

    private static void filterMapReduce(){
        System.out.println("filterMapReduce");
        var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = list
                .stream()
                .filter(x -> x % 2 > 0)
                .map(x -> x * 10)
                .reduce(0, Integer::sum);
        System.out.println("result: " + result);

    }

    private static void streamConsumer(){
        Stream<Integer> intStream = List.of(1,2,3,4,5,6,7,8,9,10).stream();
        consume(intStream);
        consume(intStream);
    }

    private static void consume(Stream<Integer> stream){
        stream.forEach(System.out::println);
    }

    private static void flatMap(){
        var data = List.of(
                List.of(1,2,3,4,5),
                List.of(10,20,30,40,50),
                List.of(100,200,300,400,500)
        );

        var dataFlat = data.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(dataFlat);
    }

    private static void streamNotStarted(){
        var dataStream = List.of(1,2,3,4,5,6,7,8,9,10).stream()
                 .map(x -> x * 10)
                 .peek(System.out::println);

        dataStream.forEach(System.out::println);
    }

    private static void studentsStream(){
        var students = List.of(
          new Student("Ричард", 20, "Финансы и кредит", 4.5),
          new Student("Олег", 10, "Финансы и кредит", 4.6),
          new Student("Сергей", 4, "Финансы и кредит", 4.2),
          new Student("Петр", 33, "Финансы и кредит", 4.3)
        );

        var result = new ArrayList<Student>();
        //напечатать имена топ-студентов 5-го курса с оценкой больше 4, но по убыванию
        for (Student student : students){
            if (student.getAvgMark() > 4 && student.getAge() < 30){
                result.add(student);
            }
        }

        result.sort(((o1, o2) -> Double.compare(o2.getAvgMark(), o1.getAvgMark())));

        for (Student student : result){
            System.out.println(student.getName());
        }

        students.stream()
                .filter(student -> student.getAge() < 30)
                .filter(student -> student.getAvgMark() > 4)
                .sorted(Comparator.comparing(Student::getAvgMark).reversed())
                .peek(student -> System.out.println(student.getName()));
    }
}
