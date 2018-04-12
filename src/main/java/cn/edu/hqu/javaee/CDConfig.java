package cn.edu.hqu.javaee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.edu.hqu.javaee.domain.cd.CompactDisc;
import cn.edu.hqu.javaee.domain.cd.impl.Albums;

@Configuration
public class CDConfig {
	
	@Bean
	public CompactDisc compactDisc() {
		return new Albums();
	}

}
