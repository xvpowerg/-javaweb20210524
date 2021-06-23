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
				System.out.println("開始工作!!");
				//長時間的工作!!
				TimeUnit.SECONDS.sleep(10);
				int max = ran.nextInt(Integer.MAX_VALUE);
				out.println("完成工作!!:"+max);
				//System.out.println("完成工作!!:"+max);
				//告知非同步完成了
				ctx.complete();	
			}catch(Exception ex) {
				System.out.println(ex);
			}	
	}
}
