package demo1;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
	//断言为真
	public static void isTrue(Boolean exp,String defaultMessage){
		if(!Boolean.TRUE.equals(exp)){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	//断言为假
	public static void isFalse(Boolean exp,String defaultMessage){
		if(!Boolean.FALSE.equals(exp)){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	
	//断言字符串必须有值
	public static void haslength(String exp,String defaultMessage){
		if(exp==null&&exp.length()==0){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	
	//断言字符串必须为空
	public static void hasNoLength(String exp,String defaultMessage){
		if(exp!=null&&exp.length()!=0){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	//断言Map集合不为空，没有元素也算空
	public static void mapNotNull(Map<?,?>map,String defaultMessage){
		if(map==null||map.size()==0){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	//断言List或Set集合不为空，没有元素也算空
	public static void collectionNotNull(Collection<?>col,String defaultMessage){
		if(col==null||col.size()==0){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	
	//断言字符串必须有值，去掉空格后，长度必须大于0
	public static void hasText(String src,String defaultMessage){
		if(!(src.trim().length()>0)){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
	
	//断言值必须是正数(值大于0)
	public static void absInt(int b,String defaultMessage){
		if(!(b>0)){
			throw new WeekRuntimeException(defaultMessage);
		}
	}
}
