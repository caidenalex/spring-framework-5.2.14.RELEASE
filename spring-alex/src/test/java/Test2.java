import org.example.config.AppConfig;
import org.example.dao.UserDao;
import org.example.dto.A;
import org.example.dto.B;
import org.example.dto.Student;
import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Test2 {
	public static void main(String[] args) {
		//ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
	/*	UserService bean = ap.getBean(UserService.class);
		bean.print();*/
		/*Map<String, String> getenv = System.getenv();
		System.out.println(getenv.get("path"));*/
		System.out.println("开始");
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("ApplicationContext.xml");


		/*Student student = (Student) applicationContext.getBean("student");
		System.out.println(student.toString());*/

		//A a = applicationContext.getBean(A.class);
		//B b = applicationContext.getBean(B.class);



	}
}
