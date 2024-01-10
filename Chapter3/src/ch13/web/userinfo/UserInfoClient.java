package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracle;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties(); //���� �� Ű�� ����� ������ �ҷ����� ����
		prop.load(fis); // �ҷ��� ���� �д� ����
		
		String dbType = prop.getProperty("DBTYPE"); //�ش�Ǵ� ����� ��ȯ
		
		UserInfo userInfo = new UserInfo(); // ���� ����
		userInfo.setUserId("12345"); 
		userInfo.setPasword("!@#$%^");
		userInfo.setUserName("Lee");
		
		UserInfoDao userInfoDao = null; // � Ÿ���� ���� ����.
		
		if (dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracle(); 
		
		}
		else if (dbType.equals("MYSQL")) {  
			userInfoDao = new UserInfoMySqlDao();
		}
		else {
			System.out.println("db error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}