package org.example.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;
@Component
public class customPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("beanFactory 的 后置处理......");
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		Stream.of(beanDefinitionNames).forEach(beanDefinitionName->{
			System.out.println(beanDefinitionName);
		});
	}
}
