package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, 
	IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		// Class 를 가져오는 예시 1
		Class c1 = Class.forName("ch04.Person");
		
		Person person = (Person)c1.newInstance();
		person.setName("Lee");
		System.out.println(person);
		
		// Class 를 가져오는 예시 2
		Class c2 = person.getClass(); // 인스턴스가 이미 있는 상태에서 가능
		Person p = (Person)c2.newInstance();
		System.out.println(p);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = {"Kim"};
		Person KimPerson = (Person)cons.newInstance(initargs);
		System.out.println(KimPerson);
		
		// == 
		Person kim2 = new Person("Kim");
	}

}

