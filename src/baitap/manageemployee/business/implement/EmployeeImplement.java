package baitap.manageemployee.business.implement;

import baitap.manageemployee.business.config.CONSTANT;
import baitap.manageemployee.business.config.InputMethod;
import baitap.manageemployee.business.design.Manageable;
import baitap.manageemployee.business.entity.Employee;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EmployeeImplement implements Manageable
{
    private static Employee[] employeeList = new Employee[100];
    private static int listSize = 0;

    @Override
    public void addEmployee()
    {
        if (warningNoEmployee())
        {
            return;
        }
        if (listSize == 100)
        {
            System.out.println(CONSTANT.FULL_EMPLOYEE_WARNING);
            return;
        }
        Employee newEmployee = new Employee();
        newEmployee.inputData();
        employeeList[listSize] = newEmployee;
        listSize++;
    }

    @Override
    public void displayAllEmployee()
    {
        if (warningNoEmployee())
        {
            return;
        }
        for (int i = 0; i < listSize; i++)
        {
            System.out.println(CONSTANT.EMPLOYEE_ID + employeeList[i].getEmployeeId());
            System.out.println(CONSTANT.EMPLOYEE_NAME + employeeList[i].getEmployeeName());
        }
    }

    @Override
    public void displayEmployeeInfo()
    {
        if (warningNoEmployee())
        {
            return;
        }
        int index = searchById();
        if (index == -1)
            return;
        employeeList[index].displayData();
    }

    @Override
    public void updateEmployeeInfo()
    {
        if (warningNoEmployee())
        {
            return;
        }
        int index = searchById();
        if (index == -1)
            return;
        System.out.println("Mời nhập thông tin mới cho nhân viên");
        employeeList[index].inputData();
    }

    @Override
    public void deleteEmployee()
    {
        if (warningNoEmployee())
        {
            return;
        }
        int index = searchById();
        if (index == -1)
            return;
        for (int i = index; i < listSize - 1; i++)
        {
            employeeList[i] = employeeList[i + 1];
        }
        employeeList[listSize - 1] = null;
        listSize--;
        System.out.println("Đã xóa nhân viên");
    }

    @Override
    public void searchEmployeeByName()
    {
        warningNoEmployee();
        System.out.println("Mời nhập tên nhân viên muốn tìm");
        String searchName = InputMethod.nextLine();
        boolean isFound = false;
        for (int i = 0; i < listSize; i++)
        {
            String employeeName = employeeList[i].getEmployeeName();
            if (employeeName.contains(searchName))
            {
                System.out.println("Đã tìm thấy nhân viên có tên: " + employeeName);
                isFound = true;
            }
        }
        if (!isFound)
            System.out.println("Không tìm thấy nhân viên có tên tương ứng");
    }

    @Override
    public void sortEmployeeByName()
    {
        if (warningNoEmployee())
        {
            return;
        }
        Arrays.sort(employeeList, (employee1, employee2) ->
                employee1.getEmployeeName().compareToIgnoreCase(employee2.getEmployeeName())
        );
        for (int i = 0; i < listSize; i++)
        {
            System.out.print("Mã nhân viên: " + employeeList[i].getEmployeeId()
                    + " | Tên nhân viên: " + employeeList[i].getEmployeeName() + " \n");
        }
    }

    private static boolean warningNoEmployee()
    {
        if (listSize == 0)
        {
            System.out.println(CONSTANT.NO_EMPLOYEE_WARNING);
            return true;
        }
        return false;
    }

    private static int searchById()
    {
        System.out.println("Nhập mã nhân viên muốn tìm");
        int searchId = InputMethod.nextInt();
        for (int i = 0; i < listSize; i++)
        {
            if (searchId == employeeList[i].getEmployeeId())
            {
                return i;
            }
        }
        System.out.println("Không tìm thấy nhân viên");
        return -1;
    }
}
