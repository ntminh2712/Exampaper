package controller;

import entity.Phone;
import org.hibernate.Session;
import org.hibernate.Transaction;
import until.HibernateUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;

public class AddPhoneController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String branch = req.getParameter("branch");
        String price = req.getParameter("price");
        String description = req.getParameter("description");
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.save(Phone.PhoneBuilder.aPhone().withId(Calendar.getInstance().getTimeInMillis()).withName(name)
                    .withBranch(branch)
                    .withPrice(price)
                    .withDescription(description)
                    .build());

            transaction.commit();

            resp.sendRedirect("/listphone.jsp");
            resp.getWriter().println("Add phone successfully!");
            resp.setStatus(HttpServletResponse.SC_CREATED);

        }catch(Exception ex){
            if (transaction != null){
                transaction.rollback();
            }
            ex.printStackTrace();
        }




    }
}
