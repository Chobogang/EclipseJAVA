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
		
		Properties prop = new Properties(); //파일 값 키와 밸류를 쌍으로 불러오는 행위
		prop.load(fis); // 불러온 것을 읽는 행위
		
		String dbType = prop.getProperty("DBTYPE"); //해당되는 밸류를 반환
		
		UserInfo userInfo = new UserInfo(); // 유저 생성
		userInfo.setUserId("12345"); 
		userInfo.setPasword("!@#$%^");
		userInfo.setUserName("Lee");
		
		UserInfoDao userInfoDao = null; // 어떤 타입을 쓸지 미정.
		
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
