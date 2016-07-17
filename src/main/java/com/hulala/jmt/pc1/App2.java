package com.hulala.jmt.pc1;

import com.hulala.jmt.pc1.operation.DaMo;
import com.hulala.jmt.pc1.operation.HanJie;
import com.hulala.jmt.pc1.operation.Operation;
import com.hulala.jmt.pc1.operation.PaoGuang;
import com.hulala.jmt.pc1.operation.ZhiJian;
import com.hulala.jmt.pc1.pojo.ElectronicComponent;

public class App2 {
	public static void main(String[] args) {
		Operation damo = new DaMo();
		Operation paoguang = new PaoGuang();
		Operation hanjie = new HanJie();
		Operation zhijian = new ZhiJian();
		zhijian.doOperation(null);
		hanjie.doOperation(zhijian);
		paoguang.doOperation(hanjie);
		damo.doOperation(paoguang);
		for (int i = 0; i != 5; ++i) {
			damo.receive(new ElectronicComponent(i));
		}
	}

}
