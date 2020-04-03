package com.serviceMetro.Metro;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
@ComponentScan
public class Configuracion extends WsConfigurerAdapter {
	
	@Bean
	public XsdSchema metroSchema() {
		return new SimpleXsdSchema(new ClassPathResource("metro.xsd"));
	}
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext){
		  MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		  servlet.setApplicationContext(applicationContext);
		  servlet.setTransformWsdlLocations(true);
		  return new ServletRegistrationBean(servlet, "/ws/*");
	}
	  @Bean(name = "metro")
	  public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema metroSchema)
	  {
		  DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		  wsdl11Definition.setPortTypeName("metroPort");
		  wsdl11Definition.setLocationUri("/ws/metro");
		  wsdl11Definition.setTargetNamespace("http://www.uvMetro.me/metro");
		  wsdl11Definition.setSchema(metroSchema);
		  return wsdl11Definition;
	  }

}