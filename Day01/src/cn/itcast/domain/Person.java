package cn.itcast.domain;

public class Person {
    private String name;
    private int age;

    public String a;

    public Person(){

    }

    public void eat(){
        System.out.println("ear............");
    }

    public void eat(String ford){
        System.out.println("eat........"+ford);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                '}';
    }
}
