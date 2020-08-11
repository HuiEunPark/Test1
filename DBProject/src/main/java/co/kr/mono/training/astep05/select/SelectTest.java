package co.kr.mono.training.astep05.select;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.kr.mono.training.astep02.baseselect.MybatisTest;
import co.kr.mono.training.vo.MsalesVO;


public class SelectTest {
	static Logger logger = LoggerFactory.getLogger(MybatisTest.class);
	private SqlSessionFactory sqlSessionFactory;

	// integer, date 타입으로 반환받는 것
	@Before
	public void setUp() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Ignore
//	@Test
	public void selectMapCnt() throws IOException {
		try (SqlSession session = sqlSessionFactory.openSession()) {
			Integer saleCnt = session.selectOne("SelectDepRtypeMapper.examCount");
			System.out.println("출력건수 : "+saleCnt);
		}
	}

//	@Ignore
	@Test
	public void selectMapDate() throws IOException {
		try (SqlSession session = sqlSessionFactory.openSession()) {
			Date saleDate = session.selectOne("SelectDepRtypeMapper.examDate");
			System.out.println("현재시간org : " + saleDate);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String decodeSdf = sdf.format(saleDate);
			System.out.println("현재시간convert : " + decodeSdf);
		
		}
	}

}
