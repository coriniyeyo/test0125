package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.DBConnection;
import vo.memberVo;

public class MemberDao {
	//회원가입
	public void write(String id, String pw, String name) {
		Connection conn = DBConnection.getConnection();
		String sql = "INSERT INTO member (id, pw, name, point)"
				+ " VALUES(?, ?, ?, 1000);";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "id");
			pstmt.setString(2, "pw");
			pstmt.setString(3, "name");

			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace(); 
		}
	}
	
	//회원관리
	public ArrayList<memberVo> memberList() {
		Connection conn = DBConnection.getConnection();
		ArrayList<memberVo> listvo = new ArrayList<memberVo>(); 
		String sql = "SELECT * FROM member";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				int point = rs.getInt("point");
				memberVo vo = new memberVo(id, pw, name, point);
				listvo.add(vo);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return listvo;
	}
	
	//수정
	public void update(memberVo vo) {
		Connection conn = DBConnection.getConnection();
		try {
			String sql = "UPDATE member SET pw=?, name=? WHERE id=";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPw());
			pstmt.setString(2, vo.getName());
			pstmt.setInt(3, vo.getPoint());
			pstmt.setString(4, vo.getId());
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
