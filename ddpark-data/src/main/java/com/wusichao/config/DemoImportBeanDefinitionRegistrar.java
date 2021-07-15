package com.wusichao.config;

import com.wusichao.service.DemoService;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

@Import(DemoImportBeanDefinitionRegistrar.class)
@Configuration
public class DemoImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        if (registry.containsBeanDefinition("inService")) {
            registry.registerBeanDefinition("demoService", new RootBeanDefinition(DemoService.class) {
            });
        }
    }
}
