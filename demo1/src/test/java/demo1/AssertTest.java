package demo1;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class AssertTest {
	@Test
	public void fun1(){
		AssertUtil.isTrue(true, "这不是true");
	}
	@Test
	public void fun2(){
		AssertUtil.isFalse(false, "这不是false");
	}
	@Test
	public void fun3(){
		AssertUtil.hasNoLength("","这不是一个字符串");
	}
	@Test
	public void fun4(){
		AssertUtil.haslength("zhuhagi", "这是一个字符串");
	}
	@Test
	public void fun5(){
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(1);
		AssertUtil.collectionNotNull(arrayList,"这不是一个集合或者集合为空");
	}
	@Test
	public void fun6(){
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(5, "1703D");
		AssertUtil.mapNotNull(hashMap,"这不是一个map集合或者map集合为空");
	}
	@Test
	public void fun7(){
		AssertUtil.hasText("ihfihadif","这不是一个字符串");
	}
	@Test
	public void fun8(){
		AssertUtil.absInt(1,"这不是一个正数");
	}
}
