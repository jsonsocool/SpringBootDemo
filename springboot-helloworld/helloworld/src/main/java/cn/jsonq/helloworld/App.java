package cn.jsonq.helloworld;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App {
	public static void main(String[] args) {

		System.out.println("Hello World!");
		ApplicationContext ctx = SpringApplication.run(App.class, args);

		String[] beans = ctx.getBeanDefinitionNames();
		Arrays.sort(beans);
		for (String bean : beans) {
			System.out.println(bean);
		}

	}
}
