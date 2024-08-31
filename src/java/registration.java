import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class registration extends HttpServlet
{
    public void doPost(HttpServletRequest req,
            HttpServletResponse res) throws IOException, 
            ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1= res.getWriter();
        //till the pw1 all the line gonna be same in every file just below lines gonna be change.
        String Email=req.getParameter("n1");
        String Pass = req.getParameter("n2");
        String Name=req.getParameter("n3");
        String Answer = req.getParameter("n5");
        String Contact = req.getParameter("n6");
        
        
        pw1.println
                ("<html><body bgcolor=skyblue>Your Email is "+Email+"<br>Your Password is "
                        + ""+Pass+"<br>Your Name is "+Name+"<br> Your Contact no. "+Contact+"</body></html>");
    }
}
