package it.prova.myebay.web.servlet.annuncio;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.myebay.service.MyServiceFactory;

@WebServlet("/user/PrepareSearchUtenteAnnuncioServlet")
public class PrepareSearchUtenteAnnuncioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PrepareSearchUtenteAnnuncioServlet() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try {
			request.setAttribute("categoria_list_attribute",
					MyServiceFactory.getCategoriaServiceInstance().listAll());
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMessage", "Attenzione, non è stato possibile caricare le categorie.");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			return;
		}
    	request.getRequestDispatcher("/annuncio/searchutente.jsp").forward(request, response);
		
	}

}
