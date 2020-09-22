package github.cdtft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : wangcheng
 * @date : 2020年01月24日 12:34
 */
public class CdtftApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		MyTestBean myTestBean = (MyTestBean) context.getBean("myTestBean");
		System.out.println(myTestBean);
	}
}
