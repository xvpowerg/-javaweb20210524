package tw.com.web;

import java.io.PrintWriter;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.servlet.AsyncContext;

public class AsyncObject {
	AsyncContext ctx; 
	AsyncObject(AsyncContext ctx ){
		this.ctx = ctx;
	}
	public void run() {
		Random ran = new Random();
		try{
			PrintWriter out =ctx.getResponse().getWriter();
				System.out.println("�}�l�u�@!!");
				//���ɶ����u�@!!
				TimeUnit.SECONDS.sleep(10);
				int max = ran.nextInt(Integer.MAX_VALUE);
				out.println("�����u�@!!:"+max);
				//System.out.println("�����u�@!!:"+max);
				//�i���D�P�B�����F
				ctx.complete();	
			}catch(Exception ex) {
				System.out.println(ex);
			}	
	}
}
