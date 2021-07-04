## 추가 sql 생성
```sql
# notice 게시판 생성
CREATE TABLE crud_notice (
	id int(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '번호',
	title CHAR(100) NOT NULL COMMENT '제목',
	contents TEXT(2000) NOT NULL COMMENT '내용',
	writer CHAR(50) COMMENT '작성자',
	regDate DATETIME COMMENT '생성시간',
	updateDate DATETIME COMMENT '수정시간',
	delStatus tinyint(1) UNSIGNED NOT NULL DEFAULT 0 COMMENT '삭제여부'
);

# notice 테스트 데이터 생성
### crud_article에 테스트 데이터 직접 넣기
INSERT INTO crud_notice
SET title = '공지사항1입니다.',
body = '공지사항 내용입니다.',
writer = '관리자',
regDate = NOW(),
updateDate = NOW();
