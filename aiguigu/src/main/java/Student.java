public class Student {
    private String name;
    private Integer age;
    private static String school = "atguigu";  // static 静态，所有学生school都是一样的

    public Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println(this.name + " " + this.age + " " + Student.school);
    }

    public static void main(String[] args) {
        Student alice = new Student("alice", 20);
        Student bob = new Student("bob", 23);
        alice.printInfo();
        bob.printInfo();
    }

}
