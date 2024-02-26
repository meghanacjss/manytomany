<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Course List</title>
</head>
<body>
    <h2>Course List</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>

            </tr>
        </thead>
        <tbody>
            <c:forEach var="course" items="${courses}">
                <tr>
                    <td>${course.courseId}</td>
                    <td>${course.courseName}</td>
                <!--    <td>
                        <a href="<c:url value='/courses/edit/' />${course.courseId}">Edit</a>
                        <a href="<c:url value='/courses/delete/' />${course.courseId}">Delete</a>
                    </td>   -->
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br>
    <a href="<c:url value='/courses/add' />">Add Course</a>
</body>
</html>
