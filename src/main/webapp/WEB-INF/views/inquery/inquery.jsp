<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Style CSS -->
<link rel="stylesheet" href="./resources/css/inquery.css">

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">

<!-- Bootstrap JavaScript -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
<title>입주 문의</title>
<script type="text/javascript">
$(document).ready(function () {
	$("#btn").click(function() {
	if ($("#inquery_company").val() !== "" && $("#inquery_homepage").val() !== ""
			&& $("#inq_name").val() !== "" && $("#inquery_tel").val() !== ""
			&& $("#inquery_email").val() !== "" && $("#ptr_name").val() !== ""
			&& $("#inquery_people").val() !== "" && $("#inquery_select_branch").val() !== ""
			&& $("#inquery_title").val() !== "" && $("#inq_content").val() !== "") {
		    alert("입주 문의 신청서 제출이 완료되었습니다.\n확인 후 회신드리겠습니다.😊");
    location.href = "./resources/views/admin/inquery.jsp";
    }else{
    	alert("입주 문의 신청서 양식에 맞게 작성해주세요.");
    }
});
});
</script>
</head>
<body>

	<div id="header">
			<jsp:include page="../section/header.jsp" />
	</div>

<div id="wrap">

	<!-- 입주 문의 -->
			<h2>입주 문의</h2>
			<h5>첫 사업에 대한 두근거림, SETBang에서 시작하세요!</h5>
			<h6> 업무지원부터 협력업체 예약까지 한번에!<br/>
				사업에만 집중하실 수 있게 도와드리겠습니다.
			</h6>
		
			<div class="inquery">
		<form action="inquery2.do">
				<div class="group">
				<div class="left">
					<label for="inquery_company" class="inquery_label">회사명</label><br/>
				</div>
					<input type="text" class="inquery_company" id="inquery_company" name="inq_coname"
						placeholder="ex) (주)CO-SPACE" required/>
				</div>
				<div class="group">
				<div class="left">
					<label for="inquery_homepage" class="inquery_label">홈페이지</label><br/>
				</div>	
					<input type="text" class="inquery_homepage" id="inquery_homepage" name="inq_website"
						placeholder="ex) www.setbang.com"/>
				</div>
				<div class="group">
				<div class="left">
					<label for="inquery_name" class="inquery_label">성함</label>
				</div>
					<input type="text" class="inquery_name" id="inquery_name" name="inq_name"
						placeholder="ex) 홍길동" required/>
				</div>
				<div class="group">
				<div class="left">
					<label for="inquery_tel" class="inquery_label">연락처</label>
				</div>
					<input type="tel" class="inquery_tel" id="inquery_tel" name="inq_tel"
						placeholder="ex) 010-0000-0000" required/>
				</div>
				<div class="group">
				<div class="left">
					<label for="inquery_email" class="inquery_label">이메일 주소</label>
				</div>	
					<input type="email" class="inquery_email" id="inquery_email" name="inq_email"
						placeholder="ex) setbang@setbang.com" required/>
				</div>
				<div class="group">
				<div class="left">
					<label for="inquery_people" class="inquery_label">입주 예정 인원</label>
				</div>
					<input type="text" class="inquery_people" id="inquery_people" name="inq_people"
						placeholder="ex) 00(명)" required/>
				</div>
				<div class="group">
				<div class="left">
					<label for="inquery_branch" class="inquery_label">관심 지점</label>
				</div>
					<div class="inquery_select_branch">
						<select class="inquery_select_branch" id="inquery_select_branch" name="inq_branch" required>
							<option value="">선택하세요</option>
							<option value="구로점">구로점</option>
							<option value="강남점">강남점</option>
							<option value="판교점">판교점</option>
						</select>
					</div>
					<div class="group">
					<div class="left2">
						<label for="inquery_title" class="inquery_label">제목</label>
					</div>
						<input type="text" class="inquery_title" id="inquery_title" name="inq_title" required/>
					</div>
					<div class="group">
					<div class="left2">
						<label for="inquery_content" class="inquery_label">내용</label>
					</div>
						<textarea class="inq_content" id="inquery_title" name="inq_content" required></textarea>
					</div>
				</div>
			<button class="button" type="submit" id="btn">제출하기</button>
		</form>
			</div>


	</div>	

		<div id="footer">
			<jsp:include page="../section/footer.jsp" />
	</div>

</body>
</html>