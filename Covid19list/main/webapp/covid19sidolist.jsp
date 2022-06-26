<%@page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@page language="java" import="java.util.*, java.sql.*, javax.servlet.http.*, java.text.NumberFormat" %>
<%@page import="kr.co.niceday.covid19sido.*"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>코비드19 시도 리스트</title>
</head>
<body>
<%
Covid19sidoDAO dao = new Covid19sidoDAO();
Covid19sidoVO  param_vo = new Covid19sidoVO();
List list = dao.getList(param_vo);
%>

<H1> Covid19 시도 발생현황</H1>
<table border="1" cellspacing=0 >
<tr align="center">
    <td>기준일시</td>
    <td>시도명</td>
    <td>확진자 수</td>
    <td>사망자 수</td>
    <td>격리 해제 수</td>
    <td>해외유입 수</td>
    <td>지역발생 수</td>
    <td>등록일시</td>
</tr>
<%
if(list.size()>0){
    
    for(int i=0; i<list.size() ; i++){ 
    	Covid19sidoVO vo = (Covid19sidoVO)list.get(i); 
%>
            <tr align="center">
				<td><%=vo.getStd_day       ()%></td>
				<td><%=vo.getGubun         ()%></td>
				<td><%=vo.getDef_cnt       ()%></td>
				<td><%=vo.getDeath_cnt     ()%></td>
				<td><%=vo.getIsol_clear_cnt()%></td>
				<td><%=vo.getOver_flow_cnt ()%></td>
				<td><%=vo.getLocal_occ_cnt ()%></td>
				<td><%=vo.getReg_date      ().substring(0,19)%></td>
            </tr>
<%
    } 
} else{ 
%>
<tr>
<td colspan="8"> No Data </td>
</tr>
<%} %>
    </table>
</body>
</html>