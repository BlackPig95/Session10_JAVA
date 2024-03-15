package baitap.docs.bai2;

import java.util.Scanner;

public class StudentManager
{
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        StudentManager manager = new StudentManager();
        manager.startApplication();
    }

    public void startApplication()
    {
        // Khởi tạo sinh viên
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        //Nhập thông tin cho sinh viên
//        student1.setName("Nguyễn Văn Nam");
//        student1.setAge(19);
//        student1.setAddress("HN");
//        displayStudentInfo(student1);
//        student2.setName("Trần Thùy Trang");
//        student2.setAge(18);
//        student2.setAddress("TH");
//        student3.setName("Tống Mạnh Hùng");
//        student3.setAge(18);
//        student3.setAddress("ND");
        //-----------------------------------
//Tạo một phương thức inputInfo để nhập thông tin nhanh chóng hơn
        //Thêm câu dẫn để đỡ nhầm lẫn thông tin khi nhập
        System.out.println("Nhập thông tin sinh viên 1");
        student1.inputInfo();
        System.out.println("Nhập thông tin sinh viên 2");
        student2.inputInfo();
        System.out.println("Nhập thông tin sinh viên 3");
        student3.inputInfo();

        //Hiển thị thông tin sinh viên
        displayStudentInfo(student1);
        displayStudentInfo(student2);
        displayStudentInfo(student3);
    }

    private void displayStudentInfo(Student student)//Đổi tên method cho đỡ dài và mô tả đúng chức năng của method
    {                                                       //Tên cũ: displayStudentOfRikkeiAcademy
        System.out.println("------------------------------------------");
        System.out.println("     Thông tin Sinh Viên");
        System.out.println("Tên Sinh Viên : " + student.getName());
        System.out.println("Tuổi          : " + student.getAge());
        System.out.println("Địa chỉ       : " + student.getAddress());
    }
}

class Student
{
    private String name;
    private int age;

    private String address;//Viết tên biến đầy đủ từ add thành address cho dễ hiểu

    public Student()
    {
    }

    public Student(String name, int age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getAddress()//Đổi tên method khớp với tên biến
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void inputInfo()
    {
        System.out.println("Nhập tên");
        this.name = StudentManager.scanner.nextLine();
        System.out.println("Nhập tuổi");
        this.age = Integer.parseInt(StudentManager.scanner.nextLine());
        System.out.println("Nhập địa chỉ");
        this.address = StudentManager.scanner.nextLine();
    }
}