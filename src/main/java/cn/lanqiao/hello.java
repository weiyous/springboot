package cn.lanqiao;
import org.apache.catalina.connector.InputBuffer;
import org.mybatis.spring.annotation.MapperScan;
import org.omg.CORBA.portable.InputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//包含了这三个注解:@SpringBootConfiguration
//1.SpringBootConfiguration,负责加载项目的核心配置文件
//2.@EnableAutoConfiguration:帮助SpringBoot应用将所有符合条件的
//@Configuration配置都加载到当前SpringBoot，并创建对应配置类的Bean，并把该Bean实体交给IoC容器进行管理。
//3.@ComponentScan:扫描被@Component (@Service,@Controller)注解的 bean，注解默认会扫描该类所在的包下所有的类。
@SpringBootApplication
@MapperScan(basePackages = {"cn.lanqiao.mapper"})//加入mapper扫描包
public class hello {
	public static void main(String[] args) {	
		SpringApplication.run(hello.class,args);	
	}
}
