//복제 clone 메소드

class Student implements Cloneable{
    String name;
    Student(String name) {
        this.name = name;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class Main{

    public static void main(String[] args){
        Student s1 = new Student("egoing");
        try {
            Student s2 = (Student) s1.clone();
            System.out.println(s1.name);
            System.out.println(s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
