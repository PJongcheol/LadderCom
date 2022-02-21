<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false"  pageEncoding="utf-8"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!-- header -->
<!DOCTYPE html>
<html>
<head>
   
   <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/mypage.css">
   
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>

			
						
<script type="text/javascript">
function receiveConfirm(){

	if(!confirm("접수 하시겠습니까?")){
	return false;
	}else{
	alert("접수가 완료되었습니다.")
	location.href="${contextPath}/admin_board_QNA_receive.do?q_no=${list.q_no}";
	}
	}

$(document).ready(function(){
	
$('#reply').click(function(){
	$('form[name="replyForm"]').serialize();
	$('form[name="replyForm"]').attr('method','POST');
	$('form[name="replyForm"]').attr('action','${contextPath}/admin_board_QNA_receive_write.do?q_no=${list.q_no}')
	$('form[name="replyForm"]').submit();
});

});

</script> 




<style>
	.div-1{
		padding : 25px;
		margin: 0 auto;
		display:block;
		text-align : center;
	}
	
	
</style>
</head>
<body>
     <!-- contents --> 
  <div id = "contents">
    <!-- 관리자 페이지 -->
 <section class="flex-center3">
 <div>
<div class="myP_left">
<ul class="my_gnb">
						<li class="depth1">
							<a class="depth1_b_m" href="${contextPath}/admin_main.do" >관리자 페이지</a>
								<ul>
									<li><a href="${contextPath}/admin_member.do">회원 관리</a></li>
									<li><a href="${contextPath}/admin_order.do">주문 관리</a></li>
									<li><a href="${contextPath}/admin_prod.do">상품 관리</a></li>
									<li><a href="${contextPath}/admin_review.do">후기 관리</a></li>
									<li><a href="${contextPath}/admin_board_main.do">게시판 관리</a></li>
								</ul>
						</li>
</ul>			
</div> 
        <main>
        
        <div class="title_wrap"><h2 class="tit_txt">관리자 페이지</h2></div> <hr>
     		<form name="replyForm">
            <div class="order_list21">
            	
						<div class="title_wrap">
							<h2 class="tit_txt" style="text-align:center">Q&A 접수</h2>
						</div>
						<div class="listTable21">
							<table border="0" cellspacing="0" cellpadding="0" width="100%" class="myP_Ttype1">
								<colgroup>
									<col width="30%">
									<col width="70%">
								</colgroup>
								<thead>
									<tr><th>문의 유형</th><td><c:out value="${list.q_type}"/></td></tr>
									<tr><th>작성자</th><td><c:out value="${list.user_id}"/></td></tr>
									<tr><th>휴대전화</th><td><c:out value="${list.user_phone}"/></td></tr>
									<tr><th>이메일</th><td><c:out value="${list.user_email}"/></td></tr>
									<tr><th>제목</th><td><c:out value="${list.q_name}"/></td></tr>
									<tr><th>문의 내용</th><td><c:out value="${list.q_content}"/></td></tr>																
									</thead>
								<tbody>																	
								<tr><th>답변 내용</th><td><textarea name="q_reply" rows="10" cols="65" style="margin-left:15px" class="form-control onlyNumber" maxlength="4000"></textarea></td></tr>									
								</tbody>								
							</table>							
						</div>
						<div class="div-1">
						<br><br>
						<button type="button" id="reply" class="btn btn-outline-dark" onclick="receiveConfirm();">접수하기</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;					
						<button type="button" class="btn btn-outline-dark" onclick="location='admin_board_QNA.do'">돌아가기</button>
						
										
						</div>
        				</div>
        	</form>			
        				
        </main>
</div>
</section>
    </div>
 
</body>
</html>

 