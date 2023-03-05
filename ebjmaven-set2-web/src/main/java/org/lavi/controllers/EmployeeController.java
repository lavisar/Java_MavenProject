package org.lavi.controllers;

import org.lavi.entities.Company;
import org.lavi.entities.Employee;
import org.lavi.entities.EmployeeCompany;
import org.lavi.enums.Action;
import org.lavi.services.EmployeeBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmployeeController", value = "employee")
public class EmployeeController extends HttpServlet {
    @EJB  // auto add from EJB
    EmployeeBean employeeBean;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (Action.ADD.toString().equalsIgnoreCase(action)) {

        }
    }

    private static Employee getEmployee(HttpServletRequest request){
        String EmpId         = request.getParameter("EmployeeId");
        String EmpName       = request.getParameter("EmpName");
        String is_company    = request.getParameter("in_Company");
        String not_company   = request.getParameter("not_in_Company");
        String companyId     = request.getParameter("CompanyId");
        String companyName   = request.getParameter("CompanyName");

        Employee employee = new Employee();

        employee.setEmployeeId(EmpId);
        employee.setEmployeeName(EmpName);

        Company company = new Company();

        company.setCompanyId(companyId);
        company.setCompanyName(companyName);

        // Chưa hiểu rõ yêu cầu đề bài



        return null;
    }
}
