public class Student {
    String Name;
    int Age;

    public Student(String n,int A){
        Name=n;
        Age=A;
    }

    void Display(){
        System.out.println("Name = "+Name);
        System.out.println("Age = "+Age);
    }
}

class College{
    public static void main(String args[] ){
        Student s=new Student("Jhon", 22);
        s.Display();
    }
}
