import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet("/Register")
public class Register extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Register() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String phno = request.getParameter("phno");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String dobStr = request.getParameter("dob");
        String password = request.getParameter("password");

        Date dob = null;
        try {
            dob = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(dobStr).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Member member = new Member(fname, lname, phno, email, address, password, dob, 0.0);

        RegisterDAO rdao = new RegisterDAO();
        String result = rdao.insert(member);
        response.getWriter().print(result);
    }
}
