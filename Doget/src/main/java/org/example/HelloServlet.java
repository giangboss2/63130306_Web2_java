package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy giá trị của tham số từ URL
        String param1 = request.getParameter("param1");
        String param2 = request.getParameter("param2");

        // Thiết lập kiểu nội dung và mã nguồn
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        // Lấy đối tượng PrintWriter để ghi dữ liệu vào phản hồi
        PrintWriter out = response.getWriter();

        // Viết nội dung HTML vào phản hồi, sử dụng các tham số từ URL
        out.println("<html>");
        out.println("<head><title>Hello Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Hello from HelloServlet!</h1>");
        out.println("<p>Parameter 1: " + param1 + "</p>");
        out.println("<p>Parameter 2: " + param2 + "</p>");
        out.println("</body>");
        out.println("</html>");

        // Đóng PrintWriter sau khi sử dụng xong
        out.close();
    }
}
