package com.wei.strutsaction;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.result.StrutsResultSupport;

import com.opensymphony.xwork2.ActionInvocation;

import cn.dsna.util.images.ValidateCode;

public class CaptachResult extends StrutsResultSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width;
	

	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	@Override
	protected void doExecute(String arg0, ActionInvocation arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("正在执行doExecute方法...");
		ValidateCode code= new ValidateCode(width, 50, 4, 100);
		BufferedImage image=code.getBuffImg();
		HttpServletResponse response=ServletActionContext.getResponse();
		ImageIO.write(image, "jpeg", response.getOutputStream());
	}

}
