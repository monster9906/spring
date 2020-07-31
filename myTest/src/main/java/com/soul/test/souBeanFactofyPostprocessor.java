package com.soul.test;

import com.soul.service.CityService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author 符浩灵
 * @date 2020/2/2 22:15
 */
//@Component
public class souBeanFactofyPostprocessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("testService");
		System.out.println("IN THE BEFORE OF BeanDefinition" +genericBeanDefinition.getBeanClassName());
		genericBeanDefinition.setBeanClass(CityService.class);
	}
}
