package com.spring.boot.mybatis.demo.controller;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.Random;

/**
 * @auther xuxq
 * @date 2019/2/13 19:13
 */
public class VerifyCode {

    private int w = 125;
    private int h = 55;
    private Random r = new Random();
    //字体设置
    private String[] fontNames = {"宋体","华文楷体","黑体","微软雅黑","楷体_GB3212"};
    //可选字符
    private String codes = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //背景色
    private Color bgColor = new Color(255,255,255);
    //验证码上的文本
    private String text;

    //生成随机的颜色
    private Color randomColor(){
        int red = r.nextInt(150);
        int green = r.nextInt(150);
        int blue = r.nextInt(150);
        return new Color(red, green, blue);
    }

    //生成随机字体
    private Font randomFont () {
        int index = r.nextInt(fontNames.length);
        //生成随机字体名称
        String fontName = fontNames[index];
        //生成随机的样式，0无样式，1粗体，2斜体，3粗体加斜体
        int style = r.nextInt(4);
        //随机生成字号，24-28
        int size = r.nextInt(5) + 26;
        //
        return new Font(fontName, style, size);
    }

    //画干扰线
    private void drawLine (BufferedImage image) {
        //画三条
        int num = 5;
        Graphics2D gp2 = (Graphics2D)image.getGraphics();
        for (int i = 0; i < num; i++) {
            int x1 = r.nextInt(w);
            int y1 = r.nextInt(h);
            int x2 = r.nextInt(w);
            int y2 = r.nextInt(h);
            gp2.setStroke(new BasicStroke(2.0F));
            gp2.setColor(Color.BLUE);
            gp2.drawLine(x1,y1,x2,y2);
        }
    }

    //接下来生成验证码
    private char randomChar () {
        int index = r.nextInt(codes.length());
        return codes.charAt(index);
    }

    //创建一个BufferedImage
    private BufferedImage createImage() {
        BufferedImage bufferedImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D gg2 = (Graphics2D)bufferedImage.getGraphics();
        gg2.setColor(this.bgColor);
        gg2.fillRect(0, 0, w, h);
        return bufferedImage;
    }

    //调用这个方法得到验证码
    public BufferedImage getImage () {
        //创建图片缓冲区
        BufferedImage image = createImage();
        //得到绘制环境
        Graphics2D gd2 = (Graphics2D)image.getGraphics();
        //用来装载生成的验证码文本
        StringBuilder builder = new StringBuilder();
        //向图片中画四个字符. 循环四次，每次生成一个字符
        for (int i = 0; i < 4; i++) {
            String s = randomChar() + "";//随机生成一个字符
            builder.append(s);
            float x = i * 1.0F * w / 4;
            gd2.setFont(randomFont());
            gd2.setColor(randomColor());
            gd2.drawString(s, x, h-5);
        }
        this.text = builder.toString();
        drawLine(image);
        return image;
    }

    //返回验证码图片上的文本
    public String getText () {
        return text;
    }
    //5.最后就是返回随机生成的验证码文本，并保存验证码图片，
    //保存图片到指定的输出流
    public static void output (BufferedImage image, OutputStream out) throws IOException {
        ImageIO.write(image, "jpg", out);
    }

    //6.接着，我们就可以进行测试了，这里定义了一个ImageTest测试类，在main函数中直接创建VerifyCode对象，调用相应方法就行
    public static void main(String[] args) throws FileNotFoundException, IOException {
        VerifyCode verifyCode = new VerifyCode();
        BufferedImage image = verifyCode.getImage();
        String path="D:/"+new Date().getTime()+".png";
        //保存到D盘
        VerifyCode.output(image, new FileOutputStream(path));
        //保存到项目根目录下
        VerifyCode.output(image, new FileOutputStream("verify_code.jpg"));
        System.out.println(verifyCode.getText());
    }


}
