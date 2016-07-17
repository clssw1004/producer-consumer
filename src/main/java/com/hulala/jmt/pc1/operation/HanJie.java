package com.hulala.jmt.pc1.operation;

import com.hulala.jmt.pc1.pojo.ElectronicComponent;

public class HanJie extends Operation {
	@Override
	public void operation(ElectronicComponent ec) {
		ec.status("焊接");
	}
}
