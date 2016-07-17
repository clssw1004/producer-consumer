package com.hulala.jmt.pc1.operation;

import com.hulala.jmt.pc1.pojo.ElectronicComponent;

public class DaMo extends Operation {

	@Override
	public void operation(ElectronicComponent ec) {
		ec.status("打磨");
	}

}
