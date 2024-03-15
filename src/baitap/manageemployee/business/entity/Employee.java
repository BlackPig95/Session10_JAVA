package baitap.manageemployee.business.entity;

import baitap.manageemployee.business.config.CONSTANT;
import baitap.manageemployee.business.config.InputMethod;

import java.util.Date;

public class Employee
{
    private int employeeId = 1;
    private String employeeName, address;
    private Date employeeDob;
    private int phone;
    private double basicSalary, KPI;

    public Employee()
    {
        this.employeeId++;
    }

    public Employee(int employeeId, String employeeName, Date employeeDob, String address, int phone, double basicSalary, double KPI)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDob = employeeDob;
        this.address = address;
        this.phone = phone;
        this.basicSalary = basicSalary;
        this.KPI = KPI;
        this.employeeId++;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    public Date getEmployeeDob()
    {
        return employeeDob;
    }

    public void setEmployeeDob(Date employeeDob)
    {
        this.employeeDob = employeeDob;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getPhone()
    {
        return phone;
    }

    public void setPhone(int phone)
    {
        this.phone = phone;
    }

    public double getBasicSalary()
    {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary)
    {
        this.basicSalary = basicSalary;
    }

    public double getKPI()
    {
        return KPI;
    }

    public void setKPI(double KPI)
    {
        this.KPI = KPI;
    }

    public void inputData()
    {
        System.out.println(CONSTANT.INPUT_NAME_MESSAGE);
        this.employeeName = InputMethod.nextLine();
        System.out.println(CONSTANT.INPUT_DOB_MESSAGE);
        this.employeeDob = InputMethod.nextDate();
        System.out.println(CONSTANT.INPUT_ADDRESS_MESSAGE);
        this.address = InputMethod.nextLine();
        System.out.println(CONSTANT.INPUT_PHONE_MESSAGE);
        this.phone = InputMethod.nextInt();
        System.out.println(CONSTANT.INPUT_SALARY_MESSAGE);
        this.basicSalary = InputMethod.nextDouble();
        System.out.println(CONSTANT.INPUT_KPI_MESSAGE);
        this.basicSalary = InputMethod.nextDouble();
    }

    public void displayData()
    {
        System.out.println(CONSTANT.EMPLOYEE_ID + this.employeeId);
        System.out.println(CONSTANT.EMPLOYEE_NAME + this.employeeName);
        System.out.println("Ngày sinh: " + this.employeeDob);
        System.out.println("Địa chỉ: " + this.address);
        System.out.println("Số điện thoại: " + this.phone);
        System.out.println("Lương cơ bản: " + this.basicSalary);
        System.out.println("Hệ số lương: " + this.KPI);
    }
}
