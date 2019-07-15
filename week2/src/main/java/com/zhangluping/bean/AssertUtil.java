package com.zhangluping.bean;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
	
	//断言为真
	public static void isTrue(Boolean exp,String message){
		if(!Boolean.TRUE.equals(exp)){
			throw new RunntimeException(message);
		}
	}
	
	//断言为假
	public static void isFalse(Boolean exp,String message){
		if(!Boolean.FALSE.equals(exp)){
			throw new RunntimeException(message);
		}
	}
	
	//断言对象不为空
	public static void notNull(Object obj,String message){
		if(obj==null){
			throw new RunntimeException(message);
		}
	}

	//断言对象必须为空
	public static void isNull(Object obj,String message){
		if(obj!=null){
			throw new RunntimeException(message);
		}
	}
	
	//断言集合不为空
	public static void notEmpty(Collection<?> coll,String message){
		if(coll==null||coll.size()==0){
			throw new RunntimeException(message);
		}
	}
	//断言map集合不为空
		public static void mapNotEmpty(Map<?,?> map,String message){
			if(map==null||map.size()==0){
				throw new RunntimeException(message);
			}
		}
		
		//断言字符串必须有值 去掉空格
		public static void hasText(String exp,String message){
			if(exp==null||exp.trim().length()==0){
				throw new RunntimeException(message);
			}
		}
		//断言值必须大于0
		public static void greaterThanZero(int b,String message){
			if(!(b>0)){
				throw new RunntimeException(message);
			}
		}
}
