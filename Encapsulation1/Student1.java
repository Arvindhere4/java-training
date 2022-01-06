package Encapsulation1;

class Student1 {
    private String name;
    private int age;
    private String email;
    private String address;

    Student1() {
        age = 22;
        name = "Aravind";
        email = "aravind@gmail.com";
        address = "xyxabc";
    }

    public void setName() {
        name = "Aravind";
    }

    public String getName() {
        return name;
    }

    public void setAge() {
        age = 22;
    }

    public int getAge() {
        return age;
    }

    public void setEmail() {
        email = "aravind@gmail.com";
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

}

class Teacher {
    private String name;
    private int age;
    private String email;
    private String address;

    Teacher() {
        name = "xyz";
        age = 45;
        email = "xyz@gmail.com";
        address = "abcdabcd";
    }

    public void setName() {
        name = "xyz";
    }

    public String getName() {
        return name;
    }

    public void setAge() {
        age = 45;
    }

    public int getAge() {
        return age;
    }

    public void setEmail() {
        email = "xyz@gmail.com";
    }

    public String getEmail() {
        return email;
    }

    public void setAddress() {
        address = "abcdabcd";
    }

    public String getAddress() {
        return address;
    }

}

class Batch {
    private String name;
    private int size;
    private Student1[] Student;
    private Teacher Teacher;

 Batch()
 {
 name="abcd";
 size=10;

 }

    public void setName() {
        name = "abcd";
    }

    public String getName() {
        return name;
    }

    public void setSize() {
        size = 10;
    }

    public int getSize() {
        return size;
    }

    public void setStudents(int Students) {
    this.Students=Students;
    }
    public int getStudents() {
        
        return Students;
    }
    

    

    public void setTeacher() {
        Object Teacher;
        Teacher = "pqr";
    }

    public Teacher getTeacher() {
        return Teacher;
    }
}

class Encapsulation1 {
    public static void main(String[] args) {
        Student1 S = new Student1();
        Teacher T = new Teacher();
        Batch B = new Batch();
        System.out.println("Student age:" + S.getAge() + "Student Name:" + S.getName() + "Student email:" + S.getEmail()
                + "Student address:" + S.getAddress());
        System.out.println("Teacher age:" + T.getAge() + "Teacher Name:" + T.getName() + "Teacher email:" + T.getEmail()
                + "Teacher address:" + S.getAddress());
        System.out.println("Batch size:" + B.getSize() + "Batch Name:" + B.getName() + "Students :" + B.getStudents()
                + "Teacher:" + B.getTeacher());

    }
}
