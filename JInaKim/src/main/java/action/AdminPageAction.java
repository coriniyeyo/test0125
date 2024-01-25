package action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import vo.memberVo;

public class AdminPageAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDao mDao = new MemberDao();
		ArrayList<memberVo> listvo = mDao.memberList();
		
		request.setAttribute("listvo", listvo);
		request.getRequestDispatcher("AdminPage.jsp").forward(request, response);
	}

}
