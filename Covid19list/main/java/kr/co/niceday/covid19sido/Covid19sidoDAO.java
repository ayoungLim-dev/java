package kr.co.niceday.covid19sido;

import kr.co.niceday.database.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class Covid19sidoDAO {

	// 목록 보기(페이지)
	public ArrayList getList(Covid19sidoVO vo) throws Exception {
	
		Connection conn = null;	
	  	
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList al = null;
		String sQry = "";

		try{
			conn = MariaDBConnector.getConnection();
			
			sQry = "SELECT std_day, gubun, def_cnt, death_cnt, isol_clear_cnt, \n"
					+ "       over_flow_cnt, local_occ_cnt, reg_date\n"
					+ "FROM ay0518_ts.covid19sido\n"
					+ "order by std_day desc, gubun asc\n" ;			

//			System.out.println(sQry);
			
			pstmt = conn.prepareStatement(sQry);
			
			rs = pstmt.executeQuery(); 
			
			al = new ArrayList();
			
			while (rs.next()) {
				Covid19sidoVO r_vo = new Covid19sidoVO();
				
				r_vo.setStd_day       (rs.getString("std_day"       ) == null ? "" : rs.getString("std_day"       ));
				r_vo.setGubun         (rs.getString("gubun"         ) == null ? "" : rs.getString("gubun"         ));
				r_vo.setDef_cnt       (rs.getString("def_cnt"       ) == null ? "" : rs.getString("def_cnt"       ));
				r_vo.setDeath_cnt     (rs.getString("death_cnt"     ) == null ? "" : rs.getString("death_cnt"     ));
				r_vo.setIsol_clear_cnt(rs.getString("isol_clear_cnt") == null ? "" : rs.getString("isol_clear_cnt"));
				r_vo.setOver_flow_cnt (rs.getString("over_flow_cnt" ) == null ? "" : rs.getString("over_flow_cnt" ));
				r_vo.setLocal_occ_cnt (rs.getString("local_occ_cnt" ) == null ? "" : rs.getString("local_occ_cnt" ));
				r_vo.setReg_date      (rs.getString("reg_date"      ) == null ? "" : rs.getString("reg_date"      ));

				al.add(r_vo);
			}

		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			if (rs != null) try { rs.close(); } catch(Exception ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(Exception ex) {}
			if (conn != null) try { conn.close(); } catch(Exception ex1) {}		    
		}
		
		return al;
	}

}
