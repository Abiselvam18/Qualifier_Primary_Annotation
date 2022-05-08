package com.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Samsung {
	@Autowired
	//@Qualifier("snapDragon")
	//@Qualifier("mediaTek")
	MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
public void config() {
	System.out.println("Octa core, 4GB Ram, 128Mp Camera");
	cpu.processor();
}
}
