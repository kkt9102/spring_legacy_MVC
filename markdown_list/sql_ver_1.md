## database 생성
```sql
# DATABASE 생성
CREATE DATABASES spring_legacy;
# 사용할 DB 설정
USE spring_legacy;
# table 생성
CREATE TABLE crud_article (
	id int(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '번호',
	title CHAR(100) NOT NULL COMMENT '제목',
	`body` TEXT(2000) NOT NULL COMMENT '내용',
	writer CHAR(50) COMMENT '작성자',
	regDate DATETIME COMMENT '생성시간',
	updateDate DATETIME COMMENT '수정시간',
	delStatus tinyint(1) UNSIGNED NOT NULL DEFAULT 0 COMMENT '삭제여부'
);

### 계정관련
# 사용자 생성 
create user 'legacy'@'localhost' identified by 'legacy'; 

# 권한 부여 
GRANT ALL PRIVILEGES ON *.* TO 'legacy'@'localhost'; 
GRANT GRANT OPTION ON *.* TO 'legacy'@'localhost';

# 테이블 컬럼 변경법
# ALTER TABLE 테이블명 CHANGE 기존컬럼 변경컬럼 속성;

### crud_article에 테스트 데이터 직접 넣기
INSERT INTO crud_article
SET title = '제목',
body = '내용',
writer = '작성자1',
regDate = NOW(),
updateDate = NOW()

```