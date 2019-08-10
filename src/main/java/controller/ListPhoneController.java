package controller;

import entity.Phone;
import org.hibernate.Session;
import until.HibernateUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListPhoneController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            List<Phone> list = session.createCriteria(Phone.class).list();
            req.setAttribute("listPhone",list);
            req.getRequestDispatcher("listphone.jsp").forward(req,resp);

        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
