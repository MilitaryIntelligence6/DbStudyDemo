package cn.misection.dbstudy.configuration;

import cn.misection.dbstudy.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*实现WebMvcConfigurer接口，这个接口的方法都加了jdk1.8的 default方法修饰，不强制实现所有的方法，可以根据实际实现相关的方法。*/
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private LoginInterceptor loginInterceptor;

    /*springboot2.x把静态资源添加进来*/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    /*@Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/","/login","/log");
    }*/
}
