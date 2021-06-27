## JDBCTest.java DB연결 테스트 코드
```java
		package com.crud.persistence;
		
		import static org.junit.Assert.fail;
		
		import java.sql.Connection;
		import java.sql.DriverManager;
		
		import org.junit.Test;
		
		public class JDBCTest {
			static {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
			@Test
			public void testConnection() {
				try (Connection con = DriverManager.getConnection(
						// 접속할 스키마
						"jdbc:mysql://localhost:3306/spring_legacy?serverTimezone=Asia/Seoul", 
						// 접속 할 DB ID
						"legacy", 
						// 접속 할 DB PW
						"legacy")) {
					System.out.println(con);
				} catch (Exception e) {
					// 접속 실패 시 메시지 출력
					fail(e.getMessage());
		
				}
			}
		}
```