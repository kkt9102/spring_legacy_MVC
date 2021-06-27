## ArticleVO.java 최종 작성 코드
```java
	package com.crud.model;
	
	public class ArticleVO {
		// 게시물 생성 고유 id
		private int id;
		// 게시글 제목
		private String title;
		// 게시글 내용
		private String body;
		// 게시글 작성자
		private String writer;
		// 게시글 생성날짜
		private String regDate;
		// 게시글 수정날짜
		private String updateDate;
		// 게시글 삭제 여부
		private boolean delStatus;
		
		// Getters and Setters
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getBody() {
			return body;
		}
		public void setBody(String body) {
			this.body = body;
		}
		public String getWriter() {
			return writer;
		}
		public void setWriter(String writer) {
			this.writer = writer;
		}
		public String getRegDate() {
			return regDate;
		}
		public void setRegDate(String regDate) {
			this.regDate = regDate;
		}
		public String getUpdateDate() {
			return updateDate;
		}
		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}
		public boolean isDelStatus() {
			return delStatus;
		}
		public void setDelStatus(boolean delStatus) {
			this.delStatus = delStatus;
		}
		
		// toString
		@Override
		public String toString() {
			return "ArticleVO [id=" + id + ", title=" + title + ", body=" + body + ", writer=" + writer + ", regDate="
					+ regDate + ", updateDate=" + updateDate + ", delStatus=" + delStatus + "]";
		}
	}
```