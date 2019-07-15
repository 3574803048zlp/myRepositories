package demo1;

public class DUtil {
	
	//断言为真
	public static void isTrue(boolean exp,String message){
		if(!Boolean.TRUE.equals(exp)){
			throw new DRuntimeException(message);
		}
	}
	//断言为假
	public static void isfalse(boolean exp,String message){
		if(!Boolean.FALSE.equals(exp)){
			throw new DRuntimeException(message);
		}
	}

}
