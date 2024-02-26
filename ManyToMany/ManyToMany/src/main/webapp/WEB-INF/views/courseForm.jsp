<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Course Form</title>
</head>
<body>
    <h2>Course Form</h2>

    <form action="add">

        <label for="courseId">Course ID:</label>
        <input type="number" id="courseId" name="courseId" required>
        <br>

        <label for="courseName">Course Name:</label>
        <input type="text" id="courseName" name="courseName" required>
        <br>
        <input type="submit" value="Save">
    </form>
</body>
</html>

