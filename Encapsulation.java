
 public class Student
{
  private String name;
  private int age;
  private String email;
  private String address;

 Student()
 {
   age=22;
   name="Aravind";
   email="aravind@gmail.com";
   address="xyxabc";
 }
 
public void setName()
 {
 name="Aravind";
 }
public String getName()
{ 
return name;
}
public void setAge()
{
age=22;
}
public int getAge()
{
return age;
}
public void setEmail()
{
email="aravind@gmail.com";
}
public String getEmail()
{
return email;
}
public String getAddress()
{
return address;
}

}




public class Teacher
{
	 private String name;
	  private int age;
	  private String email;
	  private String address;

	  Teacher()
	  {
	   name= "xyz";
	   age= 45;
	   email="xyz@gmail.com";
	   address="abcdabcd";
	   }
	  public void setName()
	   {
	   name="xyz";
	   }
	   public String getName()
	   {
	   return name;
	   }
	   public void setAge()
	   {
	   age= 45;
	   }
	   public int getAge()
	   {
	   return age;
	   }
	   public void setEmail()
	   {
	   email="xyz@gmail.com";
	   }
	   public String getEmail()
	   {
	   return email;
	   }
	   public void setAddress()
	   {
	   address="abcdabcd";
	   }

	   public String getAddress()
	   {
	   return address;
	   }	   
	   
}


class Batch
{
 private String name;
 private int size;
 private Student[] Student;
 private Teacher Teacher;

 Batch()
 {
 name="abcd";
 size=10;
 Student={10, 20, 30};
 Teacher="pqrst";
 }
 public void setName()
 {
 name="abcd";
 }
 public String getName()
 {
 return name;
 }
 public void setSize()
 {
 size= 10;
 }
 public int getSize()
 {
 return size;
 }
 public void setStudents()
 {
 Object Students;
Students={10,20,30};
 }
 public Student[] getStudent()
 {
  for(int i=0; i<Students.length-1; i++)
  return Student[i];
  }
 public void setTeacher()
 {
  Teacher="pqrst";
  }
 public Teacher getTeacher()
 {
 return Teacher;
 }
}



public class Encapsulation
{
public static void main(String[] args)
  {
  Student S=new Student();
  Teacher T=new Teacher();
  Batch B=new Batch();
  System.out.println("Student age:"+ S.getAge()+ "Student Name:"+ S.getName()+"Student email:"+S.getEmail()+ "Student address:"+S.getAddress());
  System.out.println("Teacher age:"+ T.getAge()+ "Teacher Name:"+ T.getName()+"Teacher email:"+T.getEmail()+ "Teacher address:"+S.getAddress());
  System.out.println("Batch size:"+ B.getSize()+ "Batch Name:"+ B.getName()+"Students :"+B.getStudents()+ "Teacher:"+B.getTeacher());

  }
}
