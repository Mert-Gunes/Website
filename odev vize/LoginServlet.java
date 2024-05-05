import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean rememberMe = request.getParameter("rememberMe") != null;

        if (rememberMe) {
            Cookie usernameCookie = new Cookie("username", username);
            Cookie passwordCookie = new Cookie("password", password);

            int cookieMaxAge = 7 * 24 * 60 * 60;

            usernameCookie.setMaxAge(cookieMaxAge);
            passwordCookie.setMaxAge(cookieMaxAge);

            response.addCookie(usernameCookie);
            response.addCookie(passwordCookie);
        }
        response.sendRedirect("homepage.jsp");
    }
}
