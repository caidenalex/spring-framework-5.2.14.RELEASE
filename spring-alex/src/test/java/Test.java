import org.example.config.AppConfig;
import org.example.controller.UserController;
import org.example.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {

		UserController userController = new UserController();
		Class<? extends UserController> aClass = userController.getClass();
		Field[] declaredFields = aClass.getDeclaredFields();
		Stream.of(declaredFields).forEach(field -> {
			Annotation annotation = field.getAnnotation(Autowired.class);
			if(annotation != null ){
				field.setAccessible(true);
				Class<?> type = field.getType();
				try {
					Object o = type.newInstance();
					field.set(userController,o);
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}


			}


		});

		System.out.println(userController.getUserService());



	}
}
