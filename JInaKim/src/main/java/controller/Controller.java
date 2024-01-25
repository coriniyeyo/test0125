package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.AdminPageAction;
import action.LoginAction;
import action.MainAction;
import action.MemberModifyActon;
import action.MemberModifyFormActon;
import action.MembershipAction;
import action.MembershipFormAction;

@WebServlet("/Controller")     
public class Controller extends HttpServlet {
	private static final long serialVrsionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String command = request.getParameter("command");
		System.out.println("command : " + command); 
		Action action = null;
		switch(command) {
		case "Membership_form" : action = new MembershipFormAction(); break;
		case "Membership": action = new MembershipAction(); break;
		case "Login" : action = new LoginAction(); break;
		case "Main" : action = new MainAction(); break;
		case "AdminPage" : action = new AdminPageAction(); break;
		case "MemberModify_form" : action = new MemberModifyFormActon(); break;
		case "MemberModify" : action = new MemberModifyActon(); break;
		
		}
		action.execute(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}







