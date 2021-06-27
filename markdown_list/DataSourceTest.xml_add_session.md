## DataSourceTest.java DB연결 테스트 코드
```java
		package com.crud.persistence;

		import java.sql.Connection;
		
		import javax.sql.DataSource;
		
		import org.apache.ibatis.session.SqlSession;
		import org.apache.ibatis.session.SqlSessionFactory;
		import org.junit.Test;
		import org.junit.runner.RunWith;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.test.context.ContextConfiguration;
		import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
		
		@RunWith(SpringJUnit4ClassRunner.class)
		@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
		public class DataSourceTest {
		
			// DataSource 의존성 주입
			@Autowired
			private DataSource dataSource;
			
// NEW ADD
			// SqlSessionFactory 의존성 주입
			@Autowired
			private SqlSessionFactory sqlSessionFactory;
// NEW ADD
			
			@Test
			public void testConnection() {
				try(
						Connection con = dataSource.getConnection();
// NEW ADD
						SqlSession session = sqlSessionFactory.openSession();
// NEW ADD
						) {
					System.out.println("con : " + con);
// NEW ADD
					System.out.println("session : " + session);
// NEW ADD
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
```