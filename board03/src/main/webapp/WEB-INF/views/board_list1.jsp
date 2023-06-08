<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/board.css">
</head>
<body>
<!-- 상단 디자인 -->
<div class="con_title">
    <h3>게시판</h3>
    <p>HOME &gt; 게시판 &gt; <strong>게시판</strong></p>
</div>
<div class="con_txt">
    <div class="contents_sub">
        <div class="board_top">
            <div class="bold">총 <span class="txt_orange"><c:out value="${lists.size()}" /></span>건</div>
        </div>
        <!--게시판-->
        <div class="board">
            <table>
            <tr>
                <th width="3%">&nbsp;</th>
                <th width="5%">번호</th>
                <th>제목</th>
                <th width="10%">글쓴이</th>
                <th width="17%">등록일</th>
                <th width="5%">조회</th>
                <th width="3%">&nbsp;</th>
            </tr>
            <!--  내용시작 -->    
            <c:forEach items="${lists}" var="to">
                <tr>
                    <td>&nbsp;</td>
                    <td><c:out value="${to.seq}" /></td>
                    <td class='left'>
                        <a href='board_view1.jsp?seq=${to.seq}'><c:out value="${to.subject}" /></a>
                        <c:if test="${to.wgap == 0}">
                            &nbsp;<img src='../../images/icon_new.gif' alt='NEW'>
                        </c:if>
                    </td>
                    <td><c:out value="${to.writer}" /></td>
                    <td><c:out value="${to.wdate}" /></td>
                    <td><c:out value="${to.hit}" /></td>
                    <td>&nbsp;</td>
                </tr>
            </c:forEach>
            <!--  내용끝 -->    

            </table>
        </div>    
        <div class="btn_area">
            <div class="align_right">
                <input type="button" value="쓰기" class="btn_writer btn_txt01" style="cursor: pointer;" onclick="location.href='board_write1.jsp'" />
            </div>
        </div>
        <!--//게시판-->
    </div>
</div>
<!--//하단 디자인 -->

</body>
</html>