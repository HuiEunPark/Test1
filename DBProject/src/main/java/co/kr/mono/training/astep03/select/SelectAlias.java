package co.kr.mono.training.astep03.select;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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
import co.kr.mono.training.nvo.AreaSaleNVO;
import co.kr.mono.training.nvo.MsalesNVO;

public class SelectAlias {
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
	public void selectOneVo() throws IOException {
		try (SqlSession session = sqlSessionFactory.openSession()) {
			AreaSaleNVO areaSaleVo = session.selectOne("SelectNVOMapper.findAreaSales", "10");

			logger.info("Sale Cnt : {} ", areaSaleVo);
		}
	}

	@Ignore
//	@Test
	public void selectOneTest() throws IOException {
		try (SqlSession session = sqlSessionFactory.openSession()) {
			MsalesNVO sale = session.selectOne("SelectNVOMapper.findMsale");

			logger.info("Sale Cnt : {} ", sale);
		}
	}

//	@Ignore
	@Test
	public void selectListTest() throws IOException {
		try (SqlSession session = sqlSessionFactory.openSession()) {
			List<MsalesNVO> sale = session.selectList("SelectNVOMapper.findMsale");
			logger.info("Sale Cnt : {} ", sale);

			sale.forEach(row -> {
				logger.info("----------------------");
				logger.info("Data : {} | {} | {} ", row.getProdId(), row.getProdNm(), row.getSaleCnt());
				logger.info("----------------------");

			});
		}
	}

}
