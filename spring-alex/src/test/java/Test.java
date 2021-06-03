import org.example.config.AppConfig;
import org.example.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	@org.junit.Test
	public void test(){

		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
		UserDao userDao = applicationContext.getBean(UserDao.class);
		userDao.print();

	}
}
