package com.hulala.jmt.pc1.operation;

import com.hulala.jmt.pc1.pojo.BlockingQueue;
import com.hulala.jmt.pc1.pojo.ElectronicComponent;

public abstract class Operation {
	// 缓冲区
	public BlockingQueue<ElectronicComponent> queue;

	public Operation() {
		queue = new BlockingQueue<ElectronicComponent>();
	}

	public abstract void operation(ElectronicComponent ec);

	/**
	 * 数据接收
	 * 
	 * @param ec
	 */
	public void receive(ElectronicComponent ec) {
		queue.offer(ec);
	}

	public void doOperation(Operation oper) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				ElectronicComponent ec = null;
				while (true) {
					if ((ec = queue.poll()) != null) {
						operation(ec);
						if (null != oper)
							send(oper, ec);
					}
				}
			}
		});
		thread.setDaemon(false);
		thread.start();
	}

	/**
	 * 数据传送
	 * 
	 * @param oper
	 * @param ec
	 */
	public void send(Operation oper, ElectronicComponent ec) {
		oper.receive(ec);
	}
}
