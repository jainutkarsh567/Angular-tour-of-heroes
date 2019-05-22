package wild;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.json.simple.*;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {
	static List<Animals> animal=new ArrayList<Animals>();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		
		String name1=request.getParameter("name");
		int id1=Integer.parseInt(request.getParameter("id"));
		animal.add(new Animals(id1,name1));
		String arr1=new Gson().toJson(animal);
		PrintWriter out=response.getWriter();
		out.println(arr1);
		
		
		
		
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
	
		animal.add(new Animals(1,"Tiger"));
		animal.add(new Animals(2,"Lion"));
		animal.add(new Animals(3,"Elephant"));
		animal.add(new Animals(4,"Giraffe"));
		animal.add(new Animals(5,"Zebra"));
		animal.add(new Animals(6,"Jackal"));
		animal.add(new Animals(7,"Deer"));	
		 
		
		//String json = new Gson().toJson(animal);
		PrintWriter out= response.getWriter();
		/*animal.forEach(student -> {
	       out.println(student.getId());
	        out.println(student.getName());
	       });*/
		
		/*String user=new Gson().toJson(animal);
		PrintWriter out= response.getWriter();
		out.print(user);*/
		String arr=new Gson().toJson(animal);
		//String jsonText=JSONValue.toJSONString(animal);
		//out.println(jsonText);
		/*JSONArray arr=new JSONArray();
		arr.add(animal);*/
		out.println(arr);
		

}
}
