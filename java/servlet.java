/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author moumen
 */
@WebServlet(urlPatterns = {"/servlet"})
public class servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    ArrayList l1 = new ArrayList();
    ArrayList l2 = new ArrayList();
    ArrayList l3 = new ArrayList();
    
    
    int ss = 0;int sss = 0;int ssss = 0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        String str = request.getParameter("id");
        System.out.println(str);
    int id = Integer.parseInt(str);
    int str1 =Integer.parseInt( request.getParameter("n"));
  int str2 =Integer.parseInt( request.getParameter("s"));
  int str3 =Integer.parseInt( request.getParameter("ser"));
  int res =( str1+str2+str3)/3;
       switch(id){
           case 1: l1.add(res); 
           break;
           case 2 : l2.add(res);
           break;
           case 3 : l3.add(res);
           break;
       }
 
       PrintWriter out = response.getWriter();
       if(id==1){
       for(int i = 0 ; i<l1.size();i++){
         ss=  ((int)(l1.get(i))+ss);
         ss= ss/l1.size();
       }
       }
       else
           if(id==2){
       for(int i = 0 ; i<l2.size();i++){
         sss=  ((int)(l2.get(i))+sss);
         sss= sss/l2.size();

       }
           }
           else{
       for(int i = 0 ; i<l3.size();i++){
         ssss=  ((int)(l3.get(i))+ssss);
         ssss= ssss/l3.size();

       }
       }
       
       out.println(ss+"\n"+sss+"\n"+ssss);
        
        
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
