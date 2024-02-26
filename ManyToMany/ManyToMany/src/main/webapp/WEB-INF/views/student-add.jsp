<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
    <h2>Add Student</h2>
    <form action="<c:url value='/students/add' />" method="post" modelAttribute="student">
        <label for="studentId">Course Name:</label>
        <input type="text" id="studentId" name="studentId" required>
        <label for="studentName">Course Name:</label>
        <input type="text" id="studentName" name="studentName" required>
        <br>
        <input type="submit" value="Add Student">
    </form>
    <br>
    <a href="<c:url value='/courses/list' />">Back to Course List</a>
</body>
</html>
