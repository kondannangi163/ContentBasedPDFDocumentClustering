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

public class ExtractPageContentServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String var=request.getParameter("myFile");
		var="/home/sampath/eeswar/Desktop/IndexGenerator/pdfs/"+var;
		PrintWriter out =response.getWriter();
                out.println(" Converting "+var+"  file");
		ExtractPageContent exp=new ExtractPageContent();
		out.println("before"+var);
		 /** The original PDF that will be parsed. */
		 //String ch="\\";
		 // var=var.replace(ch,"//");
		 out.println("after"+var);
                String pdffile= var;
		String PREFACE=pdffile;
                  
		String var1=var.replace(".pdf", ".txt");
		out.println("textflie"+var1);
//var1="E://shilpa//programming hive.txt";
		/** The resulting text file. */
		 String txtfile=var1;
                 String RESULT =txtfile;
		
		exp.parsePdf(PREFACE, RESULT);
		
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
