package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.util.JMUtil;


/*
 * Copyright (C) 2010-2015 Jumei Inc.All Rights Reserved.
 * FileName：TestDriver.java
 * Description：
 * History：
 * 1.0 denverhan 2016-2-25 Create
 */

public class TestDriver
{

	public static void main(String[] args)
	{
		RogerRsp rsp = JSON.parseObject(RogerRsp.testCase, RogerRsp.class);
		System.out.println(JSON.toJSONString(rsp));


		String s = JMUtil.parseImageJson(Jmimg.a);
		System.out.println("s:" + s);

	}
}
