package P26encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);
        System.out.println("Prime's name:" + obj.getName());
        System.out.println("prime's age:" + obj.getAge());
        System.out.println("Prime's rollNo:" + obj.getRollNo());

    }
}
