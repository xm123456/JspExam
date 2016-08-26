package com.hand.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.dao.FilmDao;
import com.hand.dao.impl.FilmDaoImpl;
import com.hand.jdbc.ConnectionFactory;

public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FilmDao filmDao = new FilmDaoImpl();

	public DeleteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = null;
		RequestDispatcher rd = null;
		try {
			conn = ConnectionFactory.getInstance().makeConnection();
			filmDao.delete(conn, request.getParameter("film_id"));
			rd = request.getRequestDispatcher("/jsp/show.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				conn.close();
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}

	}

}
