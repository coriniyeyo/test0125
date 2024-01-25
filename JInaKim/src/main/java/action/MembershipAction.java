package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;

public class MembershipAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");   
		
		MemberDao mDao = new MemberDao();
		mDao.write(id, pw, name);
		
		request.setAttribute("msg", "가입되었습니다. 로그인 해주세요.");
		request.getRequestDispatcher("Controller?command=Login").forward(request, response);

	}

}
