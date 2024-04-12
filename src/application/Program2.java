package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();

        System.out.println("\n=== TEST 1: department insert ====");
        Department newDepartment = new Department(null, "music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== TEST 2: department update ====");
        Department dep2 = departmentDao.findById(1);
        dep2.setName("Cellphone");
        departmentDao.update(dep2);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 3: department findByid ====");
        Department dep3 = departmentDao.findById(3);
        System.out.println(dep3);

        System.out.println("\n=== TEST 4: department findAll ====");
        List<Department> list = departmentDao.findAll();
        for( Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 4: department delete ====");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");



    }
}
