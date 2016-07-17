package com.hulala.jmt.pc1.pojo;

public class ElectronicComponent {
	public int code;

	public ElectronicComponent(int code) {
		this.code = code;
	}
	public void status(String opertion)
	{
		System.out.println("编号：" + code  + "正在执行\"" + opertion +"\"操作");
	}
}
