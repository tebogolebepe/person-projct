public class Person {
    String name;
    int age;
    String gender;
    String interests[];

    public Person(String name, int age, String gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }
    public String hello() {
        return ("Hello my name is " + name+" and i am "+ age+
                " years old " + gender + " .My interest are " +interests[0]+ " and " +interests[1]);
    }
}