package servlets;

import beans.TrapezoidBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "TrapezoidAreaComputeServlet")
public class TrapezoidAreaComputeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 创建 session 周期的 JavaBean 对象

        // 1.1 创建 JavaBean 对象
        TrapezoidBean trapezoidBean = new TrapezoidBean();

        // 1.2 将 JavaBean 对象存放到 session 对象中去
        HttpSession session = request.getSession(true);
        session.setAttribute("trapezoidBean", trapezoidBean);

        // 2. 计算并存储数据到 JavaBean 对象中
        try {
            double topLine = Double.parseDouble(request.getParameter("topLine"));
            double baseLine = Double.parseDouble(request.getParameter("baseLine"));
            double height = Double.parseDouble(request.getParameter("height"));

            trapezoidBean.setTopLine(topLine);
            trapezoidBean.setBaseLine(baseLine);
            trapezoidBean.setHeight(height);
            trapezoidBean.setArea( (topLine + baseLine) * height / 2.0);
            trapezoidBean.setMessage("梯形");
        } catch (NumberFormatException e) {
            trapezoidBean.setArea(-1);
            trapezoidBean.setMessage(e.getMessage());
        }

        // 3. 重定向至 JSP 页面显示
        response.sendRedirect("showArea.jsp");
    }
}
