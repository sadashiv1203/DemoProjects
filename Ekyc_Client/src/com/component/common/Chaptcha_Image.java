package com.component.common;
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Chaptcha_Image extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Chaptcha_Image() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	public void chapcha(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		Random r=new Random();
		char c;
		char data[][]=new char[1][0];
		String chapta="";
		
		for(int i=0;i<6;i++)
		{
			if((r.nextInt()%3)==0)
			{
				do
				{
					c=(char)r.nextInt(125);
				}while((c<65||c>90)&&(c<97||c>122));
			}
			else
			{
				int x=r.nextInt(9)%10;
				c=(char)('0'+r.nextInt(9)%10);
			}
			
			chapta=chapta+c;
			data[0][i]=c;
		}
		
		int imageno=Math.abs(r.nextInt())%7;
		String image=new Integer(imageno).toString()+".png";
		BufferedImage buffer=ImageIO.read(Chaptcha_Image.class.getResource(image));
		Graphics2D g2d=buffer.createGraphics();
		g2d.setColor(new Color(33, 33, 33));
		
		int x=0;
		int y=0;
		for(int i=0;i<data[0].length;i++)
		{
			x+=15+(Math.abs(r.nextInt())%10);
			y=40;
			g2d.drawChars(data[0], i, 1, x, y);
		}
		
		g2d.dispose();
		response.setContentType("Image/png");
		OutputStream os=response.getOutputStream();
		ImageIO.write(buffer,"png",os);
		
		
		
	}

}
