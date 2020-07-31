package com.soul.test;


import com.soul.config.Appconfig;
import com.soul.service.CityService;
import com.soul.service.TestService;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 符浩灵
 * @date 2020/2/2 21:20
 */
public class Test1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		/*String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}*/
		System.out.println(annotationConfigApplicationContext.getBean(CityService.class));

	}
}
