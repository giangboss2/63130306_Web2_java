package org.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/BMI")
public class BMIServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Thiết lập kiểu nội dung và mã nguồn
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        // Lấy đối tượng PrintWriter để ghi dữ liệu vào phản hồi
        PrintWriter out = response.getWriter();

        // Hiển thị form nhập liệu cho chiều cao và cân nặng
        out.println("<html>");
        out.println("<head><title>BMI Calculator</title></head>");
        out.println("<body>");
        out.println("<h1>Calculate BMI</h1>");
        out.println("<form method=\"post\">");
        out.println("Chiều cao (m): <input type=\"text\" name=\"height\"><br>");
        out.println("Cân nặng (kg): <input type=\"text\" name=\"weight\"><br>");
        out.println("<input type=\"submit\" value=\"Submit\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");

        // Đóng PrintWriter sau khi sử dụng xong
        out.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Lấy dữ liệu từ form POST
        String heightStr = request.getParameter("height");
        String weightStr = request.getParameter("weight");

        // Chuyển đổi dữ liệu sang kiểu số
        double height = Double.parseDouble(heightStr);
        double weight = Double.parseDouble(weightStr);

        // Thực hiện tính toán BMI
        double bmi = calculateBMI(height, weight);

        // Thiết lập kiểu nội dung và mã nguồn
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        // Lấy đối tượng PrintWriter để ghi dữ liệu vào phản hồi
        PrintWriter out = response.getWriter();

        // Hiển thị kết quả BMI
        out.println("<html>");
        out.println("<head><title>BMI Result</title></head>");
        out.println("<body>");
        out.println("<h1>Result</h1>");
        out.println("<p>Chiều cao: " + height + " m</p>");
        out.println("<p>Cân nặng: " + weight + " kg</p>");
        out.println("<p>BMI: " + bmi + "</p>");
        out.println("</body>");
        out.println("</html>");

        // Đóng PrintWriter sau khi sử dụng xong
        out.close();
    }

    private double calculateBMI(double height, double weight) {
        // Tính toán BMI theo công thức BMI = cân nặng / (chiều cao * chiều cao)
        return weight / (height * height);
    }
}

