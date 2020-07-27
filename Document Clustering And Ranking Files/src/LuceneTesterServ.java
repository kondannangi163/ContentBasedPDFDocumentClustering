import java.io.*;
import java.util.Scanner;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.lucene.queryParser.ParseException;

/**
 * Servlet implementation class LuceneTesterServ
 */
@WebServlet("/LuceneTesterServ")
public class LuceneTesterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LuceneTesterServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out =response.getWriter();
		out.println("<html>");
        out.println("<head>");
        out.println("<title>Inserting the file</title>");
        out.println("</head>");
				out.print("<body style='background-color:#FFFFFF' > ");
//out.print("<a href="index.html"><font color="white">HOME</font></a>");
		LuceneTester tester;
		tester = new LuceneTester();
	
		tester.dataDir="/home/sampath/eeswar/Desktop/IndexGenerator/Data";
		
		tester.indexDir="/home/sampath/eeswar/Desktop/IndexGenerator/Index";
				
		
		String varData=request.getParameter("dept");
		
		switch(varData)
		{
		    case "IT & CSE":
				tester.dataDir = "/home/sampath/eeswar/Desktop/IndexGenerator/Data/cse it";
					break;
	            case "MECH":
				tester.dataDir = "/home/sampath/eeswar/Desktop/IndexGenerator/Data/mech";
					break;
	            case "NOVELS":
				tester.dataDir = "/home/sampath/eeswar/Desktop/IndexGenerator/Data/novel";
					break;
				default :
					break;
		}
		
		
		String word =request.getParameter("query");
		out.println("Key word searched: "+word);
			out.print("<br>");
                out.println("The documents belongs to: "+varData);
              
		out.println();


		try {
			
			tester.createIndex();
			String st[]=tester.search(word);
			for(int k=0;st[k]!=null;k++)
			{
		 out.print("<table align=center border=1 width=100%>");

			 out.print("<tr>");
			 out.print("<td>");
		
				out.print("rank=            ");
				out.print(k+1+"     "+st[k]);
				
				
				
			 out.print("</tr>");
			 out.print("</td>");
out.print("</table>");
			}
			
			      } catch (IOException e) {
			e.printStackTrace();
			      } 
			catch(ParseException e){
			e.printStackTrace();
			      }
	
			
			 HttpSession session=request.getSession(false);  
                         String n=(String)session.getAttribute("query");  
                         out.print(n);  
  
        out.close();
			   }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
