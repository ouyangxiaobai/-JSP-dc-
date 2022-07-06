package com.itbaizhan.orm;

/**
 * TOrder generated by MyEclipse Persistence Tools
 */

public class Torder implements java.io.Serializable
{

	private String id;//订单ID
	private String bianhao;//订单编号
	private String shijian;//下单时间
	private String zhuangtai;//订单状态
	
	private String huifu;//回复内容
	
	private String songhuodizhi;//送货地址
	private String fukuanfangshi;//付款方式
	private int jine=0;//总金额
	private String phone;//电话号码
	private String user_id;//用户ID

	

	/** 默认构造函数 */
	public Torder()
	{
	}

	public String getBianhao()//得到订单编号
	{
		return bianhao;
	}

	public void setBianhao(String bianhao)//设置订单编号
	{
		this.bianhao = bianhao;
	}

	public String getFukuanfangshi()//得到付款方式
	{
		return fukuanfangshi;
	}

	public void setFukuanfangshi(String fukuanfangshi)//设置付款方式
	{
		this.fukuanfangshi = fukuanfangshi;
	}


	public String getId()//得到订单ID
	{
		return id;
	}

	public void setId(String id)//设置订单ID
	{
		this.id = id;
	}

	public int getJine()//得到总金额
	{
		return jine;
	}

	public String getHuifu()//得到回复内容
	{
		return huifu;
	}

	public void setHuifu(String huifu)//设置回复内容
	{
		this.huifu = huifu;
	}

	public void setJine(int jine)//设置总金额
	{
		this.jine = jine;
	}


	public String getShijian()//得到下单时间
	{
		return shijian;
	}

	public void setShijian(String shijian)//设置下单时间
	{
		this.shijian = shijian;
	}

	public String getSonghuodizhi()//得到送货地址
	{
		return songhuodizhi;
	}

	public void setSonghuodizhi(String songhuodizhi)//设置送货地址
	{
		this.songhuodizhi = songhuodizhi;
	}


	public String getUser_id()//得到用户ID
	{
		return user_id;
	}

	public void setUser_id(String user_id)//设置用户ID
	{
		this.user_id = user_id;
	}

	public String getZhuangtai()//得到订单状态
	{
		return zhuangtai;
	}

	public void setZhuangtai(String zhuangtai)//设置订单状态
	{
		this.zhuangtai = zhuangtai;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}