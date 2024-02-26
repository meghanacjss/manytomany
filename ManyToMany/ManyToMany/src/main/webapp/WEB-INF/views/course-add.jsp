<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Course</title>
</head>
<body>
    <h2>Add Course</h2>
    <form action="<c:url value='/courses/add' />" method="post" modelAttribute="course">
        <label for="courseId">Course Name:</label>
        <input type="text" id="courseId" name="courseId" required>
        <label for="courseName">Course Name:</label>
        <input type="text" id="courseName" name="courseName" required>
        <br>
        <input type="submit" value="Add Course">
    </form>
    <br>
    <a href="<c:url value='/courses/list' />">Back to Course List</a>
</body>
</html>
