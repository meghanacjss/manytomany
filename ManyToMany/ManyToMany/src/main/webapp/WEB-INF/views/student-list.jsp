<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student List</title>
</head>
<body>
    <h2>Student List</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>

            </tr>
        </thead>
        <tbody>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.studentId}</td>
                    <td>${student.studentName}</td>
                <!--    <td>
                        <a href="<c:url value='/courses/edit/' />${course.courseId}">Edit</a>
                        <a href="<c:url value='/courses/delete/' />${course.courseId}">Delete</a>
                    </td>   -->
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <a href="<c:url value='/students/add' />">Add student</a>
</body>
</html>
