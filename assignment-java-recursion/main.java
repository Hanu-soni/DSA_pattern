class Student {

    String name;
    int age;

    public void introduce() {
        System.out.println("My name is "+ name +"and I am "+age);
    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student();

        Student s3 = new Student();
         s1.name = "Pankaj";
        s1.age = 22;

        s2.name = "Rahul";
        s2.age = 23;

        s3.name = "Amit";
        s3.age = 21;

        s1.introduce();
        s2.introduce();
        s3.introduce();

    }

}

