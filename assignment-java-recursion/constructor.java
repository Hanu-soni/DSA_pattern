class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public void introduce() {
        System.out.println(name+" "+age);

    }

}

public class constructor {

    public static void main(String[] args) {

        Student s1 = new Student("Pankaj", 23);
        Student s2 = new Student("Rahul", 20);
        Student s3 = new Student("Ankit", 22);

        s1.introduce();
        s2.introduce();
        s3.introduce();

    }
}

