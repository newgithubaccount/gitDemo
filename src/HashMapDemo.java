package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	HashMap<Integer, String> map=new  HashMap<Integer, String>();
	
	public void addData()
	{
		map.put(1, "monika");
		map.put(2, "swapna");
		map.put(3, "sunitha");
		map.put(3, "yong");
		map.put(null,null);
		map.put(4, null);
	}
	
	public void readData()
	{
		for(Map.Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapDemo hashMapDemo=new HashMapDemo();
		hashMapDemo.addData();
		hashMapDemo.readData();
	}

}
