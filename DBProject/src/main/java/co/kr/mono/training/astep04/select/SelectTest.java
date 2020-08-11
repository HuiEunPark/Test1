package co.kr.mono.training.astep04.select;

import java.io.IOException;
import java.io.InputStream;
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

	@Before
	public void setUp() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Ignore
//	@Test
	public void selectMapTest() throws IOException {
		try (SqlSession session = sqlSessionFactory.openSession()) {
			List<Map<String, Object>> sale = session.selectList("SelectVOMapper.findMsaleMap");
			// Object�� vo�� �����ϸ� ��¾ȵ�

			System.out.println("sale");
			sale.forEach(row -> {
				logger.info("----------------------");
				row.forEach((columnName, value) -> {
					logger.info("columnName = {}, value = {}", columnName, value);
				});
			});

		}
	}

	@Ignore
//	@Test
	/* �Ķ���� 1�� */
	public void selectOneParm() throws IOException {
		try (SqlSession session = sqlSessionFactory.openSession()) {
			MsalesVO sale = session.selectOne("SelectVOMapper.findMsale", "����");
			logger.info("----------------------");
			logger.info("Data : {} | {} | {} ", sale.getProdId(), sale.getProdNm(), sale.getSaleCnt());
			logger.info("----------------------");
		}
	}

	@Ignore
//	@Test
	/* �Ķ���� ������ */
	public void selectMultiParm() throws IOException {
		MsalesVO males = new MsalesVO("01", "����", 14);

		try (SqlSession session = sqlSessionFactory.openSession()) {
			List<MsalesVO> sale = session.selectList("SelectVOMapper.findMsaleByMultiParm", males);

			sale.forEach(row -> {
				logger.info("----------------------");
				logger.info("Data : {} | {} | {} ", row.getProdId(), row.getProdNm(), row.getSaleCnt());
				logger.info("----------------------");

			});
		}
	}
//	@Ignore
	@Test
	/* �Ķ���� ������ */
	public void selectMultiParmMap() throws IOException {
//		MsalesVO males = new MsalesVO("01", "����", 14);
		Map<String, Object> param = new HashMap<>();
		param.put("prodId1","01");
		param.put("prodNm1", "����");
		
		try (SqlSession session = sqlSessionFactory.openSession()) {
			List<MsalesVO> sale = session.selectList("SelectVOMapper.findMsaleByMultiParm", param);

			sale.forEach(row -> {
				logger.info("----------------------");
				logger.info("Data : {} | {} | {} ", row.getProdId(), row.getProdNm(), row.getSaleCnt());
				logger.info("----------------------");
			});
		}
	}	
}
