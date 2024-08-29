<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%-- include 지시자의 역할: 외부의 파일의 내용을 가져와서 삽입시켜줌 --%>
<%-- include 액션의 역할: 외부의 JSP를 실행하고 그 결과를 삽입시켜줌 --%>
<%@ include file="/WEB-INF/views/common/top.jsp" %>

<div class="card">
   <div class="card-header">session에 저장된 데이터 이용</div>

   <div class="card-body">
      
      <!-- 1번째로 request 범위에서 찾고, 그 후에 session 에서 찾습니다 -->
      <div class="m-3">
      	<p>mid: ${member.mid}</p>
      	<p>mid: ${member.mname}</p>
      	<p>mid: ${member.memail}</p>
      </div>
      
   </div>
</div>

<%@ include file="/WEB-INF/views/common/bottom.jsp" %>

<!-- 
<jsp:include page="/WEB-INF/views/common/bottom.jsp"></jsp:include>
 -->


