package com.zhangluping.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.junit.Test;

import com.zhangluping.bean.AssertUtil;

public class MyTest {
	@Test
	public void fun1(){
		AssertUtil.isTrue(true,"这不是真的");
	}
	
	@Test
	public void fun2(){
		AssertUtil.isTrue(false,"这不是真的");
	}
	
	@Test
	public void fun3(){
		AssertUtil.isFalse(false,"这不是假的");
	}
	@Test
	public void fun4(){
	
		AssertUtil.isFalse(true,"这不是假的");
	}
	@Test
	public void fun5(){
		Object obj=new Object();
	AssertUtil.notNull(obj,"这个对象为空");
	}
	@Test
	public void fun6(){
		AssertUtil.notNull(null,"这个对象为空");
	}
	@Test
	public void fun7(){
		AssertUtil.isNull(null,"这个对象不为空");
	}
	@Test
	public void fun8(){
		Object obj=new Object();
		AssertUtil.isNull(obj,"这个对象不为空");
	}
	@Test
	public void fun9(){
		List<Integer> coll=new ArrayList<Integer>();
		coll.add(1);
		AssertUtil.notEmpty(coll,"这个集合是空的");
	}
	
	@Test
	public void fun10(){
		List<Integer> coll=new ArrayList<Integer>();
		AssertUtil.notEmpty(coll,"这个集合是空的");
	}
	
	@Test
	public void fun11(){
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "1703D");
		AssertUtil.mapNotEmpty(map,"这个集合是空的");
	}
	
	@Test
	public void fun12(){
		Map<Integer,String> map=new HashMap<Integer,String>();
		AssertUtil.mapNotEmpty(map,"这个集合是空的");
	}
	@Test
	public void fun13(){
		AssertUtil.hasText("nhhfj","这个字符串为空");
	}
	
	@Test
	public void fun14(){
		AssertUtil.hasText("","这个字符串为空");
	}
	@Test
	public void fun15(){
		AssertUtil.greaterThanZero(1,"这个数小于等于0");
	}
	@Test
	public void fun16(){
		AssertUtil.greaterThanZero(0,"这个数小于等于0");
	}

}
