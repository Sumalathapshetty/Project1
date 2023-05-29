package basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestMobile {
public static void main(String[] args) {
	ClassPathResource c=new ClassPathResource("ioc.xml");
	BeanFactory b= new XmlBeanFactory(c);
	Mobile m=(Mobile) b.getBean("mymobile");
	m.model();
	
	ApplicationContext a=new  ClassPathXmlApplicationContext("ioc.xml");
	Mobile m1=(Mobile) a.getBean("mymobile");
	m1.model();
}
}
