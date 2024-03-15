package baitap.manageemployee.presentation;

import baitap.manageemployee.business.config.InputMethod;
import baitap.manageemployee.business.design.Manageable;
import baitap.manageemployee.business.implement.EmployeeImplement;

public class EmployeeManageMent
{
    public static Manageable employeeManagement = new EmployeeImplement();

    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("=============EMPLOYEE-MANAGEMENT===============");
            System.out.println("1. Thêm mới 1 nhân viên");
            System.out.println("2. Hiển thị danh sách thông tin nhân viên");
            System.out.println("3. Xem thông tin nhân viên theo mã nhân viên");
            System.out.println("4. Cập nhật thông tin nhân viên");
            System.out.println("5. Xóa nhân viên");
            System.out.println("6. Tìm nhân viên theo tên");
            System.out.println("7. Sắp xếp và hiển thị danh sách nhân viên theo thứ tự a-z");
            System.out.println("8. Thoát");
            System.out.println("Mời nhập thao tác mong muốn theo các số từ 1-8");
            switch (InputMethod.scanner.nextInt())
            {
                case 1:
                    employeeManagement.addEmployee();
                    break;
                case 2:
                    employeeManagement.displayAllEmployee();
                    break;
                case 3:
                    employeeManagement.displayEmployeeInfo();
                    break;
                case 4:
                    employeeManagement.updateEmployeeInfo();
                    break;
                case 5:
                    employeeManagement.deleteEmployee();
                    break;
                case 6:
                    employeeManagement.searchEmployeeByName();
                    break;
                case 7:
                    employeeManagement.sortEmployeeByName();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không khả dụng");
                    break;
            }
        }
    }
}
