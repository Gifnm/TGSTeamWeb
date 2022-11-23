package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LoaiSanPhamDAO;
import DAO.SanPhamDAO;
import Model.LoaiSanPham;

/**
 * Servlet implementation class HomeControl
 */
@WebServlet("/HomeControl")
public class HomeControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		// Get date from DAO
		SanPhamDAO sanPham = new SanPhamDAO();
		List<Model.SanPham> list = sanPham.selectAll();
		LoaiSanPhamDAO loaiSP = new LoaiSanPhamDAO();
		List<LoaiSanPham> ListLoaiSp = loaiSP.selectAll();
		// set data to jsp
		request.setAttribute("ListP", list);
		request.setAttribute("ListL", ListLoaiSp);
		request.getRequestDispatcher("Index.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
