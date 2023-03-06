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
            Employee employee = getEmployee(req);
            if (employeeBean.addEmployee(employee)) {
                req.getServletContext().getRequestDispatcher("/AddEmployee.jsp").include(req, resp);
                resp.getWriter().write("Add Emmployee Success.");
            } else {
                resp.getWriter().write("Add Emmployee Fail.");
            }

        }
    }

    private static Employee getEmployee(HttpServletRequest request){
        String employeeId = request.getParameter("employeeId");
        String employeeName = request.getParameter("employeeName");
        String companyId = request.getParameter("companyId");
        String companyName = request.getParameter("companyName");

        Employee employee = new Employee();
        employee.setEmployeeId(employeeId);
        employee.setEmployeeName(employeeName);

        Company company = new Company();
        company.setCompanyId(companyId);
        company.setCompanyName(companyName);

        EmployeeCompany employeeCompany = new EmployeeCompany();
        employeeCompany.setEmployee(employee);
        employeeCompany.setCompany(company);


        return employee;
    }
}
