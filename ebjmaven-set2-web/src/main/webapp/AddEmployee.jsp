<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/3/2023
  Time: 8:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    .col {
        width: 100%;
    }
    .float-left {
        float: left !important;
    }
    .display-block {
        display: block;
    }
</style>
<body>
        <div class="col float-left display-block">
            <form method="post" action="employee">
                <input name="EmployeeId"    type="text"      placeholder="Employee Id">
                <input name="EmpName"       type="text"      placeholder="Employee Name">
                <input name="in_Company"    type="text"      placeholder="Add to Company">
                <input name="not_in_Company"   type="text"      placeholder="Add without Company">
                <input name="CompanyId"     type="text"      placeholder="Company Id">
                <input name="CompanyName"   type="text"      placeholder="Company Name">
            </form>
        </div>
</body>
</html>
