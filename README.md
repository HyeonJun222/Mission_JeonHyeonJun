# 멋쟁이사자처럼 8기 과제 (게시판 구현)

### 프로젝트 개요

---

사용자들이 자기 자신의 정보를 직접 드러낼 필요 없이 의견을 교환할 수 있는 웹 페이지를 만들어보아요!
단, 자신이 누군지를 드러낼 필요는 없지만 작성한 사람이 원한다면 수정 ∙ 삭제는 가능해야합니다.

### 필수 과제

- 게시판 관련 기능
- 게시글 관련 기능
- 댓글 관련 기능


### 어려웠던 점
- 상세보기 페이지를 만드는 데에 어려움을 겪음. 
- 게시판 관련 기능을 구현하는 것에서 controller -> @PathVariable 을 이용해서 넘어가려고 의도했으나, dto에 null값이 들어오는데 어떻게 연동해야하는지 모르겠음.

- XML 파일로 변경하는 과정에서 home.html도 작동하지 않아 폐기

- /read/{id} 페이지 오류를 잡기 위해 dao 비활성화. 생성해서 BoardDto에 값이 들어가도 오류가 나는 모습.

- 오류를 잡기위해 에러페이지 생성.

- 생성페이지에서 log를 확인했을 때는 잘 생성이 되는데, Controller -> readOne 에서 오류. 