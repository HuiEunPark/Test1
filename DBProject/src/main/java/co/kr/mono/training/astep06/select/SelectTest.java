package co.kr.mono.training.astep06.select;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
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
import co.kr.mono.training.vo.SimpleVO;


public class SelectTest {
	static Logger logger = LoggerFactory.getLogger(MybatisTest.class);
	private SqlSessionFactory sqlSessionFactory;

	// integer, date Ÿ������ ��ȯ�޴� ��
	@Before
	public void setUp() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Ignore
//	@Test
	public void timeConvert() {
		java.util.Date utilDate = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		System.out.println("utilDate:" + utilDate);
		System.out.println("sqlDate:" + sqlDate);
	}

//	@Ignore
	@Test
	public void selectMapDate() throws IOException {
		try (SqlSession session = sqlSessionFactory.openSession()) {
			SimpleVO saleDate = session.selectOne("SelectCdataMapper.examDate");
			System.out.println("����ð� | db to_char(sysdate) => String : " + saleDate.getCurrentStrDate());
			System.out.println("����ð� | db sysdate => java.util.Date ���� : " + saleDate.getUtilCurrentDate());
			System.out.println("����ð� | db sysdate => java.sql.Date ����(�ú���x) : " + saleDate.getSqlCurrentDate());
			System.out.println("����ð� | db sysdate => java.util.Timestamp ���� : " + saleDate.getSqlCurrentTimeStamp());
			System.out.println("����ð� | db timestamp => java.util.Date ���� : " + saleDate.getSqlDbCurrentTimeStamp());
			
			java.sql.Timestamp cvtSaleDate = new java.sql.Timestamp(saleDate.getUtilCurrentDate().getTime());
			System.out.println("util.date => sql.date : " + cvtSaleDate);
			
			cvtSaleDate = new java.sql.Timestamp(saleDate.getUtilCurrentDate().getTime()+(long)(1000*60*60*24)*1);
			System.out.println("util.date ������ => sql.date : " + cvtSaleDate);
			
		}
	}

}
