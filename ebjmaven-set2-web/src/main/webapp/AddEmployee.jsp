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
    <title>Employee Form</title>
    <%--Bootstrap --%>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: sans-serif;
            background: #f2f2f2;
        }
        .formStyle {
            background: #fff;
            max-width: 500px;
            margin: 50px auto;
            padding: 20px;
            box-shadow: 0px 0px 20px rgba(0,0,0,0.1);
            border-radius: 5px;
        }
        .formStyle h2 {
            text-align: center;
            margin-bottom: 20px;
            font-weight: 600;
        }
        .formStyle .form-control {
            border-radius: 0;
            border: none;
            border-bottom: 1px solid #999;
            box-shadow: none;
            padding-left: 0;
            padding-right: 0;
        }
        .formStyle label {
            font-weight: 600;
            margin-bottom: 10px;
        }
        .formStyle input[type=submit] {
            background: #0062cc;
            color: #fff;
            border-radius: 20px;
            border: none;
            padding: 10px 20px;
            font-weight: 600;
            transition: all 0.3s ease;
            margin-top: 20px;
        }
        .formStyle input[type=submit]:hover {
            background: #004798;
        }
    </style>
</head>
<%--Bootstrap --%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<body>
    <form action="employee" method="post" class="formStyle">
        <p class="row">
            <label class="col-4">Employee Id:</label>
            <input name="employeeId" type="text" placeholder="Input Employee ID" class="col-7">
        </p>
        <p class="row">
            <label class="col-4">Employee Name:</label>
            <input name="employeeName" type="text" placeholder="Input Employee Name" class="col-7">
        </p>
        <p class="row">
            <label class="col-4">Add Employee existing in Company table:</label>
            <input name="companyName" type="text" placeholder="Input Company Name" class="col-7">
        </p>
        <p class="row">
            <label class="col-10">Add Employee without in Company table:</label>
        </p>
        <p class="row">
            <label class="col-4">Company Id:</label>
            <input name="companyId" type="text" placeholder="Input Company ID" class="col-7">
        </p>
        <p class="row">
            <label class="col-4">Company Name:</label>
            <input name="companyName" type="text" placeholder="Input Company Name" class="col-7">
        </p>
        <p class="text-center">
            <input type="submit" name="action" value="ADD" placeholder="Submit">
        </p>
    </form>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
