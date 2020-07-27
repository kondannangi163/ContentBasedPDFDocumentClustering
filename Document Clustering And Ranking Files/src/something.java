import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileOutputStream;
import java.io.IOException; 
import java.io.InputStream; 
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path; 
import java.nio.file.Paths;
import org.apache.commons.io.FileUtils; 
import javax.servlet.*;  
import javax.servlet.http.*;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import org.apache.lucene.queryParser.ParseException;
import java.util.Scanner;
import java.util.*;
import java.util.stream.*;

 public class FileCopyDemo extends HttpServlet {	
private static final long serialVersionUID = 1L;
public static ArrayList<String> it_cse=new ArrayList<String>();
	public static ArrayList<String> mec=new ArrayList<String>();
	public static ArrayList<String> novels=new ArrayList<String>();
	public static ArrayList<String> inut=new ArrayList<String>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
 {
	 PrintWriter outl =response.getWriter();
	// outl.println("hi    bbk");
     String tofile=null;      
	 String var=request.getParameter("myFile");
	 var="/home/sampath/eeswar/Desktop/IndexGenerator/pdfs/"+var;
	 outl.println(var);
	 outl.print(""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "");
     String indept=request.getParameter("indept");
	int l=var.lastIndexOf('.')+1;
	if(var.toLowerCase().endsWith(".pdf"))
	{ 		ExtractPageContent exp=new ExtractPageContent();
		outl.println("before"+var);
		 /** The original PDF that will be parsed. */
		 String ch="\\";
		  String var3=var.replace(ch,"//");
		 outl.println("after"+var);
                String pdffile= var3;
		String PREFACE=pdffile;
                  
		String var1=var3.replace(".pdf", ".txt");
		outl.println("textfile"+var1);
		outl.println(""
   				+ ""
   				+ ""
   				+ ""
   				+ ""
   				+ ""
   				+ ""
   				+ ""
   				+ "");
//var1="E://shilpa//programming hive.txt";
		/** The resulting text file. */
		 String txtfile=var1;
                 String RESULT =txtfile;
		
		exp.parsePdf(PREFACE, RESULT);
		

	}
	 var=var.replace(".pdf", ".txt");
	 File from = new File(var);
	 intialise(var);	
		for(String s : it_cse)
		{//System.out.println(s);
			int t=1;
			for(String in:inut)
			if(in.equals(s))
			{	//PrintWriter out =response.getWriter();
		String ch="/";
				System.out.print("it"+"  "+s+"   "+"in"+"\n");
					File to= new File("/home/sampath/eeswar/Desktop/IndexGenerator/Data/cse it/"+var.substring(var.lastIndexOf(ch)+1));
				outl.print(var.substring(var.lastIndexOf('/')+1));
				copy(from,to);
				System.out.println("in it copied");							
				//System.out.println(s);
 			
		 		//outl.println("<html>");
       				// outl.println("<head>");
   				    //outl.println("<title>PdfToText</title>");
					 //outl.println("</head>");
					 //outl.print("<body style='background-color:#808080' > ");
					 //outl.print("<br>");
					// outl.print("<br>");
					 //outl.print("<br>");
					 //outl.print("<br>");
				outl.print(""
	       				+ ""
	       				+ ""
	       				+ ""
	       				+ ""
	       				+ ""
	       				+ ""
	       				+ ""
	       				+ "");
				
					 outl.println("Copying file started");
					 LuceneTester tester;
					 String dataDir=null;
					 String indexDir="/home/sampath/eeswar/Desktop/IndexGenerator/Index";
					 dataDir = "/home/sampath/eeswar/Desktop/IndexGenerator/Data/cse it";
					 String word =request.getParameter("query");
					 try {
						 tester = new LuceneTester();
						 tester.indexDir="/home/sampath/eeswar/Desktop/IndexGenerator/Index";
					tester.dataDir = "/home/sampath/eeswar/Desktop/IndexGenerator/Data/cse it";
					tester.createIndex();
						 //outl.print("index created");
						 } 	
						 catch (IOException e)
						 {
							 e.printStackTrace();
			 		     } 
					 //outl.print("<h1>");
	 		         outl.println("Copying "+var+" done to Index Generator as "+to); 
				     //outl.print("</h1>");
					 //outl.print("</html>");
	 		        outl.println(" "
	 		        		+ ""
	 		        		+ ""
	 		        		+ ""
	 		        		+ ""
	 		        		+ "  ");
	 		        
	 		        
	 		        
	 		        
					  t=0;
					  System.out.println("internal break");
					 break;

			}
				if(t==0)
				{System.out.println("exterrnral break");
				break;
				}

		}
		for(String s : mec)
		{//System.out.println(s);
					int t=1;String ch="/";
			for(String in:inut)
			if(in.equals(s))
			{//PrintWriter out =response.getWriter();
				System.out.print("mec"+"  "+s+"   "+in+"\n");
					File to= new File("/home/sampath/eeswar/Desktop/IndexGenerator/Data/mech/"+var.substring(var.lastIndexOf(ch)+1));
				copy(from,to);
 				System.out.println("in mec coped");
		 		//outl.println("<html>");
   			     //outl.println("<head>");
  			     // outl.println("<title>PdfToText</title>");
  			      //outl.println("</head>");
				//outl.print("<body style='background-color:#808080' > ");
				//outl.print("<br>");
				//outl.print("<br>");
				//outl.print("<br>");
				//outl.print("<br>");
				 outl.println("Copying file started"); 
				//System.out.println(s);
				LuceneTester tester;
				String dataDir=null;
				String indexDir="/home/sampath/eeswar/Desktop/IndexGenerator/Index";
				dataDir = "/home/sampath/eeswar/Desktop/IndexGenerator/Data/mech";
				String word =request.getParameter("query");
				try {
					tester = new LuceneTester();
					tester.indexDir="/home/sampath/eeswar/Desktop/IndexGenerator/Index";
					tester.dataDir = "/home/sampath/eeswar/Desktop/IndexGenerator/Data/mech";
					tester.createIndex();
					//outl.print("<h1>index created</h1>");
					} 
				catch (IOException e)
					{
					e.printStackTrace();
					} 
	 		//outl.print("<h1>");
	       		  outl.println("Copying "+var+" done to Index Generator as "+to); 
	       		  
	       		outl.print(""
	       				+ ""
	       				+ ""
	       				+ ""
	       				+ ""
	       				+ ""
	       				+ ""
	       				+ ""
	       				+ "");
	       		
			//outl.print("</h1>");
			//outl.print("</html>");
			t=0;
			 System.out.println("internal break");
			break;
			 }
			 if(t==0)
			 {System.out.println("exterrnral break");
			 break;}
		}
		
		
		for(String s : novels)
		{//System.out.println(s);
				int t=1;
			for(String in:inut)
			if(in.equals(s))
			{String ch="/";
		//outl.print(ch);
				PrintWriter out =response.getWriter();
				System.out.print("nvels"+"  "+s+"   "+"in"+"\n");
			//	out.println(var);
				
					File to= new File("/home/sampath/eeswar/Desktop/IndexGenerator/Data/novel/"+var.substring(var.lastIndexOf(ch)+1));
				copy(from,to);
				System.out.println("in noverls copied");
		 		//outl.println("<html>");
				//outl.println("<head>");
				//outl.println("<title>PdfToText</title>");
				//outl.println("</head>");
				//outl.print("<body style='background-color:#808080' > ");
				//outl.print("<br>");
				//outl.print("<br>");
				//outl.print("<br>");
				//outl.print("<br>");
				outl.print(""
	       				+ ""
	       				+ ""
	       				+ ""
	       				+ ""
	       				+ ""
	       				+ ""
	       				+ ""
	       				+ "");
			  outl.println("Copying file started"); 
				//System.out.println(s);
				LuceneTester tester;
				String dataDir=null;
				//String indexDir="E:\\IndexGenerator\\Index";
				//dataDir = "E:\\IndexGenerator\\Data\\novel";
				String word =request.getParameter("query");
				try {
					tester = new LuceneTester();
					tester.indexDir="/home/sampath/eeswar/Desktop/IndexGenerator/Index";
					tester.dataDir = "/home/sampath/eeswar/Desktop/IndexGenerator/Data/novel";
					tester.createIndex();
					//outl.print("index created");
					} 
				catch (IOException e)
					{
					e.printStackTrace();
					} 
				//outl.print("<h1>");
	       		outl.println("Copying "+var+" done to Index Generator as "+to); 
				//outl.print("</h1>");
				//outl.print("</html>");
				t=0;
				System.out.println("internal break");
				break;
				 
				}
				if(t==0)
				{System.out.println("exterrnral break");
				break;}
		}
		
			
}


 

	public static void intialise(String from)
		{addit(from);
			addmec(from);
			addnov(from);
			addinp(from);
		//it_cse.add();	
			
		}
		
public static void  addit(String from)
		{
			
			try {//PrintWriter out=new response.PrintWriter();
				File file = new File("/home/sampath/eeswar/Desktop/IndexGenerator/Pre/cse it/clusterwo.txt");
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				StringBuffer stringBuffer = new StringBuffer();
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					stringBuffer.append(line);	
					stringBuffer.append("\n");
				}
				fileReader.close();
				String s=stringBuffer.toString();
				
				String words = s.replaceAll("[^a-zA-Z\\s]", "");
				words.replaceAll("\n"," ");
				String formatted = words.trim().replaceAll(" +", " ");
				String[] k = Arrays.asList(formatted.split("\n")).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
				System.out.println("it-----------------------");
				for(String sa : k)
				{
				System.out.println(sa);
					it_cse.add(sa.toLowerCase());
					
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			

			
		}
public static void addmec(String from)
{
	try {
		File file = new File("/home/sampath/eeswar/Desktop/IndexGenerator/Pre/mech/clusterwo.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			stringBuffer.append(line);
			stringBuffer.append("\n");
		}
		fileReader.close();
		String s=stringBuffer.toString();
		
	String k[]=s.split("\n");
	System.out.println("mec-----------------------");
		for(String sa : k)
		{System.out.println(sa);
			mec.add(sa.toLowerCase());
			
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}	

}

public static void addnov(String from)
{
	try {
		File file = new File("/home/sampath/eeswar/Desktop/IndexGenerator/Pre/novel/clusterwo.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			stringBuffer.append(line);
			stringBuffer.append("\n");
		}
		fileReader.close();
		String s=stringBuffer.toString();
		
	String k[]=s.split("\n");
	System.out.println("nov-----------------------");
		for(String sa : k)
		{System.out.println(sa);
			novels.add(sa.toLowerCase());
			
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}	


}
public static void addinp(String from)
{
	try {System.out.println("hi");
		File file = new File(from);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new 
				BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			stringBuffer.append(line);
			stringBuffer.append("\n");
		}
		fileReader.close();
		String s=stringBuffer.toString();
		
		String words = s.replaceAll("[^a-zA-Z\\s]", "");
		words.replaceAll("\n"," ");
		String formatted = words.trim().replaceAll(" +", " ");
		String[] k = Arrays.asList(formatted.split(" ")).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
		for(String sa : k)
		{if(!sa.equals(" ")||!sa.equals("\r\n")||!sa.isEmpty())
		//System.out.println(sa);
			inut.add(sa.toLowerCase());
			
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}	

	
}
		
 
  public static void copy(File src, File dest) throws IOException
 {
	 InputStream is = null; OutputStream os = null; 
	 try {
		 is = new FileInputStream(src);
		 os = new FileOutputStream(dest); 
		 // buffer size 1K
		 byte[] buf = new byte[1024]; int bytesRead;
		 while ((bytesRead = is.read(buf)) > 0) 
		 { os.write(buf, 0, bytesRead);
		 
		 }
		 System.out.println("Copying file done");
		 } 
	 finally { 
		 is.close();
		 os.close();
		 } 
	}
 
 }





