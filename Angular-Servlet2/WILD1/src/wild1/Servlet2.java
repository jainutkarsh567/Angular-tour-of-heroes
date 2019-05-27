package wild1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

import org.json.simple.*;

import com.google.gson.Gson;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet2 extends HttpServlet {
	static List<Animals2> animal=new ArrayList<Animals2>();
	static List<UserLogin> user= new ArrayList<UserLogin>();
	public void init() throws ServletException {
		System.out.println("Servlet Initialized!");
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{	
		StringBuilder stringBuilder = new StringBuilder();
	    BufferedReader bufferedReader = null;

	    try {
	        InputStream inputStream = request.getInputStream();
	        if (inputStream != null) {
	            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
	            char[] charBuffer = new char[128];
	            int bytesRead = -1;
	            while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
	                stringBuilder.append(charBuffer, 0, bytesRead);
	            }
	        } else {
	            stringBuilder.append("");
	        }
	    } catch (IOException ex) {
	        throw ex;
	    } finally {
	        if (bufferedReader != null) {
	            try {
	                bufferedReader.close();
	            } catch (IOException ex) {
	                throw ex;
	            }
	        }
	    }

	    String body = stringBuilder.toString();
	    System.out.println(body);
	    String command = request.getParameter("command");
	    System.out.println(command);
	    		if(body.contains("id"))
	    		{	
	    			Animals2 usersData = new Gson().fromJson(body, Animals2.class);
	    			if(usersData.getName()!=null)
	    			{
	    			System.out.println("add");
	    			animal.add(usersData);
	    			response.getWriter().write("the animal is successfully added");
	    		}
	    		}
	    		
	    		else if(body.contains("password")) 
	    		{	
	    			UserLogin users = new Gson().fromJson(body, UserLogin.class);   
	    			System.out.println(users);
	    			if(users.getUsername()!=null) {
	    			System.out.println("login");
	    			user.add(new UserLogin("jainutkarsh567","ukki@123"));
	    			user.add(new UserLogin("jainutkarsh5678","ukki@1234"));
	    			user.add(new UserLogin("jainutkarsh56789","ukki@12345"));
	    			user.add(new UserLogin("jainutkarsh567890","ukki@12356"));
	    		
	    			for(int i=0;i<user.size();i++)
	    			{
	    				if(users.getUsername().equals(user.get(i).getUsername()))
	    					{
	    						if(users.getPassword().equals(user.get(i).getPassword()))
	    						{
	    							System.out.println("correct password and username");
	    						}
	    						else
	    						{
	    							System.out.println("incorrect password");
	    						}
	    					}
	    				else {
	    					System.out.println("incorrect username");
	    				}
	    			}
	    			
	    		}
	 }
	}
	    
	   
	
	    //System.out.println(usersData);

	   // String string=new Gson().toJson(animal);
	    //PrintWriter out=response.getWriter();  
	//    System.out.println(animal);
	/*	System.out.println("id"+request.getParameter("id") );
		PrintWriter out=response.getWriter();
		if (request.getParameter("id") != null) {
			String name1=request.getParameter("name");
			int id1=Integer.parseInt(request.getParameter("id"));
			animal.add(new Animals2(id1,name1));
		}
		String arr1=new Gson().toJson(animal);
		System.out.println(arr1);
		out.println(arr1);*/
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
	
		animal.add(new Animals2(1,"Tiger"));
		animal.add(new Animals2(2,"Lion"));
		animal.add(new Animals2(3,"Elephant"));
		animal.add(new Animals2(4,"Giraffe"));
		animal.add(new Animals2(5,"Zebra"));
		animal.add(new Animals2(6,"Jackal"));
		animal.add(new Animals2(7,"Deer"));	

		PrintWriter out= response.getWriter();
		String arr=new Gson().toJson(animal);
		out.println(arr);
}
}