package com.example.myproject;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Inbound_emailServlet extends HttpServlet {
	private static final String rurl= "http://requestbin.fullcontact.com/15uc49x1";
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.sendRedirect(rurl+"?method=get&to="+req.getParameter("to")+"&subject="+req.getParameter("subject")+"&pmap="+req.getParameterMap().toString());
	}
	
	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setStatus(HttpServletResponse.SC_TEMPORARY_REDIRECT);
		resp.setHeader("Location", rurl);
		/*String surlp = "";
		resp.sendRedirect(rurl+"?method=post&to="+req.getParameter("to")+"&subject="+req.getParameter("subject")+"&pmap="+req.getParameterMap().toString());
		System.out.println("req = "+req.getParameterNames().toString());
		Enumeration<String> rparam = req.getParameterNames();
		while(rparam.hasMoreElements()){
			String prm = rparam.nextElement();
			String val = req.getParameter(prm);
			surlp=prm+"="+val;
			System.out.println("&"+prm+"="+val);
		}
		System.out.println("parms = "+surlp);*/
	}
}
