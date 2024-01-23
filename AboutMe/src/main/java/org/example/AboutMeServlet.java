package org.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AboutMe")
public class AboutMeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Thiết lập kiểu nội dung và mã nguồn
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        // Lấy đối tượng PrintWriter để ghi dữ liệu vào phản hồi
        PrintWriter out = response.getWriter();

        // Viết nội dung HTML chứa thông tin cá nhân
        out.println("<html>");
        out.println("<head><title>About Me</title></head>");
        out.println("<body>");
        out.println("<h1>Thông tin cá nhân của tôi</h1>");
        out.println("<p>Họ và tên: Tên của bạn</p>");
        out.println("<p>Ngày sinh: Ngày sinh của bạn</p>");
        out.println("<p>Quê quán: Quê quán của bạn</p>");
        out.println("<p>Sở thích: Sở thích của bạn</p>");
        out.println("</body>");
        out.println("</html>");

        // Đóng PrintWriter sau khi sử dụng xong
        out.close();
    }
}
